package edu.tekwill.java.interfaces.movableshapes;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class MovableApp {
  public static void main(String[] args) {
    Circle someCircle = new Circle(new Point(3, 3), 5);
    Rectangle someRectangle = new Rectangle(new Point(5, 5), 2, 3);
    Triangle someTriangle = new Triangle(new Point(0, 3), new Point(2, 0), new Point(-2, 0));

//    System.out.println(someCircle);
//    someCircle.moveUp(4);
//    System.out.println(someCircle);
//
//    System.out.println(someRectangle);
//    someRectangle.moveRight(2);
//    System.out.println(someRectangle);
//
//    System.out.println(someTriangle);
//    someTriangle.moveLeft(4);
//    System.out.println(someTriangle);

//    IMovable circleOne = new Circle(new Point(3, 3), 5);
//    circleOne.moveLeft(4);
//
//    Polygon rectangleOne = new Rectangle(new Point(5, 5), 2, 3);
//    IMovable rectangleTwo = new Rectangle(new Point(5, 5), 2, 3);
//
//    Polygon triangleOne = new Triangle(new Point(0, 3), new Point(2, 0), new Point(-2, 0));
//    IMovable triangleTwo = new Triangle(new Point(0, 3), new Point(2, 0), new Point(-2, 0));


    ArrayList<Polygon> selectedShapes = new ArrayList<>();
    selectedShapes.add(someRectangle);
    selectedShapes.add(someTriangle);

    System.out.println(someRectangle);
    System.out.println(someTriangle);

    for (IMovable shape : selectedShapes) {
      shape.moveLeft(4);
    }

    System.out.println(someRectangle);
    System.out.println(someTriangle);
  }
}
