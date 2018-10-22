/**
 * File Name: Flock.cs
 * 
 * Date: 06/01/2006
 *
 * Copyright (c) 2006 Michael LaLena. All rights reserved.  (www.lalena.com)
 * Permission to use, copy, modify, and distribute this Program and its documentation,
 *  if any, for any purpose and without fee is hereby granted, provided that:
 *   (i) you not charge any fee for the Program, and the Program not be incorporated
 *       by you in any software or code for which compensation is expected or received;
 *   (ii) the copyright notice listed above appears in all copies;
 *   (iii) both the copyright notice and this Agreement appear in all supporting documentation; and
 *   (iv) the name of Michael LaLena or lalena.com not be used in advertising or publicity
 *          pertaining to distribution of the Program without specific, written prior permission. 
 */

package esl.boids;

import java.util.Vector;
import java.awt.*;

/** 
 * This class represents the group of all birds, predators and obstacles.
 * It controls the coordinated movement of the birds and the detection,
 * separation logic.
 *
 * @author      Michael LaLena
 * @version     1.0
 */
class AFlock {
    // This is the list of birds in the map
    private Vector birds;
    
    // This is the range that birds will separate to avoid an object
    static int SeparationRange;
    // This is the range at which birds can detect an object
    static int DetectionRange;
    
    // This is the size of the map
    private static Dimension map = new Dimension( 500, 500 );
    
    /**
     * This is the flock contstructor.
     */
    AFlock()
    {
        birds = new Vector(40, 10);
    }
    
    /**
     * Add a bird to the flock.
     *
     * @param  bird The bird to add
     */
    public void addBird(Bird bird) {
        birds.addElement(bird);
    }
    
   /**
     * Remove a bird from the flock. One bird of the given color is removed.
     *
     * @param  color The color of the bird to remove
     */
    synchronized void removeBird(Color color) {
        for (int i=0; i < birds.size(); i++) {
            Bird bird = (Bird)birds.elementAt(i);
            if (bird.getColor() == color) {
                birds.removeElementAt(i);
                break;
            }
        }
    }
    
    /**
     * Set the settings for all birds of a given color.
     * Called either when the user changes a slider.
     *
     * @param  color The color of the bird to remove
     * @param  speed The new speed of the bird
     * @param  theta The new theta of the bird
     */
    public void setBirdParameters( Color color, int speed, int theta ) {
        for (int i=0; i < birds.size(); i++) {
            Bird bird = (Bird)birds.elementAt(i);
            // if the color of the bird matches, then set the values
            if (bird.getColor() == color) {
                bird.setSpeed( speed );
                bird.setMaxTurnTheta( theta );
            }
        }
    }
    
    /**
     * Set the hunger value for all predators
     *
     * @param  hunger The new hunger value for all predators
     */
    public void setHunger( int hunger ) {
        for (int i=0; i < birds.size(); i++) {
            Bird bird = (Bird)birds.elementAt(i);
            if (bird instanceof Predator ) {
                Predator p = (Predator) bird;
                p.setHunger( hunger );
            }
        }
    }
    
     /**
     * Set the new size of the area where 
     *
     * @param  otherBird The other bird to measure the distance between
     */
    static void setMapSize(Dimension newSize) {
        map = newSize;
    }
        
    /**
     * The display function simply draws each Bird in the vector based on 
     * its current position and direction (theta).
     */
    public void draw(Graphics g) {
        for (int i=0; i < birds.size(); i++) {
            Bird bird = (Bird)birds.elementAt(i);
            bird.draw(g);
        }
    }
    
