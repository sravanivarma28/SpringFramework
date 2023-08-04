package com.springframework;

public class ConstructorTwo{
	private ConstructorOne constructor;

	public ConstructorTwo(ConstructorOne constructor) {
		this.constructor = constructor;
	}

	public ConstructorOne getConstructor() {
		return constructor;
	}

	
}
