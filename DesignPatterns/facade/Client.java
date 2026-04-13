package structural.facade;

public class Client {

    public static void main(String[] args) {

        // Create facade object
        HotelKeeper keeper = new HotelKeeperImplementation();

        // User calls simple methods
        VegMenu veg = keeper.getVegMenu();
        veg.showMenu();

        NonVegMenu nonVeg = keeper.getNonVegMenu();
        nonVeg.showMenu();

        Both both = keeper.getVegNonMenu();
        both.showMenu();
    }
}