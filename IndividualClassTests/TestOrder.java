package IndividualClassTests;

import Server.Order;
import Server.Sauce;
import Server.Topping;
import Server.Pizza;
import Server.BaseSize;
import Server.BaseCrust;
import java.util.ArrayList;

public class TestOrder {

  public static void main(String[] args) {
    Order currentOrder = new Order();
    Pizza testPizza1 = new Pizza(BaseSize.MEDIUM, BaseCrust.THIN, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.CHILLI);
    Pizza testPizza2 = new Pizza(BaseSize.MEDIUM, BaseCrust.STUFFED, Sauce.PESTO, Topping.OLIVES, Topping.ONION);
    Pizza testPizza3 = new Pizza(BaseSize.SMALL, BaseCrust.THIN, Sauce.PESTO, Topping.CHILLI, Topping.PEPPERONI);
    currentOrder.addPizza(testPizza1);
    currentOrder.addPizza(testPizza2);
    currentOrder.addPizza(testPizza3);
    currentOrder.addPizza(BaseSize.SMALL, BaseCrust.THIN, Sauce.PESTO, Topping.OLIVES, Topping.OLIVES);

    System.out.println(currentOrder.getInfo());



  }
}

