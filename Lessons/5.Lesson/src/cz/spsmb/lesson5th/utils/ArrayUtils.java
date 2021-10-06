package cz.spsmb.lesson5th.utils;

import java.util.ArrayList;

public class ArrayUtils {

    /**
     * Metoda vygeneruje pole s random hodnotou.
     *
     * @param size - Velikost pole
     * @param min  - Minimální hodnota
     * @param max  - Maximální hodnota
     * @return - Pole s náhodnými hodnoty
     */
    public static int[] generate(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            //array[i] = cz.spsmb.lesson5th.utils.MathUtils.randomNumber(min, max);
        }
        return array;
    }

    /**
     * Výpis jednorozměrného pole do terminálu
     *
     * @param array
     */
    public static void print(int[] array) {
        System.out.print("[");
        boolean first = true;
        for (int item : array) {
            if (first) {
                first = !first;
            } else {
                System.out.print(", ");
            }
            System.out.print(item);
        }
        System.out.println("]");
    }

    /**
     * Součet celého pole
     *
     * @param array
     * @return - součet celého pole
     */
    public static int sum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    /**
     * Průměrná hodnota pole
     *
     * @param array
     * @return
     */
    public static double avg(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return sum(array) / (double) array.length;
    }

    /**
     * Metoda vygeneruje seřazené pole s random hodnotou.
     *
     * @param size - Velikost pole
     * @param min  - Minimální hodnota
     * @param max  - Maximální hodnota
     * @return - Pole s random hodnotou
     */
    public static int[] generateSortedArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            min = MathUtils.randomNumber(min, max);
            array[i] = min;
        }
        return array;
    }

    public static int[][] generate(int width, int height, int min, int max) {
        return null;
    }

    public static void arrayInt(int width, int height, String type) {
        if (type == "object") {
            Object[][] objectArray = new Object[width][height];
        } else if (type == "int") {
            int[][] intArray = new int[width][height];
        } else if (type == "char") {
            char[][] charArray = new char[width][height];
        } else {
            System.out.println("Napsal jsi to špatně");
        }
    }

    public static int[] fibonacci (int size){
        int[] fibonacciSequence = new int[size];
        fibonacciSequence[0] = 1;
        fibonacciSequence[1] = 1;
        for (int i = 2; i <size; i++){
            fibonacciSequence[i] = fibonacciSequence[i-2] + fibonacciSequence[i-1];
        }
        return fibonacciSequence;
    }

    public static void czFlag (int height, int width){
        int[][] flag = new int[height][width];
        for (int i = 0;i<height/2; i++){
            for (int i1 = 0; i1<= i; i1++){
                flag[i][i1] = 2;
            }

        }

        for (int i = height/2; i<height; i++){
            for (int i1 = 0; i1<width;i1++){
                flag[i][i1] = 1;
            }
        }
            int downHalf = height/2 + 3;
        for (int i = height/2;i<height; i++){
            for (int i1 = 0; i1<= downHalf; i1++){
                flag[i][i1] = 2;
                downHalf--;
            }

        }
    }
}
