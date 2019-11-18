package br.com.learning.design_pattern_java.simuduck.simulator;

import br.com.learning.design_pattern_java.simuduck.Duck;
import br.com.learning.design_pattern_java.simuduck.MallardDuck;
import br.com.learning.design_pattern_java.simuduck.ModelDuck;
import br.com.learning.design_pattern_java.simuduck.fly.FlyNoWay;
import br.com.learning.design_pattern_java.simuduck.fly.FlyRocketPowered;
import br.com.learning.design_pattern_java.simuduck.fly.FlyWithWings;

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
