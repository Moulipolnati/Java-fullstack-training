package structural.facade;

// Facade interface
public interface HotelKeeper {

    VegMenu getVegMenu();

    NonVegMenu getNonVegMenu();

    Both getVegNonMenu();
}