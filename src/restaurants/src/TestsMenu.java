package restaurants.src;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestsMenu {
    @Test
    public void has_a_title() {
        Menu menu1 = new Menu("Menu1");
        assertEquals(menu1.getTitle(), "Menu1");
    }
    @Test
    public void add_item_to_a_menu() {
        Menu menu1 = new Menu("Menu1");
        Item pasta = new Item("pasta", 8.50);
        menu1.getItem().add(pasta);
        assertEquals(pasta, menu1.getItem().get(0));
    }
    
}
