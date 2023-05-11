import components.Button.Button;
import components.Dropdown.Dropdown;
import components.Menu.Menu;

public interface IUIFactory {

    Button createButton();

    Menu createMenu();

    Dropdown createDropdown();

}