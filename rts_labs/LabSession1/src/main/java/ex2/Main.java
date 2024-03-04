package ex2;

public class Main {
    public static void main(String []args){
        int [][] matrix1 = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};
        int [][] matrix2 = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};

        int [][] result1 = new int[3][3];
        int [][] result2 = new int[3][3];

//        addition of matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result1[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

//        multiplication of matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result2[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        printMatrix(result1);
        printMatrix(result2);


    }
    public static void printMatrix(int [][]matrix) {
        String s = new String("The output is: \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s += Integer.toString(matrix[i][j]);
                s += " ";
            }
            s += "\n";
        }
        System.out.println(s);
    }

}
