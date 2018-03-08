/*
 * Caleb Hinderle
 * AreaOfCircle.java
 * This calculates the area of a circle
 * 27/02/2018
 */

package areaofacircle;

/**
 *
 * @author cahin7692
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15.0;
        double pi = 3.14;
        double area =0.0;
        //algorithm for area calculation
        area= pi * radius * radius;
         System.out.println("The area to a circle with the diameter of " + radius + " is " + area + "cm squared");
    }
    
}
