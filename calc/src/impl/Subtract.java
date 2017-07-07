package impl;

import calc.Operation;

public class Subtract implements Operation {

	@Override
	public Double calc(Double a, Double b) {
		return a - b;
	}

}
