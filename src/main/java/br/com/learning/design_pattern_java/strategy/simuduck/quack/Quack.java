package br.com.learning.design_pattern_java.simuduck.quack;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
