package IndividualClassTests;

import Server.Sauce;
import Server.Topping;
import Server.Pizza;
import Server.BaseSize;
import Server.BaseCrust;
import java.util.*;

public class TestPizza {

  public static void main(String[] args) {
    Pizza testPizza = new Pizza(BaseSize.SMALL, BaseCrust.THIN, Sauce.PESTO, Topping.OLIVES, Topping.OLIVES);

    System.out.println(testPizza.getInfo());
      
    

  }
}



