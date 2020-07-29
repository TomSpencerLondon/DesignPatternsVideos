package com.codurance.strategyadapter;

import com.codurance.strategyadapter.behaviors.FlyWithWings;
import com.codurance.strategyadapter.behaviors.Quack;

public class RedheadDuck extends DuckImpl {

  public RedheadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I look like a Redhead!");
  }
}