    /**
     * Tells each Bird in the Vector to move in the direction of the generalHeading.
     *
     * @return  A vector of birds that were removed. This is used to update the
     *           sliders for the number of birds still on the map.
     */
    synchronized public Vector move() {
        boolean predatorIsFull = false;
        boolean ateBird = false;
        int movingBird = 0;
        int birdToEat = 0;
        
        Vector removedBirds = new Vector( 2, 1 );
        
        // Loop through each bird to move.
        // Done this way, because the vector can change in the loop
        while (movingBird < birds.size()) {
            predatorIsFull = false;
            ateBird = false;
            
            Bird bird = (Bird)birds.elementAt(movingBird);
            bird.move(generalHeading(bird));
            
            birdToEat = 0;

            // Loop through every other bird to see if we are at the same location.
            // A predator will eat other birds.
            // Any bird will eat food.
            // A bird will only eat one item per turn.
            while (birdToEat < birds.size()) {
                Bird otherBird = (Bird)birds.elementAt(birdToEat);
                
                // Are both birds at the same location (and it isn't the same bird)
                if ((movingBird != birdToEat) &&
                            (bird.getLocation().x > otherBird.getLocation().x - 2) &&
                            (bird.getLocation().x < otherBird.getLocation().x + 2) &&
                            (bird.getLocation().y > otherBird.getLocation().y - 2) &&
                            (bird.getLocation().y < otherBird.getLocation().y + 2)) {
                    
                    // If this bird is a predator and the other Bird is a normal bird
                    //  or is the other bird food
                    if (((bird instanceof Predator) && (otherBird.getClass().equals(Bird.class))) || (otherBird instanceof Food)) {
                        birds.removeElement(otherBird);
                        removedBirds.addElement(otherBird);
                        ateBird = true;

                        // If this bird is a predator, reduce its hunger
                        if (bird instanceof Predator) {
                            Predator predator = (Predator) bird;
                            predator.eatBird();

                            // Predator is full, so remove it from map
                            if (predator.getHunger() <= 0)
                            {
                                birds.removeElement(bird);
                                removedBirds.addElement(bird);
                                predatorIsFull = true;
                            }
                        }

                        break;
                    }
                }
                birdToEat++;
            }
            boolean ateBirdBeforeCurrent = ( ateBird ) && ( birdToEat < movingBird );
            if (ateBirdBeforeCurrent && predatorIsFull) {
                // removed a bird in front of us, so decrement the bird counter
                movingBird--;
            }
            else if (!ateBirdBeforeCurrent && !predatorIsFull) {
                 // can move counter, because no birds removed before us.
                 movingBird++;
            }
        }
        
        return removedBirds;
    }
    
    /**
     * Add two points together, scaling both according to their weight
     *
     * @param  p1 The first point to add
     * @param  w1 The weight of the first poitn
     * @param  p2 The second point to add
     * @param  w2 The weight of the second point
     */
    public Point sumPoints(Point p1, double w1, Point p2, double w2) {
        return new Point((int)(w1*p1.x + w2*p2.x), (int)(w1*p1.y + w2*p2.y));
    }
 
    /**
     * Distance from the top left of the map to a given point
     *
     * @param  p The point to measure the distance to.
     */
    public double sizeOfPoint(Point p) {
        return Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
    }
 
    /**
     * Normalize a point.
     *
     * @param  p The point to normalize.
     * @param  n The normalization value.
     */
    public Point normalisePoint(Point p, double n) {
        if (sizeOfPoint(p) == 0.0) {
            return p;
        }
        else {
            double weight = n / sizeOfPoint(p);
            return new Point((int)(p.x * weight), (int)(p.y * weight));
        }
    }
    
    /**
     * Sometimes, two birds are closer together if you go off one edge of the map
     * and return on the other. This function will convert the "other point" into
     * a point that closest to the point p, even if it is off the map.
     *
     * @param  p The point to measure the distance to.
     * @param  otherPoint The point to measure the distance from.
     */
    public Point closestLocation(Point p, Point otherPoint) {
        int dX = Math.abs(otherPoint.x - p.x);
        int dY = Math.abs(otherPoint.y - p.y);
        int x = otherPoint.x;
        int y = otherPoint.y;
        
        // now see if the distance between birds is closer if going off one
        // side of the map and onto the other.
        if ( Math.abs(map.width - otherPoint.x + p.x) < dX ) {
            dX = map.width - otherPoint.x + p.x;
            x = otherPoint.x - map.width;
        }
        if ( Math.abs(map.width - p.x + otherPoint.x) < dX ) {
            dX = map.width - p.x + otherPoint.x;
            x = otherPoint.x + map.width;
        }
        
        if ( Math.abs(map.height - otherPoint.y + p.y) < dY ) {
            dY = map.height - otherPoint.y + p.y;
            y = otherPoint.y - map.height;
        }
        if ( Math.abs(map.height - p.y + otherPoint.y) < dY ) {
            dY = map.height - p.y + otherPoint.y;
            y = otherPoint.y + map.height;
        }
        
        return new Point( x, y );
    }
 
