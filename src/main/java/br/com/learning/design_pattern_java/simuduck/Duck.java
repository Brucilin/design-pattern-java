package br.com.learning.design_pattern_java.simuduck;

import br.com.learning.design_pattern_java.simuduck.fly.FlyBehavior;
import br.com.learning.design_pattern_java.simuduck.quack.QuackBehavior;

public abstract class Duck {
	
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
	
	public void swim() {
		
	}

	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	public abstract void display();
	
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
}
