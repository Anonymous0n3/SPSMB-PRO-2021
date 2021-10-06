package cz.spsmb.lesson5th;

public class Application {

    public static void main(String[] args) {
        int size = 3;
        int[][] A = {
                {
                    1, 2, 3, 4
                },
                {
                    1, 2, 3, 4
                },
                {
                        1, 2, 3, 4
                }
        };
        int[][] B = {
                {
                        1, 2, 3
                },
                {
                        1, 2, 3
                },
                {
                        1, 2, 3
                }
        };
        cz.spsmb.lesson5th.utils.ArrayUtils.maticePlus(A, B, 3, 3);
    }
}