package br.com.learning.design_pattern_java.strategy.simuduck.duck;

import br.com.learning.design_pattern_java.strategy.simuduck.fly.FlyNoWay;
import br.com.learning.design_pattern_java.strategy.simuduck.quack.Quack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		// TODO Auto-generated constructor stub
		
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a Model Duck!");
	}
}
