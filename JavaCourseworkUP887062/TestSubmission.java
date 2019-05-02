package JavaCourseworkUP887062;

import Server.Order;
import Server.Sauce;
import Server.Topping;
import Server.Pizza;
import Server.BaseSize;
import Server.BaseCrust;

public class TestSubmission {
  
  public static String displayPizza(String content){
    return String.format(
            "======= PIZZA DISPLAY=======\n"
            + "===========================\n"
            + "%s"
            + "===========================\n", 
            content);
  }
  
  public static String displayOrder(Order currentOrder){
    return String.format(
            "======= ORDER DISPLAY=======\n"
            + "===========================\n"
            + "NUMBER OF PIZZAS: %s \n"
            + "TOTAL ORDER COST: %s \n\n"
            + "%s"
            + "===========================\n", 
            currentOrder.getNumOfPizzas(), 
            currentOrder.getTotalCost(),
            currentOrder.getInfo());
  }
  
  public static void main(String[] args) {
    Pizza testPizza = new Pizza(BaseSize.MEDIUM, BaseCrust.THIN, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.CHILLI);

    System.out.println("------- PIZZA CLASS TESTS -------\n"
            + "---------------------------------\n"
            + "PIZZA CREATION WITH THE FOLLOWING DATA: \n"
            + "BaseSize.MEDIUM \n"
            + "BaseCrust.THIN \n"
            + "Sauce.PESTO \n"
            + "Topping.EXTRA_CHEESE \n"
            + "Topping.CHILLI \n");
    
    System.out.println(displayPizza(testPizza.getInfo()));
    
    System.out.println("-----CHANGE THE FOLLOWING USING SET METHODS-----\n"
            + "BaseSize.MEDIUM \n"
            + "BaseCrust.STUFFED \n"
            + "Topping.OLIVES \n"
            + "Topping.ONION \n");
    
    testPizza.setBaseSize(BaseSize.MEDIUM);
    testPizza.setBaseCrust(BaseCrust.STUFFED);
    testPizza.setTopping1(Topping.OLIVES);
    testPizza.setTopping2(Topping.ONION);
    
    System.out.println(displayPizza(testPizza.getInfo()));
    
    System.out.println("------- ORDER CLASS TESTS -------\n"
            + "---------------------------------\n"
            + "EMPTY ORDER CREATION \n"
            + "PIZZA 1 CREATE & ADD TO ORDER:\n"
            + "BaseSize.MEDIUM \n"
            + "BaseCrust.THIN \n"
            + "Sauce.PESTO \n"
            + "Topping.EXTRA_CHEESE \n"
            + "Topping.CHILLI \n\n"
            + "PIZZA 2 CREATE & ADD TO ORDER:\n"
            + "BaseSize.MEDIUM \n"
            + "BaseCrust.THIN \n"
            + "Sauce.PESTO \n"
            + "Topping.OLIVES \n"
            + "Topping.ONION \n\n"
            + "PIZZA 3 CREATE & ADD TO ORDER:\n"
            + "BaseSize.SMALL \n"
            + "BaseCrust.THIN \n"
            + "Sauce.PESTO \n"
            + "Topping.CHILLI \n"
            + "Topping.PEPPERONI \n");
    
    Order currentOrder = new Order();
    
    Pizza orderPizza1 = new Pizza(BaseSize.MEDIUM, BaseCrust.THIN, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.CHILLI);
    currentOrder.addPizza(orderPizza1);
    
    Pizza orderPizza2 = new Pizza(BaseSize.MEDIUM, BaseCrust.STUFFED, Sauce.PESTO, Topping.OLIVES, Topping.ONION);    
    currentOrder.addPizza(orderPizza2);
    
    currentOrder.addPizza(BaseSize.SMALL, BaseCrust.THIN, Sauce.PESTO, Topping.CHILLI, Topping.PEPPERONI);
    
    System.out.println(displayOrder(currentOrder));
    
    System.out.println("---------------------------------\n"
            + "SELECT PIZZA 3 \n"
            + "UPDATE: Topping.OLIVES \n"
            + "Topping.OLIVES \n"
            + "---------------------------------\n"
            + "CHECK PIZZA 3 FROM ABOVE\n");
    
    Pizza editPizza = new Pizza(currentOrder.getPizza(3));
    editPizza.setTopping1(Topping.OLIVES);
    editPizza.setTopping2(Topping.OLIVES);
    currentOrder.updatePizza(editPizza, 3);
    
    System.out.println(displayOrder(currentOrder));
    
    System.out.println("---------------------------------\n"
            + "SELECT PIZZA 2 \n"
            + "DELETE \n");
    
    currentOrder.deletePizza(2);
    
    System.out.println(displayOrder(currentOrder));
    
  }
}