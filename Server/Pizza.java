//887062
package Server;

import Server.BaseSize;
import Server.BaseCrust;

public class Pizza {
  private BaseSize baseSize;
  private BaseCrust baseCrust;
  private Sauce pizzaSauce;
  private Topping topping1;
  private Topping topping2;

  public Pizza(BaseSize baseSize, BaseCrust baseCrust, Sauce pizzaSauce, 
          Topping topping1, Topping topping2) {
    this.baseSize = baseSize;
    this.baseCrust = baseCrust;
    this.pizzaSauce = pizzaSauce;
    this.topping1 = topping1;
    this.topping2 = topping2;
  }
  
  public Pizza() {
    this.baseSize = BaseSize.SMALL; 
    this.baseCrust = BaseCrust.THIN;
    this.pizzaSauce = Sauce.TOMATO;
    this.topping1 = Topping.NONE;
    this.topping2 = Topping.NONE;
  }

  public Pizza(Pizza current){
    this.baseSize = current.baseSize;
    this.baseCrust = current.baseCrust;
    this.pizzaSauce = current.pizzaSauce;
    this.topping1 = current.topping1;
    this.topping2 = current.topping2;    
  }  

  public BaseSize getBaseSize() {
    return baseSize;
  }

  public void setBaseSize(BaseSize base_size) {
    this.baseSize = base_size;
  }

  public BaseCrust getBaseCrust() {
    return baseCrust;
  }

  public void setBaseCrust(BaseCrust base_crust) {
    this.baseCrust = base_crust;
  }

  public Sauce getPizzaSauce() {
    return pizzaSauce;
  }

  public void setPizzaSauce(Sauce pizza_sauce) {
    this.pizzaSauce = pizza_sauce;
  }

  public Topping getTopping1() {
    return topping1;
  }

  public void setTopping1(Topping topping_1) {
    this.topping1 = topping_1;
  }

  public Topping getTopping2() {
    return topping2;
  }

  public void setTopping2(Topping topping_2) {
    this.topping2 = topping_2;
  }  

  public double getBasePrice(){
    return Math.round((baseSize.getValue() + baseCrust.getValue()) * 100.0) / 100.0;
  }
  
  public double getPrice(){
    double pizza_price = getBasePrice() + pizzaSauce.getValue() +
      (topping1.getValue() * 5) + (topping2.getValue() * 4);
    return Math.round(pizza_price * 100.0) / 100.0;
  }

  public String getInfo(){
    return String.format("TOTAL COST: £%.2f \n" +
        "%s: £%.2f \n" +                          //Size
        "%s: £%.2f \n" +                           //Crust
        "BASE COST: £%.2f \n" +
        "%s Topping: 5* £%.2f = £%.2f \n" +       //Topping 2
        "%s Topping: 4* £%.2f = £%.2f \n" +       //Topping 1
        "%s: £%.2f \n\n"                          //Sauce
    ,this.getPrice(),
      baseSize.getDescription(), baseSize.getValue(),
      baseCrust.getDescription(), baseCrust.getValue(),
      this.getBasePrice(),
      topping1.getDescription(), topping1.getValue(), topping1.getValue() * 5,
      topping2.getDescription(), topping2.getValue(), topping2.getValue() * 4,
      pizzaSauce.getDescription(), pizzaSauce.getValue());
  }
}