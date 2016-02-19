package com.duck;

public class DuckDevice {
	QuackBehavior quackBehavior;
	
	public DuckDevice() {
		this.quackBehavior = new MimicQuack();
	}
	
	public void mimicQuack(){
		this.quackBehavior.quack();
	}
	
}
