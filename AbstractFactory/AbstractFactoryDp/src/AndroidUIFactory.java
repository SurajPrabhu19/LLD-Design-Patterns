import components.Button.*;
import components.Dropdown.AndroidDropdown;
import components.Dropdown.Dropdown;
import components.Menu.AndroidMenu;
import components.Menu.Menu;

public class AndroidUIFactory implements IUIFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new AndroidButton();
        // throw new UnsupportedOperationException("Unimplemented method
        // 'createButton'");
    }

    @Override
    public Menu createMenu() {
        // TODO Auto-generated method stub
        return new AndroidMenu();
        // throw new UnsupportedOperationException("Unimplemented method 'createMenu'");
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'createDropdown'");
    }

}
