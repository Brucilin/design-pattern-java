package br.com.learning.design_pattern_java.strategy.simuduck.fly;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {

		System.out.println("I am Flying!!!");
	}

}
