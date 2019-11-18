package br.com.learning.design_pattern_java.strategy.simuduck.fly;

public class FlyNoWay implements FlyBehavior {
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can't fly!");
	}
}
