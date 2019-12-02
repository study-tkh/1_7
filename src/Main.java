import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Matrix2 matrix2 = new Matrix2();
    private static double[][] matrixOne = new double[2][2];
    private static double[][] matrixTwo = new double[2][2];
    private static double number;
    private static int numberOperation;

    public static void main(String[] args) {
        MatrixStart();
    }

    private static void MatrixStart() {
        try {
            do {
                welcome();
                inputNumOfOperation();
                operations();
            } while (true);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Что-то пошло не так.");
        }
    }

    private static void welcome() {
        System.out.println("1. Сумма матриц");
        System.out.println("2. Разность матриц");
        System.out.println("3. Умножение матрицы на число");
        System.out.println("4. Произведение матриц");
        System.out.println("5. Определитель матрицы");
        System.out.println("6. Обратная матрица");
        System.out.println("Введите номер операции");
    }

    private static void inputNumOfOperation() {
        numberOperation = scanner.nextInt();
    }

    private static void operations() {
        switch (numberOperation) {
            case 1 : {
                inputRequestMatrix(matrixOne, matrixTwo);
                matrix2.sumMatrix(matrixOne, matrixTwo);
                break;
            }
            case 2 : {
                inputRequestMatrix(matrixOne, matrixTwo);
                matrix2.diffMatrix(matrixOne, matrixTwo);
                break;
            }
            case 3 : {
                inputRequestMatrix(matrixOne);
                inputNumber();
                matrix2.multiplyMatrixByNumber(matrixOne, number);
                break;
            }
            case 4 : {
                inputRequestMatrix(matrixOne, matrixTwo);
                matrix2.matrixMultiplication(matrixOne, matrixTwo);
                break;
            }
            case 5 : {
                inputRequestMatrix(matrixOne);
                matrix2.matrixDeterminant(matrixOne);
                break;
            }
            case 6 : {
                inputRequestMatrix(matrixOne);
                matrix2.inverseMatrix(matrixOne);
                break;
            }
            default:
                System.out.println("Нет такого номера операции\n");
        }
    }

    private static void inputRequestMatrix(double[][] matrixOne) {
        System.out.println("Введите первую матрицу");
        inputMatrix(matrixOne);
    }

    private static void inputRequestMatrix(double[][] matrixOne, double[][] matrixTwo) {
        inputRequestMatrix(matrixOne);
        System.out.println("Введите вторую матрицу");
        inputMatrix(matrixTwo);
    }

    private static void inputMatrix(double[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }

    private static void inputNumber() {
        System.out.println("Введите число");
        number = scanner.nextDouble();
    }
}