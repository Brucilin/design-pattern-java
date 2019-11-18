package br.com.learning.design_pattern_java.strategy.simuduck.quack;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<< Silence >>");
	}
}
