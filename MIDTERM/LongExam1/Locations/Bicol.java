package Locations;

import Tourist.Tourist;

public class Bicol implements Locations {

    public int airFare = 450;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    
}
