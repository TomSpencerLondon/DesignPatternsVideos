package com.codurance.strategyadapter;

import com.codurance.strategyadapter.behaviors.FlyBehavior;
import com.codurance.strategyadapter.behaviors.QuackBehavior;
import com.codurance.strategyadapter.entities.Duck;
import com.codurance.strategyadapter.entities.Turkey;
import java.util.stream.IntStream;

public class TurkeyAdapter implements Duck {

  private Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void setFlyBehavior(FlyBehavior flyBehavior) {
  }

  @Override
  public void setQuackBehavior(QuackBehavior quackBehavior) {
  }

  @Override
  public void swim() {
    System.out.println("I'm a turkey and I don't swim!");
  }

  @Override
  public void display() {
    System.out.println("I'm a turkey");
  }

  @Override
  public void preformQuack() {
    turkey.gobble();
  }

  @Override
  public void performFly() {
    IntStream.range(0, 5).forEach(i -> turkey.fly());
  }
}
