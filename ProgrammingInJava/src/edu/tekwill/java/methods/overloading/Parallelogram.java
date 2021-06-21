package edu.tekwill.java.methods.overloading;

/**
 * @author nsirbu
 * @since 17.06.2021
 */
public class Parallelogram {

  int calculateArea(int width, int height) {
    return width * height;
  }

  int calculateArea(int sideLength) {
    return sideLength * sideLength;
  }

  int calculatePerimeter(int width, int height) {
    return 2 * width + 2 * height;
  }

  int calculatePerimeter(int sideLength) {
    return sideLength * 4;
  }
}
