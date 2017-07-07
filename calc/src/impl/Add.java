package impl;

import calc.Operation;

public class Add implements Operation {

	@Override
	public Double calc(Double a, Double b) {
		return a + b;
	}

}
