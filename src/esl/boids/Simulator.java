/**
 * File Name: Simulator.cs
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

import java.awt.*;
import java.applet.*;
import java.util.Vector;

/**
 * This class
 *
 * @author      Michael LaLena
 * @version     1.0
 */
public class Simulator extends java.applet.Applet implements Runnable {

    // This class holds the birds and controls their movement.
    AFlock flock;
    
    // Thread for moving the birds
    Thread thread;
    // Canvas that displays the birds moving around
    SimulatorCanvas canvas;
    // Panel containing all the sliders that control the birds
    Panel controls;
    
    // These are the upper limits for the sliders
    final int MAXIMUM_BIRDS = 50;
    final int MAXIMUM_SPEED = 30;
    final int MAXIMUM_HUNGER = 10;
    final int MAXIMUM_DISTANCE = 200;
    
    // These are the default values for the sliders, also used for a reset
    int DEFAULT_NUMBER_GREEN = 10;
    int DEFAULT_NUMBER_BLUE = 15;
    int DEFAULT_NUMBER_RED = 3;
    int DEFAULT_GREEN_THETA = 15;
    int DEFAULT_BLUE_THETA = 10;
    int DEFAULT_RED_THETA = 20;
    int DEFAULT_GREEN_SPEED = 5;
    int DEFAULT_BLUE_SPEED = 6;
    int DEFAULT_RED_SPEED = 7;
    int DEFAULT_RED_HUNGER = 3;
    int DEFAULT_OBSTACLE_SEPARATE = 30;
    int DEFAULT_OBSTACLE_DETECT = 60;
    
    // These are the values set by the sliders
    int numberOfGreenBirds;
    int numberOfBlueBirds;
    int numberOfRedPredators;
    int greenBirdSpeed;
    int blueBirdSpeed;
    int redPredatorSpeed;
    int greenBirdMaxTheta;
    int blueBirdMaxTheta;
    int redPredatorMaxTheta;
    int redPredatorHunger;
    int separateDistance;
    int detectDistance;
    
