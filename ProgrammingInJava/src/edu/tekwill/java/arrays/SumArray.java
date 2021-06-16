package edu.tekwill.java.arrays;

import java.util.Arrays;

/**
 * @author nsirbu
 * @since 16.06.2021
 */
public class SumArray {
  public static void main(String[] args) {
    double[] prices = {3.4, 5, 6.5, 9};

    double sum = 0;
//    for (double price : prices) {
//      sum += price;
//    }
//
//    System.out.println(sum);

    double[][] matrix = {{3.4, 5}, {6.5, 9}};
//    for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
//      for (int colIndex = 0; colIndex < matrix[rowIndex].length; colIndex++) {
//        sum += matrix[rowIndex][colIndex];
//      }
//    }

    for (double[] row : matrix) {
      System.out.println(Arrays.toString(row));
      for (double value : row) {
        sum += value;
      }
    }

    System.out.println(sum);
  }
}
