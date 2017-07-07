package impl;

import calc.Operation;

public class Multiply implements Operation{

	@Override
	public Double calc(Double a, Double b) {
		return a*(a+b);
		//return a*b;
	}

}
