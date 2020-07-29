package com.codurance.strategyadapter.behaviors;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I don't fly!");
  }
}
