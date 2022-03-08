package restaurants.src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestsRestaurant {
    @Test
    public void has_a_name() {
        Restaurant bayroot = new Restaurant("Bayroot", "imageUrl1234");
        assertEquals(bayroot.getName(), "Bayroot");
    }

    @Test
    public void has_an_imageUrl() {
        Restaurant bayroot = new Restaurant("Bayroot", "imageUrl1234");
        assertEquals(bayroot.getImageUrl(), "imageUrl1234");
    }
    @Test
    public void restaurant_has_a_menu() {
        Restaurant bayroot = new Restaurant("Bayroot", "imageUrl1234");
        Menu menu1 = new Menu("Menu1");
        bayroot.getMenus().add(menu1);
        assertEquals(menu1, bayroot.getMenus().get(0));
    }
    /*
     * 1. Properties are they being set correctly
     * 2. Methods do what you think they should
     * 3. Interaction working correctly? if you add a menu
     * - can you verify its there?
     * 4. Inputs and outputs + errors i.e. add an item to
     * a restaurant
     */
}
