package Classes.Mathematic;

import java.util.Scanner;

public class Matrix {
    Scanner sc = new Scanner(System.in);
    private int[][] matrix;
    private int m;
    private int n;

    public Matrix(int m, int n)

    {
        this.m = m;
        this.n = n;
        this.matrix = new int[m][n];
    }



    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void initializeMatrix() {
        System.out.println("Podaj elementy macierzy: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }


    }

    public void printMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    public Matrix addMatrix(Matrix matrix2) {
        Matrix summary = new Matrix(m,n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                summary.getMatrix()[i][j] = this.matrix[i][j] + matrix2.getMatrix()[i][j];
            }

        }
        return summary;

    }

    public Matrix subMatrix(Matrix matrix3) {
        Matrix summary2 = new Matrix(m,n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                summary2.getMatrix()[i][j] = this.matrix[i][j] - matrix3.getMatrix()[i][j];
            }

        }
        return summary2;
    }
}

