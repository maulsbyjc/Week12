package com.promineotech;

import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		if(a <= 0 || b<= 0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		return a + b;
	}
	public int multiplyPositive(int x, int y) {
		if(x <= 0 || y <= 0) {
			throw new IllegalArgumentException("Both parameters needed be positive!");
		}
		return x * y;
	}
	
	public int getRandomInt() {

	    Random random = new Random();

	    return random.nextInt(10) + 1;
    }

    public int randomNumberSquared() {
        int randomNumber = getRandomInt();
        return randomNumber * randomNumber;
    }
	
}
