import components.Button.Button;
import components.Button.IosButton;
import components.Dropdown.Dropdown;
import components.Dropdown.IosDropdown;
import components.Menu.IosMenu;
import components.Menu.Menu;

public class IosUIFactory implements IUIFactory {

    @Override
    public Button createButton() {
        return new IosButton();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'createButton'");
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createMenu'");
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'createDropdown'");
    }

}
