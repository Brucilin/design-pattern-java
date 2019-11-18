package br.com.learning.design_pattern_java.strategy.simuduck.main;

import br.com.learning.design_pattern_java.strategy.simuduck.duck.Duck;
import br.com.learning.design_pattern_java.strategy.simuduck.duck.ModelDuck;
import br.com.learning.design_pattern_java.strategy.simuduck.fly.FlyRocketPowered;
import br.com.learning.design_pattern_java.strategy.simuduck.fly.FlyWithWings;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
		model.performQuack();
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();
		
	}

}
