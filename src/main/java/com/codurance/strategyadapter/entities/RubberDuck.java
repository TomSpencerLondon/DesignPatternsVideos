package com.codurance.strategyadapter.entities;

import com.codurance.strategyadapter.behaviors.FlyNoWay;

public class RubberDuck extends DuckImpl {


  public RubberDuck() {
    quackBehavior = () -> System.out.println("Squeek!");
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display(){
    System.out.println("I look like a rubber duck!");
  }
}
