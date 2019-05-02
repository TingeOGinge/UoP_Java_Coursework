package Server;

import java.util.*;
import java.io.*;

public enum Topping {
  NONE(0, "None"),
  OLIVES(.08, "Olives"),
  EXTRA_CHEESE(.02, "Extra cheese"),
  CHILLI(.06, "Chilli"),
  PEPPERONI(.1, "Pepperoni"),
  MUSHROOM(.03, "Mushrooms"),
  ROCKET(.05, "Rocket"),
  JALAPENOS(.2, "Jalapeños"),
  ONION(.07, "Onions"),
  ANCHOVY(.09, "Anchovy");

  private double value;
  private String description;

  Topping(double value, String description) {
    this.value = value;
    this.description = description;
  }

  public double getValue() {
    return value;
  }

  public String getDescription() {
    return description;
  }

  //  NONE, Cost £0.00
//  OLIVES, Cost £0.08
//  EXTRA_CHEESE, Cost £0.02
//  CHILLI, Cost £0.06
//  PEPPERONI, Cost £0.10
//  MUSHROOM, Cost £0.03
//  ROCKET, Cost £0.05
//  JALAPENOS, Cost £0.20
//  ONION, Cost £0.07
//  ANCHOVY, Cost £0.09

}
