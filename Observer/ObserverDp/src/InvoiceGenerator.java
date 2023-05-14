public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void orderPlacedNotify() {
        try {
            generateInvoice();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void generateInvoice() throws InterruptedException {
        System.out.println("Generating Invoice");
        Thread.sleep(1);
        System.out.println("Generated Invoice");
    }
}
