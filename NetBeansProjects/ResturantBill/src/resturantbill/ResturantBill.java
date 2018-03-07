/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resturantbill;
import java.text.*;
/**
 *
 * @author cahin7692
 */
public class ResturantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double HST, meal, total;
        HST = 0.13;
        meal = 19.99;
        total = 0;
        
        DecimalFormat x = new DecimalFormat("$###.##");
        //calculations
        total = meal*HST+meal;
        
        System.out.println("Resturant Bill\n**************\n\nMeal\t"+ (x.format(meal)));
        System.out.println("HST\t"+ (x.format(HST)));
        System.out.println("Total\t"+ (x.format(total)));        
    }
    
}
