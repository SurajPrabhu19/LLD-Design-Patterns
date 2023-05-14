public class EmailNotifier implements OrderPlacedSubscriber {

    public EmailNotifier() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void orderPlacedNotify() {
        try {
            triggerEmail();
        } catch (Exception e) {
            System.out.println(e);
        }
        // throw new UnsupportedOperationException("Unimplemented method
        // 'orderPlacedNotify'");
    }

    public void triggerEmail() throws InterruptedException {
        System.out.println("Sending Email");
        Thread.sleep(1);
        System.out.println("Sent Email to the user");
    }

}
