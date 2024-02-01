/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiuscalc;
import java.util.Scanner;

public class RadiusCalc {
    /**
     * @param args the command line arguments
     */
    // carry out calculations for circular items
    // such as a circle, a sphere, a cone, a column
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a column (pi r^2 h)");
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();

        // Fixed: Moved scanner object to methods to avoid scope issues
        switch (i) {
            case 1:
                cCalc();
                break;
            case 2:
                sCalc();
                break;
            case 3:
                cCalc2();
                break;
            case 4:
                cCalc3();
                break;
            default:
                System.out.println("Invalid option. Please enter a number between 1 and 4.");
                break;
        }
    }

    public static void cCalc3() {
        Scanner s = new Scanner(System.in); // Added scanner here
        System.out.println("Enter the radius of your column, then height of your column");
        int r = s.nextInt();
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h; // Fixed calculation for volume of a column
        System.out.println("Volume of the column: " + result);
    }

    public static void cCalc2() {
        Scanner s = new Scanner(System.in); // Added scanner here
        System.out.println("Enter the radius of your cone, then height of your cone");
        int r = s.nextInt();
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h / 3; // Fixed calculation for volume of a cone
        System.out.println("Volume of the cone: " + result);
    }

    public static void cCalc() {
        Scanner s = new Scanner(System.in); // Added scanner here
        System.out.println("Enter the radius of your circle");
        int r = s.nextInt();
        double result = Math.PI * Math.pow(r, 2); // Fixed calculation for area of a circle
        System.out.println("Area of the circle: " + result);
    }

    public static void sCalc() {
        Scanner s = new Scanner(System.in); // Added scanner here
        System.out.println("Enter the radius of your sphere");
        int r = s.nextInt();
        double result = 4.0 / 3 * Math.PI * Math.pow(r, 3); // Fixed calculation for volume of a sphere
        System.out.println("Volume of the sphere: " + result);
    }
}
