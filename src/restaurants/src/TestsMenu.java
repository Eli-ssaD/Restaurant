package restaurants.src;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestsMenu {
    @Test
    public void has_a_title() {
        Menu menu1 = new Menu("Menu1");
        assertEquals(menu1.getTitle(), "Menu1");
    }
    
}
