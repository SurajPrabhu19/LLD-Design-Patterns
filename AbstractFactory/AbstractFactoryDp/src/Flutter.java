public class Flutter {

    private SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setRefreshRate() {
        System.out.println("Setting the Refresh Rate");
    }

    public void setTheme() {
        System.out.println("Setting the Theme");
    }

    public IUIFactory createUiFactory() {
        // UIFactoryFactory uiFactory = new UIFactoryFactory();
        return UIFactoryFactory.getUiFactoryForPlatform(platform);

    }
}
