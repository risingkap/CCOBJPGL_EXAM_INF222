package Locations;

import Tourist.Tourist;

public class Elyu implements Locations {

    public int airFare = 250;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
    
}
