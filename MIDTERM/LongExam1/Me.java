package Tourist;

import Locations.Elyu;
import Locations.Boracay;
import Locations.Bataan;
import Locations.Bicol;
import Locations.Sagada;
import Locations.Locations;
import Locations.NorthernItaly;



public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        
        if (budget<100) {
        System.out.print("AWW NO MONEY !.");
        System.exit(0); }
        else
        System.out.println("Enjoying my stay.");
        
    }

    public void visit(Boracay boracay) {

        System.out.println("The air fare is " + boracay.airFare + " in Boracay");
        visit();
        budget -= boracay.airFare;
        checkBudget();

    }

    public void visit(Bataan bataan) {

        System.out.println("The air fare is " + bataan.airFare + " in Bataan");
        visit();
        budget -= bataan.airFare;
        checkBudget();
 
    }

    public void visit(Sagada sagada) {
        
        System.out.println("The air fare is " + sagada.airFare + " in Sagada");
        visit();
        budget -= sagada.airFare;  
        checkBudget();

    }

    public void visit(Elyu elyu) {

        System.out.println("The air fare is " + elyu.airFare + " in Elyu");
        visit();
        budget -= elyu.airFare;
        checkBudget();
   
    }
    
    public void visit(NorthernItaly northernItaly) {

        System.out.println("The air fare is " + northernItaly.airFare + " in Northern Italy");
        visit();
        budget -= northernItaly.airFare;
        checkBudget();
   
    }

    public void visit(Bicol bicol) {

        System.out.println("The air fare is " + bicol.airFare + " in Bicol");
        visit();
        budget -= bicol.airFare;  
        checkBudget();
    }

    public void checkBudget() {
        budget -= Locations.airFare;
        System.out.println("my budget is " + budget + "\n");
    }

}