    /** 
     * This function determines the direction a Bird will turn towards for this step.
     * The bird looks at every other bird and obstacle on the map to see if it is
     * within the detection range. Predator will move toward birds. Birds will
     * avoid birds of a different color and all obstacles.
     *
     * @param  bird The bird to get the heading for
     */
    private int generalHeading(Bird bird) {
        if ((bird instanceof Obstacle) || (bird instanceof Food)) {
            return 0;   // obstacles and food don't move
        }
        
        // Sum the location of all birds that are within our detection range
        Point target = new Point(0, 0);
        // Number of birds that are within the detection range
        int numBirds = 0;
        
        // Loop thorough each bird to see if it is within our detection range
        for (int i=0; i < birds.size(); i++) {
            Bird otherBird = (Bird)birds.elementAt(i);
            Point otherLocation = closestLocation(bird.getLocation(), otherBird.getLocation());
            
            // get distance to the other Bird. Note, this distance accounts for
            // the fact that the shortest path may be through the edge of the map
            int distance = bird.getDistance(otherLocation);
            
            if (!bird.equals(otherBird) && distance > 0 && distance <= DetectionRange)
            {
                /*
                 * If the other bird is the same color, the algorithm tells the
                 * bird to align its direction with the other Bird. If the distance
                 * between them differs from DetectionRange then a weighted forces
                 * is applied to move it towards that distance. This force is
                 * stronger when the birds are very close or towards the limit of detection.
                 */
                if (bird.getColor().equals(otherBird.getColor())) { // birds of same color attract
                    Point align = new Point((int)(100 * Math.cos(otherBird.getTheta() * Math.PI/180)),
                    (int)(-100 * Math.sin(otherBird.getTheta() * Math.PI/180)));
                    align = normalisePoint(align, 100); // alignment weight is 100
                    boolean tooClose = (distance < SeparationRange);
                    double weight = 200.0;
                    if (tooClose) {
                        weight *= Math.pow(1 - (double) distance / SeparationRange, 2);
                    }
                    else {
                        weight *= - Math.pow((double)( distance - SeparationRange ) / ( DetectionRange - SeparationRange ), 2);
                    }
                    Point attract = sumPoints(otherLocation, -1.0, bird.getLocation(), 1.0);
                    attract = normalisePoint(attract, weight); // weight is variable
                    Point dist = sumPoints(align, 1.0, attract, 1.0);
                    dist = normalisePoint(dist, 100); // final weight is 100
                    target = sumPoints(target, 1.0, dist, 1.0);
                }
                /*
                 * If this bird is a predator, and the other bird is a normal bird
                 * then there is again attraction, but the weight is fixed at 1.
                 */
                else if ((bird instanceof Predator) && (otherBird.getClass().equals(Bird.class))) {
                    Point dist = sumPoints(bird.getLocation(), -1.0, otherLocation, 1.0);
                    dist = normalisePoint(dist, 1000);
                    double weight = 1;
                    target = sumPoints(target, 1.0, dist, weight); // weight is variable
                }
                /*
                 * If the other bird is food, then there is attraction, for both
                 * birds and predators.
                 */
                else if (otherBird instanceof Food) {
                    Point dist = sumPoints(bird.getLocation(), -1.0, otherLocation, 1.0);
                    dist = normalisePoint(dist, 1000);
                    double weight = 1;
                    target = sumPoints(target, 1.0, dist, weight); // weight is variable
                }
                /*
                 * If the birds are a different color (or if the other bird is actually
                 * an obstacle, the bird is repulsed with a force that is weighted
                 * according to a distance square rule.
                 */
                else {
                    Point dist = sumPoints(bird.getLocation(), 1.0, otherLocation, -1.0);
                    dist = normalisePoint(dist, 1000);
                    double weight = Math.pow((1 - (double)distance/DetectionRange), 2);
                    target = sumPoints(target, 1.0, dist, weight); // weight is variable
                }
                numBirds++;
            }
        }
         // if no birds are close enough to detect, continue moving is same direction.
        if (numBirds == 0) {
            return bird.getTheta();
        }
        else { // average target points and add to position
            target = sumPoints(bird.getLocation(), 1.0, target, 1/(double)numBirds);
        }
        
        // Turn the target location into a direction in degrees
        int targetTheta = (int)(180/Math.PI * Math.atan2(bird.getLocation().y - target.y, target.x - bird.getLocation().x));
        // Make sure the angle is 0-360
        return (targetTheta + 360) % 360; // angle for Bird to steer towards
    }
}
