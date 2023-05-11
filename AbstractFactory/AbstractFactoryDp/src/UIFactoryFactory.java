
public class UIFactoryFactory {

    public static IUIFactory getUiFactoryForPlatform(SupportedPlatforms platform) {
        return switch (platform) {
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}