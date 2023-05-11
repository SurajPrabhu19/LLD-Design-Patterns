public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Inside Abstract Factory Client");

        Flutter flutterAndroid = new Flutter(SupportedPlatforms.ANDROID);
        Flutter flutterIos = new Flutter(SupportedPlatforms.ANDROID);

        IUIFactory uifactoryAndroid = flutterAndroid.createUiFactory();
        IUIFactory uifactoryIos = flutterIos.createUiFactory();

        uifactoryIos.createButton();
        uifactoryIos.createMenu();
        uifactoryIos.createDropdown();

        uifactoryAndroid.createButton();
        uifactoryAndroid.createMenu();
        uifactoryAndroid.createDropdown();

    }
}
