/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcs2;

import java.text.DecimalFormat;

/**
 *
 * @author NM-Demabildo
 */
public class Exrcs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fx = 0.0, root = 0.0, checkk = 0;

        DecimalFormat formater = new DecimalFormat("0.000000000");
        for (double x = 0; x > -10; x = x - 0.0001) {

            fx = Math.pow(x, 12) + (7 * (Math.pow(x, 5)) - (2 * Math.pow(x, 4)) - (8 * Math.pow(x, 2)) + 10);
            System.out.println("f(" + x + ") = " + String.format("%.12f", fx));
            if (fx<0) {
                root = x;
                x = -10;
            }
            /* if (Math.abs(fx)<0.0001) {
            root = x;
            x = -10;
            }*/
        }
        System.out.println("\nroot = " + String.format("%.12f", root));
    }

}
