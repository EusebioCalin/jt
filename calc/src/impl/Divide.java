package impl;

import calc.Operation;

public class Divide implements Operation{

	@Override
	public Double calc(Double a, Double b) {
		if (b!=0)
		return a/b;
		else throw new IllegalArgumentException();
	}

}
