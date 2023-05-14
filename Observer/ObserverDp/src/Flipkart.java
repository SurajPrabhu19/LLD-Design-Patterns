import java.util.*;

public class Flipkart {
    private static List<OrderPlacedSubscriber> subscriberList;

    private static Flipkart instance;

    private Flipkart() {
    }

    public void orderPlaced() {
        for (OrderPlacedSubscriber subscriber : subscriberList) {
            subscriber.orderPlacedNotify();
        }
    }

    public static Flipkart getInstance() {
        if (instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }

    public void registerSubscriber(OrderPlacedSubscriber subscriber) {
        if (subscriberList == null)
            subscriberList = new ArrayList<OrderPlacedSubscriber>();
        subscriberList.add(subscriber);
    }

    public void unregisterSubscriber(OrderPlacedSubscriber subscriber) {
        subscriberList.remove(0);
    }

}
