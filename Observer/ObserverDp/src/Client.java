public class Client {

    public static void main(String args[]) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailNotifier emailNotifier = new EmailNotifier();
        InventoryUpdater invertoryUpdater = new InventoryUpdater();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        flipkart.orderPlaced();

    }

}
