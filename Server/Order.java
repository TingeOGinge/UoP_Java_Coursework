package Server;

import Server.Sauce;
import Server.Topping;
import Server.Pizza;
import Server.BaseSize;
import Server.BaseCrust;
import java.lang.reflect.Array;
import java.util.*;

public class Order {

  private ArrayList<Pizza> pizzaList;

  public Order() {
    pizzaList = new ArrayList<>();
  }

  public ArrayList<Pizza> getPizzaList() {
    return pizzaList;
  }

  public void setPizzaList(ArrayList<Pizza> pizza_list) {
    this.pizzaList = pizza_list;
  }

  public void addPizza(Pizza new_pizza) {
    pizzaList.add(new_pizza);
  }

  public void addPizza(BaseSize base_size, BaseCrust base_crust, Sauce pizza_sauce, Topping topping_1,
          Topping topping_2) {
    Pizza new_pizza = new Pizza(base_size, base_crust, pizza_sauce, topping_1, topping_2);
    pizzaList.add(new_pizza);
  }

  public Pizza getPizza(Integer index) {
    if (index <= pizzaList.size()) {
      return pizzaList.get(index - 1);
    } else { return pizzaList.get(0); }
  }

  public String getInfo() {
    String order_info = "";
    for (Pizza p : pizzaList) {
      order_info += p.getInfo();
    }
    return order_info;
  }

  public int getNumOfPizzas() {
    return pizzaList.size();
  }

  public String getTotalCost() {
    double total_cost = 0;
    for (Pizza p : pizzaList) {
      total_cost += p.getPrice();
    }
    return String.valueOf(Math.round(total_cost * 100.0) / 100.0);
  }

  public Integer getSize() {
    return pizzaList.size();
  }

  public void deletePizza(int pizza_index) {
    if (pizza_index <= pizzaList.size()) {
      pizzaList.remove(pizza_index - 1);
    }
  }

  public void updatePizza(Pizza p, int pizza_index) {
    Pizza updatedPizza = new Pizza(p);
    pizzaList.set(pizza_index - 1, updatedPizza);
  }

  public ArrayList<String> getSizes() {
    BaseSize[] sizes = BaseSize.class.getEnumConstants();
    ArrayList<String> sizesStringValues = new ArrayList<>();
    for (BaseSize s : sizes){
      sizesStringValues.add(s.getDescription().split("\\s+")[0]);
    }
    return sizesStringValues;
  }
  
  public ArrayList<String> getCrusts() { 
    BaseCrust[] crusts = BaseCrust.class.getEnumConstants();
    ArrayList<String> crustStringValues = new ArrayList<>();
    for (BaseCrust c : crusts){
      crustStringValues.add(c.getDescription());
    }
    return crustStringValues;
  }
  
  public ArrayList<String> getSauces() {
    Sauce[] sauces = Sauce.class.getEnumConstants();
    ArrayList<String> sauceStringValues = new ArrayList<>();
    for (Sauce s : sauces){
      sauceStringValues.add(s.getDescription().split("\\s+")[0]);
    }
    return sauceStringValues;
  }
  
  public ArrayList<String> getToppingsString() {
    Topping[] toppings = Topping.class.getEnumConstants();
    ArrayList<String> sauceStringValues = new ArrayList<>();
    for (Topping t : toppings){
      sauceStringValues.add(t.getDescription());
    }
    return sauceStringValues;
  }
  
  public ArrayList<Topping> getToppings() {
    Topping[] toppings = Topping.class.getEnumConstants();
    ArrayList<Topping> sauceStringValues = new ArrayList<>();
    for (Topping t : toppings){
      sauceStringValues.add(t);
    }
    return sauceStringValues;
  }
}
