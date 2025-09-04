/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FindMinMax;

/**
 *
 * @author Xyjor
 */
public class MinMaxMethod {

    public static int[] MinMax(int[] array) {

        int max = array[0], min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return new int[]{max, min};

    }

}
