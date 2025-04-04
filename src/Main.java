import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Provide matrix A dimensions (rows, columns)");
            String[] dimensions_A = input.nextLine().split(",");
            int rows_A = Integer.parseInt(dimensions_A[0].trim());
            int columns_A = Integer.parseInt(dimensions_A[1].trim());

            double[][] matrix_A = new double[rows_A][columns_A];
            System.out.println("Enter matrix A elements (row by row)");

            for (int i = 0; i < rows_A; i++) {
                String[] rowElements = input.nextLine().trim().split("\\s+");
                if (rowElements.length != columns_A) {
                    throw new IllegalArgumentException("Invalid number of elements in row " + (i + 1));
                }
                for (int j = 0; j < columns_A; j++) {
                    matrix_A[i][j] = Double.parseDouble(rowElements[j]);
                }
            }


            System.out.println("Provide matrix B dimensions (rows, columns)");
            String[] dimensions_B = input.nextLine().split(",");
            int rows_B = Integer.parseInt(dimensions_B[0].trim());
            int columns_B = Integer.parseInt(dimensions_B[1].trim());

            if (columns_A != rows_B) {
                throw new IllegalArgumentException("Matrices cannot be multiplied. Number of columns in A must be equal to number of rows in B");
            }

            double[][] matrix_B = new double[rows_B][columns_B];
            System.out.println("Enter matrix B elements (row by row)");

            for (int i = 0; i < rows_B; i++) {
                String[] rowElements = input.nextLine().trim().split("\\s+");
                if (rowElements.length != columns_B) {
                    throw new IllegalArgumentException("Invalid number of elements in row " + (i + 1) + " in matrix B");
                }
                for (int j = 0; j < columns_B; j++) {
                    matrix_B[i][j] = Double.parseDouble(rowElements[j]);
                }
            }

            // perform multiplication
            double[][] matrix_C = multiplyMatrices(matrix_A, matrix_B);

            // display the results
            System.out.println("\nMatrix C:");
            dipalyMatrix(matrix_C);


        } catch (NumberFormatException e) {
            System.out.println("Please enter numeric values");
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid size" + " " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong" + " " + e.getMessage());
        }




    }


    public static double[][] multiplyMatrices(double[][] matrix_A, double[][] matrix_B){
        int rows_A = matrix_A.length;
        int columns_A = matrix_A[0].length;
        int columns_B = matrix_B[0].length;

        double[][] matrix_C = new double[rows_A][columns_B];

        for(int i=0; i<rows_A; i++){
            for(int j=0; j<columns_B; j++){
                for(int k=0; k<columns_A; k++){
                    matrix_C[i][j] += matrix_A[i][k] * matrix_B[k][j];
                }
            }
        }

        return matrix_C;
    }

    public static void dipalyMatrix(double[][] matrix){

        for(int i=0; i<matrix.length; i++){
            System.out.print("|");
            for(int j=0; j<matrix[0].length; j++){
                System.out.print((int)matrix[i][j]+" ");
            }
            System.out.println("|");
        }

    }
}