    // These are the scrollbar sliders themselves
    Scrollbar greenNumberBirdsScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar blueNumberBirdsScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar redNumberPredatorsScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar greenMaxThetaScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar blueMaxThetaScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar redMaxThetaScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar greenSpeedScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar blueSpeedScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar redSpeedScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar redHungerScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar detectScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar separateScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);

    // Top Title Bar
    Label titleLabel = new Label( "Flocking Simulator by Michael LaLena (www.lalena.com)" );
        
    // These are the labels on the sliders
    Label controlsLabel = new Label( "Controls" );
    Label blueLabel = new Label( "Blue Birds" );
    Label greenLabel = new Label( "Green Birds" );
    Label redLabel = new Label( "Red Predators" );
    Label speedLabel = new Label( "Speed" );
    Label turnLabel = new Label( "Max Turn" );
    Label numberBirdsLabel = new Label( "Number Birds" );
    Label redHungerLabel = new Label( "Predator Hunger" );
    Label detectLabel = new Label( "Detection Distance" );
    Label separateLabel = new Label( "Separate To Avoid Dist" );
    
    // The reset button
    Button resetButton = new Button( "Reset" );
    
    // Checking this checkbox will show the detect and separation ranges for each bird
    Checkbox showRangesCheckbox = new Checkbox( "Show Dist Ranges" );
    
    /**
     * This is the java init function.
     * This creates the canvas, the sliders, and the flock of birds.
     */
    public void init() {
        this.resize(500, 500);
        canvas = new SimulatorCanvas();
        canvas.simulator = this;
        controls = new Panel();
        addControls();
        resetValues();
        setLayout(new BorderLayout());
        titleLabel.setAlignment(Label.CENTER);
        add("Center", canvas);
        add("South", titleLabel);
        add("North", controls);
        canvas.requestFocus();
        Bird.setMapSize(canvas.getSize()); // set swarm boundaries
        AFlock.setMapSize(canvas.getSize());
    }
    
    /**
     * This will reset the user configurable parameters that control the birds.
     * It will reset the slider values and the flock object.
     */
    public void resetValues() {
        numberOfGreenBirds = DEFAULT_NUMBER_GREEN;
        numberOfBlueBirds = DEFAULT_NUMBER_BLUE;
        numberOfRedPredators = DEFAULT_NUMBER_RED;
        greenBirdMaxTheta = DEFAULT_GREEN_THETA;
        blueBirdMaxTheta = DEFAULT_BLUE_THETA;
        redPredatorMaxTheta = DEFAULT_RED_THETA;
        greenBirdSpeed = DEFAULT_GREEN_SPEED;
        blueBirdSpeed = DEFAULT_BLUE_SPEED;
        redPredatorSpeed = DEFAULT_RED_SPEED;
        redPredatorHunger = DEFAULT_RED_HUNGER;
        separateDistance = DEFAULT_OBSTACLE_SEPARATE;
        detectDistance = DEFAULT_OBSTACLE_DETECT;
        
        setControlValues();
        
        Bird.SeparationRange = separateDistance;
        Bird.DetectionRange = detectDistance;
        
        flock = new AFlock();
        
        AFlock.SeparationRange = separateDistance;
        AFlock.DetectionRange = detectDistance;
        
        for (int i=0; i < numberOfGreenBirds; i++) {
            Bird bird = new Bird(Color.green);
            bird.setSpeed( greenBirdSpeed );
            bird.setMaxTurnTheta( greenBirdMaxTheta );
            flock.addBird(bird);
        }
        for (int i=0; i < numberOfBlueBirds; i++) {
            Bird bird = new Bird(Color.blue);
            bird.setSpeed( blueBirdSpeed );
            bird.setMaxTurnTheta( blueBirdMaxTheta );
            flock.addBird(bird);
        }
        for (int i=0; i < numberOfRedPredators; i++) {
            Predator bird = new Predator();
            bird.setSpeed( redPredatorSpeed );
            bird.setMaxTurnTheta( redPredatorMaxTheta );
            bird.setHunger( redPredatorHunger );
            flock.addBird(bird);
        }
    }

    /**
     * This is the java applet start function.
     * It starts the thread that controls the brids.
     */
    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
    
    /**
     * This is the java applet stop function.
     * It stops the thread that controls the brids.
     */
    public void stop() {
        if (thread != null) {
            thread.stop();
            thread = null;
        }
    }
    
    /**
     * This is the java applet run function.
     * It loops forever moving the birds and predators, and controls the logic
     * when a bird or predator is removed.
     */
    public void run() {
        while (true) {
            Bird.setMapSize(canvas.getSize());
            AFlock.setMapSize(canvas.getSize());
            Vector removedBirds = flock.move();
            for ( int i = 0; i < removedBirds.size(); i++ ) {
                Bird bird = (Bird)removedBirds.elementAt(i);
                if ( bird.getColor().equals( Color.red )) {
                    numberOfRedPredators = redNumberPredatorsScrollbar.getValue() - 1;
                    redNumberPredatorsScrollbar.setValue( numberOfRedPredators );
                }
                else if ( bird.getColor().equals( Color.blue )) {
                    numberOfBlueBirds = blueNumberBirdsScrollbar.getValue() - 1;
                    blueNumberBirdsScrollbar.setValue( numberOfBlueBirds );
                }
                else if ( bird.getColor().equals( Color.green )) {
                    numberOfGreenBirds = greenNumberBirdsScrollbar.getValue() - 1;
                    greenNumberBirdsScrollbar.setValue( numberOfGreenBirds );
                }
            }
            
            canvas.validate();
            canvas.setVisible(true);
            canvas.repaint();
            canvas.invalidate();
            invalidate();
            repaint();
            this.repaint( canvas.getLocation().x, canvas.getLocation().y, canvas.getSize().width, canvas.getSize().height);
            
            try {
                Thread.sleep(20); // interval between steps
            } catch (InterruptedException e) {}
        }
    }

    /**
     * This event is fired when a user changes one of the panel parameters.
     *
     * @param  ev The event parameters
     */
    public boolean handleEvent(Event ev) { // check for control panel actions
        if (ev.target == greenNumberBirdsScrollbar) {
            if (greenNumberBirdsScrollbar.getValue() < numberOfGreenBirds ) {
                for ( int i = 0; i < numberOfGreenBirds - greenNumberBirdsScrollbar.getValue(); i++ ) {
                    flock.removeBird(Color.green);
                }
            }
            else {
                for ( int i = 0; i < greenNumberBirdsScrollbar.getValue() - numberOfGreenBirds; i++ ) {
                    Bird b = new Bird(Color.green);
                    b.setSpeed( greenBirdSpeed );
                    b.setMaxTurnTheta( greenBirdMaxTheta );
                    flock.addBird(b);
                }
            }
            numberOfGreenBirds = greenNumberBirdsScrollbar.getValue();
        }
        else if (ev.target == blueNumberBirdsScrollbar) {
            if (blueNumberBirdsScrollbar.getValue() < numberOfBlueBirds ) {
                for ( int i = 0; i < numberOfBlueBirds - blueNumberBirdsScrollbar.getValue(); i++ ) {
                    flock.removeBird(Color.blue);
                }
            }
            else {
                for ( int i = 0; i < blueNumberBirdsScrollbar.getValue() - numberOfBlueBirds; i++ ) {
                    Bird b = new Bird(Color.blue);
                    b.setSpeed( blueBirdSpeed );
                    b.setMaxTurnTheta( blueBirdMaxTheta );
                    flock.addBird(b);
                }
            }
            numberOfBlueBirds = blueNumberBirdsScrollbar.getValue();
        }
        else if (ev.target == redNumberPredatorsScrollbar) {
            if (redNumberPredatorsScrollbar.getValue() < numberOfRedPredators ) {
                for ( int i = 0; i < numberOfRedPredators - redNumberPredatorsScrollbar.getValue(); i++ ) {
                    flock.removeBird(Color.red);
                }
            }
            else {
                for ( int i = 0; i < redNumberPredatorsScrollbar.getValue() - numberOfRedPredators; i++ ) {
                    Predator b = new Predator();
                    b.setSpeed( redPredatorSpeed );
                    b.setMaxTurnTheta( redPredatorMaxTheta );
                    b.setHunger( redPredatorHunger );
                    flock.addBird(b);
                }
            }
            numberOfRedPredators = redNumberPredatorsScrollbar.getValue();
        }
        else if ((ev.target == greenSpeedScrollbar) || (ev.target == greenMaxThetaScrollbar)) {
            greenBirdSpeed = greenSpeedScrollbar.getValue();
            greenBirdMaxTheta = greenMaxThetaScrollbar.getValue();
            flock.setBirdParameters(Color.green, greenBirdSpeed, greenBirdMaxTheta);
            return true;
        }
        else if ((ev.target == blueSpeedScrollbar ) || (ev.target == blueMaxThetaScrollbar )) {
            blueBirdSpeed = blueSpeedScrollbar.getValue();
            blueBirdMaxTheta = blueMaxThetaScrollbar.getValue();
            flock.setBirdParameters(Color.blue, blueBirdSpeed, blueBirdMaxTheta);
        }
        else if ((ev.target == redSpeedScrollbar ) || (ev.target == redMaxThetaScrollbar ) || (ev.target == redHungerScrollbar )) {
            redPredatorSpeed = redSpeedScrollbar.getValue();
            redPredatorMaxTheta = redMaxThetaScrollbar.getValue();
            redPredatorHunger = redHungerScrollbar.getValue();
            flock.setBirdParameters(Color.red, redPredatorSpeed, redPredatorMaxTheta);
            flock.setHunger(redPredatorHunger);
        }
        else if (ev.target == detectScrollbar) {
            detectDistance = detectScrollbar.getValue();
            Bird.DetectionRange = detectDistance;
            AFlock.DetectionRange = detectDistance;
            if (detectDistance < separateDistance) {
                separateDistance = detectDistance;
                separateScrollbar.setValues(separateDistance, 1, 0, MAXIMUM_DISTANCE);
                Bird.SeparationRange = separateDistance;
                AFlock.SeparationRange = separateDistance;
            }
        }
        else if (ev.target == separateScrollbar) {
            separateDistance = separateScrollbar.getValue();
            Bird.SeparationRange = separateDistance;
            AFlock.SeparationRange = separateDistance;
            if (detectDistance <separateDistance) {
                detectDistance = separateDistance;
                detectScrollbar.setValues(detectDistance, 1, 0, MAXIMUM_DISTANCE);
                Bird.DetectionRange = detectDistance;
                AFlock.DetectionRange = detectDistance;
            }
        }
        else if (ev.target == resetButton) {
            resetValues();
        }
        else if (ev.target == showRangesCheckbox) {
            Bird.showRanges = showRangesCheckbox.getState();
        }
        else {
            return super.handleEvent(ev); // pass on unprocessed events
        }
        return true;
    }
    
    /**
     * This event is fired when a user clicks the applet. If the click is on the
     * canvas, then an obstacle is placed on the map.
     *
     * @param  ev The event parameters
     * @param  x The x coordinate of the mouse click.
     * @param  y The y coordinate of the mouse click. This is the mouse click
     *               position on the whole applet, not the canvas.
     */
    public boolean mouseDown(Event ev, int x, int y) {
        if (ev.modifiers == ev.META_MASK ) {
            if ( y > canvas.getLocation().y ) {
                flock.addBird(new Food( x, y - canvas.getLocation().y ));
                return true;
            }
        }
        else {
            if ( y > canvas.getLocation().y ) {
                flock.addBird(new Obstacle( x, y - canvas.getLocation().y ));
                return true;
            }
        }
        return false;
    }
    
    /**
     * Adds the slider and other controls to the panel.
     */
    public void addControls() {
        
        controls.setLayout( new GridLayout( 6, 4, 5, 5 ));
        controls.setBackground( new Color( 224, 224, 224 ));
        
        controlsLabel.setAlignment( Label.CENTER );
        greenLabel.setAlignment( Label.CENTER );
        blueLabel.setAlignment( Label.CENTER );
        redLabel.setAlignment( Label.CENTER );
        numberBirdsLabel.setAlignment( Label.RIGHT );
        speedLabel.setAlignment( Label.RIGHT );
        turnLabel.setAlignment( Label.RIGHT );
        redHungerLabel.setAlignment( Label.CENTER );
        detectLabel.setAlignment( Label.RIGHT );
        separateLabel.setAlignment( Label.RIGHT );

        controls.add(controlsLabel);
        controls.add(greenLabel);
        controls.add(blueLabel);
        controls.add(redLabel);
        controls.add( numberBirdsLabel);
        controls.add(greenNumberBirdsScrollbar);
        controls.add(blueNumberBirdsScrollbar);
        controls.add(redNumberPredatorsScrollbar);
        controls.add(speedLabel);
        controls.add(greenSpeedScrollbar);
        controls.add(blueSpeedScrollbar);
        controls.add(redSpeedScrollbar);
        controls.add(turnLabel);
        controls.add(greenMaxThetaScrollbar);
        controls.add(blueMaxThetaScrollbar);
        controls.add(redMaxThetaScrollbar);
        controls.add(resetButton);
        controls.add(detectLabel);
        controls.add(detectScrollbar);
        controls.add(redHungerLabel);
        controls.add(showRangesCheckbox);
        controls.add(separateLabel);
        controls.add(separateScrollbar);
        controls.add(redHungerScrollbar);
    }

    /**
     * Sets the values of the slider controls on the panel.
     */
    public void setControlValues() {
        greenNumberBirdsScrollbar.setValues( numberOfGreenBirds, 1, 0, MAXIMUM_BIRDS );
        blueNumberBirdsScrollbar.setValues( numberOfBlueBirds, 1, 0, MAXIMUM_BIRDS );
        redNumberPredatorsScrollbar.setValues( numberOfRedPredators, 1, 0, MAXIMUM_BIRDS );
        greenSpeedScrollbar.setValues( redPredatorSpeed, 1, 0, MAXIMUM_SPEED );
        blueSpeedScrollbar.setValues( blueBirdSpeed, 1, 0, MAXIMUM_SPEED );
        redSpeedScrollbar.setValues( redPredatorSpeed, 1, 0, MAXIMUM_SPEED );
        greenMaxThetaScrollbar.setValues( greenBirdMaxTheta, 1, 0, 180 );
        blueMaxThetaScrollbar.setValues( blueBirdMaxTheta, 1, 0, 180 );
        redMaxThetaScrollbar.setValues( redPredatorMaxTheta, 1, 0, 180 );
        detectScrollbar.setValues( detectDistance, 1, 0, MAXIMUM_DISTANCE );
        separateScrollbar.setValues( separateDistance, 1, 0, MAXIMUM_DISTANCE );
        redHungerScrollbar.setValues( redPredatorHunger, 1, 1, MAXIMUM_HUNGER );
    }
    
    public String getAppletInfo() {
	return "Flocking Simulator by Michael LaLena";
    }
    
    class SimulatorCanvas extends Canvas {

        // Image Object for the canvas
        Image canvasImage;
        // Graphics Object for the canvas
        Graphics canvasGraphics;
    
        // Reference back to the main applet, so we can get to the flock.
        Simulator simulator;
        
        /**
         * This is the java applet update function.
         * It calls paint directly. No need to reset anything first.
         */
        public synchronized void update(Graphics g) {
            paint(g);
        }

        /**
         * This is the java applet paint function.
         * It draws the birds on the map.
         */
        public synchronized void paint(Graphics g) {
            if (canvas.getWidth() == 0 ) {
                return;
            }
            if (( canvasImage == null ) ||
                        ( canvasImage.getWidth(this) != canvas.getWidth() ) ||
                        ( canvasImage.getHeight(this) != canvas.getHeight() )) {
                if ( canvasGraphics != null ) {
                    canvasGraphics.dispose();
                }
                canvasImage = createImage(canvas.getWidth(), canvas.getHeight());
                canvasGraphics = canvasImage.getGraphics();
            }

            if ( canvasGraphics != null ) {
                canvasGraphics.setColor(Color.white);
                canvasGraphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                simulator.flock.draw(canvasGraphics);
                canvas.getGraphics().drawImage(canvasImage, 0, 0, this);
            }
        }
    }
}
