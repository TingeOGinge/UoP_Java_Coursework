package Server;

import java.io.*;


public enum BaseSize {
  SMALL(9.45, "Small Size"),
  MEDIUM(11.87, "Medium Size"),
  LARGE(15.9, "Large Size");

  private double value;
  private String description;

  BaseSize(double value, String description) {
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

