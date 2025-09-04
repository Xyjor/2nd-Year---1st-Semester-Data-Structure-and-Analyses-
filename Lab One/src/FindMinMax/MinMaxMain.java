/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FindMinMax;

/**
 *
 * @author Xyjor
 */
public class MinMaxMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 22, 12, 32, 45, 99, 23, 66, 10};
        int[] Result = MinMaxMethod.MinMax(array);

        System.out.println("The Max value is: " + Result[0]);
        System.out.println("The Min value is: " + Result[1]);

    }

}
