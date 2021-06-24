//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package edu.tekwill.java.interfaces.movableshapes;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class Rectangle extends Polygon {

  public Rectangle(Point topRightCorner, int width, int height) {
    Point topLeftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY());
    Point bottomLeftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY() - height);
    Point bottomRightCorner = new Point(topRightCorner.getX(), topRightCorner.getY() - height);

    vertices.add(topRightCorner);
    vertices.add(topLeftCorner);
    vertices.add(bottomLeftCorner);
    vertices.add(bottomRightCorner);
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "vertices=" + vertices +
            '}';
  }
}
