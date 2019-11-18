package br.com.learning.design_pattern_java.simuduck;

import br.com.learning.design_pattern_java.simuduck.fly.FlyWithWings;
import br.com.learning.design_pattern_java.simuduck.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
		 this.flyBehavior = new FlyWithWings();
		 this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("I am a Duck MallarDuck!");
	}
}
