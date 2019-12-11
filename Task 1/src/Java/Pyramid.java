package Java;

public class Pyramid {

    public static void showPyramid(int[][] pyramid) {
        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
                if (pyramid[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(pyramid[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static int[][] makePyramid(int floors) {
        int[][] pyramid = new int[floors][floors * 2 - 1];
        int widthValue = floors;
        int upperFloor = floors;

        for (int row = floors - 1; row >= 0; row--) {
            for (int columnL = floors - 1, columnR = floors - 1; widthValue != 0; columnL--, columnR++) {
                pyramid[row][columnL] = widthValue;
                pyramid[row][columnR] = widthValue;
                widthValue--;
            }
            widthValue = --upperFloor;
        }

        return pyramid; }
}
