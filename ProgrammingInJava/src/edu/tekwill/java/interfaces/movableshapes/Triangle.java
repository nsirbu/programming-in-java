//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package edu.tekwill.java.interfaces.movableshapes;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class Triangle extends Polygon {

  public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
    vertices.add(cornerOne);
    vertices.add(cornerTwo);
    vertices.add(cornerThree);
  }

  @Override
  public String toString() {
    return "Triangle{" +
            "vertices=" + vertices +
            '}';
  }
}
