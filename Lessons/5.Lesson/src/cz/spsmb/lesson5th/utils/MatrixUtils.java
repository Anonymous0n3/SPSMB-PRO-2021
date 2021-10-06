package cz.spsmb.lesson5th.utils;

public class MatrixUtils {

    public static void matice(int size) {
        int[][] A = new int[size][size];
        int i = 0;
        for (int[] positionX : A) {
            int i1 = 0;
            for (int positionY : positionX) {
                if (i1 == i) {
                    A[i][i1] = 1;
                } else {
                    A[i][i1] = 0;
                }
                i1++;
            }
            i++;
        }
    }

    public static int[][] maticePlus(int[][] maticeA, int[][] maticeB) {
        if (maticeA.length == maticeB.length) {
            int[] row0 = maticeA[0];
            int[] row1 = maticeB[0];
            int height = maticeA.length;
            int width = row1.length;
            if (row0.length == row1.length) {
                width = row1.length;
                int[][] maticeC = new int[width][height];
                for (int i = 0; i<maticeA.length; i++) {
                    for (int i1 = 0; i1 <row0.length; i1++) {
                        maticeC[i][i1] = maticeB[i][i1] + maticeA[i][i1];
                    }
                }
                return maticeC;
            }
        }
        return null;
    }
}
