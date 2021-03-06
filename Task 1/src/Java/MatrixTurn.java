package Java;

import java.util.Random;
import java.util.Scanner;

public class MatrixTurn {
    public static void launch(){

        System.out.println("Введите размер матрицы");
        Scanner in = new Scanner(System.in);
        int capacity = in.nextInt();

        int[][] matrix = createNotEmpty(capacity);
        System.out.println("\n");
        showMatrix(matrix);
        System.out.println("\n");
        showMatrix(minusNintyDegrees(matrix));
    }
    public static int[][] createNotEmpty(int capacity){
        int[][] result = new int[capacity][capacity];
        Random rand = new Random();

        for(int i = 0; i < capacity; i++){
            for(int j = 0; j < capacity; j++){
                result[i][j] = rand.nextInt(99);
            }
        }

        return result;
    }

    public static int[][] minusNintyDegrees(int[][] oldMatrix){
        int[][] newMatrix = new int[oldMatrix.length][oldMatrix.length];

        for(int i = 0, l = 0; i < oldMatrix.length; i++, l++){
            for(int j = 0, k = oldMatrix.length - 1; j < oldMatrix[i].length; j++, k--){
                newMatrix[k][l] = oldMatrix[i][j];
            }
        }

        return newMatrix;
    }

    public static void showMatrix(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if(array[i][j] < 10)
                    System.out.print(" ");
                System.out.print(" ");
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
