package cz.spsmb.lesson5th.utils;

public class ArrayUtils {

    /**
     * Metoda vygeneruje pole s random hodnotou.
     *
     * @param size - Velikost pole
     * @param min - Minimální hodnota
     * @param max - Maximální hodnota
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
     *
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
     *
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
     * @param min - Minimální hodnota
     * @param max - Maximální hodnota
     *
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

    public static int[][] generate(int width, int height, int min, int max){
        return null;
    }

    public static void arrayInt(int width, int height, String type){
        if(type == "object"){
            Object[][] objectArray = new Object[width][height];
        }
        else if (type == "int"){
            int[][] objectArray = new int[width][height];
        }
        else if (type == "char"){
            char[][] objectArray = new char[width][height];
        }
        else{
            System.out.println("Napsal jsi to špatně");
        }
    }

    public static void matice(int size){
        int[][] A = new int[size][size];
        int i =0;
        for (int positionX[]:A) {
            int i1 = 0;
            for (int positionY:positionX) {
                if (i1 == i){
                    A[i][i1] = 1;
                }
                else{
                    A[i][i1] = 0;
                }
                i1++;
            }
        i++;
        }
    }

    public static int[][] maticePlus (int[][] maticeA, int[][] maticeB, int height, int width){
        if (maticeA.length == maticeB.length){
            for (int výška[]:maticeA) {
                for (int vyska[]:maticeB) {
                    if (výška.length == vyska.length){
                        int i =0;
                        int[][] maticeC = new int[width][height];
                        for (int positionX[]:maticeA) {
                            int i1 =0;
                            for (int positionY:positionX) {
                                maticeC[i][i1] = maticeB[i][i1] + maticeA[i][i1];
                                i1++;
                            }
                            i++;
                        }
                        return maticeC;
                    }
                    return null;
                }
            }
    }
        return null;
    }
}
