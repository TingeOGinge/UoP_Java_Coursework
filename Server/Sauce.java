package Server;

import java.io.*;

public enum Sauce {
  TOMATO(0, "Tomato Sauce"), 
  PESTO(.5, "Pesto Sauce");

  private double value;
  private String description;

  Sauce(double value, String description) {
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
