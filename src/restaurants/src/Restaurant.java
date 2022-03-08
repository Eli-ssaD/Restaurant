package restaurants.src;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String imageUrl;
    private ArrayList<Menu> menus;

    public Restaurant(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.menus = new ArrayList<Menu>();
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Menu> getMenus() {
        return this.menus;
    }
}
