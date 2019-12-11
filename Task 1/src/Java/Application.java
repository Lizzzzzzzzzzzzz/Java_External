package Java;

public class Application {
    public static void main(String[] args) {
        NumberTrans numberTrans = new NumberTrans();
        numberTrans.decimalToBinary(8);
        numberTrans.decimalToHex(4);
        numberTrans.decimalToEight(9);
        Pyramid.showPyramid(Pyramid.makePyramid(7));
        PerfectNums.printPerfectNumbers(9000);
        MatrixTurn.launch(); }
}
