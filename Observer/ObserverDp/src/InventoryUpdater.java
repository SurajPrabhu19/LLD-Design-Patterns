public class InventoryUpdater implements OrderPlacedSubscriber {

    public InventoryUpdater() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void orderPlacedNotify() {
        try {
            updateInventory();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateInventory() throws InterruptedException {
        System.out.println("Updating Invetory");
        Thread.sleep(1);
        System.out.println("Updated Invetory");
    }
}
