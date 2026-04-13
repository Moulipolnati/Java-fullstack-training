package structural.facade;

// Facade class (main logic)
public class HotelKeeperImplementation implements HotelKeeper {

    public VegMenu getVegMenu() {

        Hotel vegHotel = new VegRestaurant();
        return (VegMenu) vegHotel.getMenus();
    }

    public NonVegMenu getNonVegMenu() {

        Hotel nonVegHotel = new NonVegRestaurant();
        return (NonVegMenu) nonVegHotel.getMenus();
    }

    public Both getVegNonMenu() {

        Hotel bothHotel = new VegNonBothRestaurant();
        return (Both) bothHotel.getMenus();
    }
}