# Matrix Calculator

A Java console application that performs matrix multiplication.

## Description

This program allows users to input two matrices (A and B) and calculates their product (C = A × B). It handles user input validation and provides meaningful error messages when invalid inputs are detected.

## Features

- Interactive console-based interface
- User-defined matrix dimensions
- Input validation for:
  - Matrix dimensions compatibility
  - Proper number of elements in each row
  - Numeric values
- Clear display of the resulting matrix
- Comprehensive error handling

## How to Use

1. Run the program
2. Enter the dimensions of matrix A (rows, columns)
3. Input the elements of matrix A row by row
4. Enter the dimensions of matrix B (rows, columns)
5. Input the elements of matrix B row by row
6. View the resulting matrix C

## Input Format

- Matrix dimensions should be entered as: `rows, columns` (e.g., `3, 2`)
- Matrix elements should be entered row by row, separated by spaces (e.g., `1 2 3`)

## Example

```
Provide matrix A dimensions (rows, columns)
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
```

## Mathematical Background

For matrix multiplication to be valid, the number of columns in matrix A must equal the number of rows in matrix B. The resulting matrix C will have dimensions: (rows of A) × (columns of B).

## Methods

- `multiplyMatrices(double[][] matrix_A, double[][] matrix_B)`: Performs matrix multiplication
- `displayMatrix(double[][] matrix)`: Prints a matrix to the console

## Error Handling

The program handles several types of exceptions:
- `NumberFormatException`: When non-numeric values are entered
- `IllegalArgumentException`: When matrix dimensions are incompatible or row element counts are incorrect
- General exceptions with appropriate error messages

## Requirements

- Java SE 8 or higher
