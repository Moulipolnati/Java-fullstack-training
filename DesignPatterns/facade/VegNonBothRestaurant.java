package structural.facade;

public class VegNonBothRestaurant implements Hotel {

    public Menus getMenus() {
        return new Both();
    }
}