package Server;

import java.io.*;

public enum BaseCrust {
  THIN(1.08, "Thin Crust"), 
  DEEP(1.1, "Deep Pan"), 
  STUFFED(2.14, "Stuffed Crust");

  private double value;
  private String description;

  BaseCrust(double value, String description) {
    this.value = value;
    this.description = description;
  }

  public double getValue() {
    return value;
  }

  public String getDescription() {
    return description;
  }
}


