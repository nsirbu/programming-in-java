package edu.tekwill.java.accessmodifiers.encapsulation;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class InvoiceApp {
  public static void main(String[] args) {
    Invoice invoice = new Invoice();
    System.out.println(invoice);

    invoice.setPrice(-123);
    System.out.println(invoice);

    invoice.setPrice(56);
    System.out.println(invoice);

    invoice.getInvoiceAmount();

  }
}
