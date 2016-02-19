package com.duck;

public class MiniDuckSimulator {
	public static void main (String[] args){
		Duck mallard = new MallardDuck();
		
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("=======================");
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		
		System.out.println("=======================");
		
		DuckDevice duckDevice = new DuckDevice();
		duckDevice.mimicQuack();
		
	}
}
