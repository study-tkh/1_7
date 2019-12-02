class Matrix2 {
    private double[][] resultMatrix = new  double[2][2];
    private double result;


    void sumMatrix(double[][] matrixOne, double[][] matrixTwo) {
        countSumMatrix(matrixOne, matrixTwo);
        matrixEnumeration(resultMatrix);
    }

    void diffMatrix(double[][] matrixOne, double[][] matrixTwo) {
        countDiffMatrix(matrixOne, matrixTwo);
        matrixEnumeration(resultMatrix);
    }

    void multiplyMatrixByNumber(double[][] matrixOne, double number) {
        countMultiplyMatrixByNumber(matrixOne, number);
        matrixEnumeration(resultMatrix);
    }

    void matrixMultiplication(double[][] matrixOne, double[][] matrixTwo) {
        countMatrixMultiplication(matrixOne, matrixTwo);
        matrixEnumeration(resultMatrix);
    }

    void matrixDeterminant(double[][] matrix) {
        countMatrixDeterminant(matrix);
        System.out.println(result);
    }

    void inverseMatrix(double[][] matrix) {
        countInverseMatrix(matrix);
        matrixEnumeration(resultMatrix);
    }

    private void countSumMatrix(double[][] matrixOne, double[][] matrixTwo) {
        matrixZeroing(resultMatrix);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
    }

    private void countDiffMatrix(double[][] matrixOne, double[][] matrixTwo) {
        matrixZeroing(resultMatrix);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrixOne[i][j] - matrixTwo[i][j];
            }
        }
    }

    private void countMultiplyMatrixByNumber(double[][] matrixOne, double number) {
        matrixZeroing(resultMatrix);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrixOne[i][j] * number;
            }
        }
    }

    private void countMatrixMultiplication(double[][] matrixOne, double[][] matrixTwo) {
        matrixZeroing(resultMatrix);
        for (int i = 0; i < 2; i++) {
            resultMatrix[i][0] = matrixOne[i][0] * matrixTwo[0][0] + matrixOne[i][1] * matrixTwo[1][0];
            resultMatrix[i][1] = matrixOne[i][0] * matrixTwo[0][1] + matrixOne[i][1] * matrixTwo[1][1];
        }
    }

    private void countMatrixDeterminant(double[][] matrix) {
        result = matrix[0][0] * matrix[1][1] - (matrix[0][1] * matrix[1][0]);
    }

    private void countInverseMatrix(double[][] matrix) {
        matrixZeroing(resultMatrix);
        countMatrixDeterminant(matrix);
        resultMatrix[0][0] = matrix[1][1] / result;
        resultMatrix[0][1] = -matrix[0][1] / result;
        resultMatrix[1][0] = -matrix[1][0] / result;
        resultMatrix[1][1] = matrix[0][0] / result;
    }

    private void matrixZeroing(double[][] resultMatrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = 0;
            }
        }
    }

    private void matrixEnumeration(double[][] resultMatrix) {
        System.out.println("Ответ:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}