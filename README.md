A command-line Java application that performs matrix multiplication between two user-provided matrices.
Description
This application allows users to input two matrices of compatible dimensions and calculates their product.
It features robust input validation, error handling, and a clean display of the resulting matrix.
Features

✅ Interactive command-line interface
✅ Support for matrices of any valid dimension
✅ Input validation to ensure matrices can be multiplied (columns of A = rows of B)
✅ Error handling for invalid inputs
✅ Clean display of the resulting matrix

Installation
bashCopy# Clone the repository
git clone https://github.com/yourusername/matrix-multiplication.git

# Navigate to the project directory
cd matrix-multiplication

# Compile the Java code
javac Main.java
Usage
bashCopy# Run the program
java Main
Follow the prompts to:

Enter the dimensions of matrix A
Input the elements of matrix A
Enter the dimensions of matrix B
Input the elements of matrix B

The program will calculate and display the resulting matrix C.
Example
CopyProvide matrix A dimensions (rows, columns)
2, 3
Enter matrix A elements (row by row)
1 2 3
4 5 6
Provide matrix B dimensions (rows, columns)
3, 2
Enter matrix B elements (row by row)
7 8
9 10
11 12

Matrix C:
|58 64|
|139 154|
Implementation Details

Uses nested loops for matrix multiplication with time complexity O(n³)
Implements proper resource management with try-with-resources for Scanner
Displays integers without decimal places for cleaner output

Future Improvements

Add support for file input/output
Implement more efficient matrix multiplication algorithms
Add options for other matrix operations (addition, subtraction, determinant)
Improve display formatting for decimal values


Author
Your Name - Buntu william