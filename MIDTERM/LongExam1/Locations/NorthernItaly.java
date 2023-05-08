package Locations;

import Tourist.Tourist;

public class NorthernItaly implements Locations {

    public int airFare = 350;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
    
}
