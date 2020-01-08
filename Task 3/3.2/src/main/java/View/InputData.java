package View;

import java.util.Scanner;

public class InputData {
    public static int inputNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String getDepName() {
        System.out.println("print dep name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String getDepLocation() {
        System.out.println("print dep location");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getProductName() {
        System.out.println("print product name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
