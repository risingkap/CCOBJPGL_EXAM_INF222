package Tourist;

import Locations.Boracay;
import Locations.Elyu;
import Locations.Sagada;
import Locations.NorthernItaly;
import Locations.Bataan;
import Locations.Locations;
import Locations.Bicol;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Elyu elyu);

    void visit(Sagada sagada);

    void visit(NorthernItaly northernItaly);

    void visit(Bataan bataan);

    void visit(Bicol bicol);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
