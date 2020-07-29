package com.codurance.strategyadapter.entities;

import com.codurance.strategyadapter.behaviors.FlyBehavior;
import com.codurance.strategyadapter.behaviors.QuackBehavior;

public interface Duck {
  void setFlyBehavior(FlyBehavior flyBehavior);

  void setQuackBehavior(QuackBehavior quackBehavior);

  void swim();

  void display();

  void preformQuack();

  void performFly();
}
