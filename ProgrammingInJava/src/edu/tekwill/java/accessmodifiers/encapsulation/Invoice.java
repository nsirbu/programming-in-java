package edu.tekwill.java.accessmodifiers.encapsulation;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class Invoice {

  private String partNumber;
  private String description;
  private int quantity;
  private double price;

  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    if (quantity > 0) {
      this.quantity = quantity;
    }
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price > 0) {
      this.price = price;
    }
  }

  /**
   * Calculates the invoice amount.
   *
   * @return
   */
  public double getInvoiceAmount() {
    return price * quantity;
  }

  @Override
  public String toString() {
    return "Invoice{" +
            "partNumber='" + partNumber + '\'' +
            ", description='" + description + '\'' +
            ", quantity=" + quantity +
            ", price=" + price +
            '}';
  }
}
