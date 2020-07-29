package com.codurance.strategyadapter.entities;

import com.codurance.strategyadapter.behaviors.FlyWithWings;
import com.codurance.strategyadapter.behaviors.Quack;

public class MallardDuck extends DuckImpl {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display(){
    System.out.println("I look like a mallard!");
  }
}
