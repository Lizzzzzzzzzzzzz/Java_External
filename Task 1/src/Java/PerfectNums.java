package Java;

public class PerfectNums {

    public static void printPerfectNumbers(int maxRangeNum) {
        int i, j, s;
        for (i = 2; i < 10000; i++) {
            s = 0;
            for (j = 1; j < i; j++)
                if (i % j == 0)
                    s += j;
            if (s == i) {
                System.out.println(i); }
        }
    }
}
