import Tourist.*;
import Locations.*;


public class App {
    public static void main(String[] args) throws Exception {

        Tourist me = new Me();

        Locations boracay = new Boracay();
        Locations elyu = new Elyu();
        Locations sagada = new Sagada();
        Locations bataan = new Bataan();
        Locations northernitaly = new NorthernItaly();
        Locations bicol = new Bicol();
        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod


        boracay.accept(me);
        elyu.accept(me);
        sagada.accept(me);
        bataan.accept(me);
        northernitaly.accept(me);
        bicol.accept(me);

        
        
    }
}
