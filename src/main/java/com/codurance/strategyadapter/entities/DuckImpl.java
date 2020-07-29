package com.codurance.strategyadapter.entities;

import com.codurance.strategyadapter.behaviors.FlyBehavior;
import com.codurance.strategyadapter.behaviors.QuackBehavior;
import com.codurance.strategyadapter.entities.Duck;

public abstract class DuckImpl implements Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  @Override
  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  @Override
  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior =quackBehavior;
  }

  @Override
  public void swim() {
    System.out.println("Look at me I can swim");
  }

  @Override
  public void preformQuack() {
    quackBehavior.quack();
  }

  @Override
  public void performFly() {
    flyBehavior.fly();
  }
}
