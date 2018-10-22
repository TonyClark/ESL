/*
 * File Name: Food.cs
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

/**
 * This food class represents a food item on the map that all birds, including
 * predators want to eat.
 *
 * @author      Michael LaLena
 * @version     1.0
 */
class Food extends Bird {
    /**
     * This is the constructor for the food.
     *
     * @param  x The X coordinate of the Food
     * @param  y The Y coordinate of the Food
     */
    Food(int x, int y)
    {
        super(x, y, 0, Color.magenta); 
    }

    /**
     * The food class overrides the move function to do nothing.
     *
     * @param    angle   not used
     */
    public void move(int angle)
    {
        // food does not move
    }

    /**
     * Draws the Food as a simple circle
     *
     * @param    g   The graphics to draw the food on
     */
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(location.x-3, location.y-3, 6, 6);
    }
}
