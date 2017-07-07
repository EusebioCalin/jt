import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import calc.Operation;
import impl.Add;
import impl.Divide;
import impl.Multiply;
import impl.Subtract;

public class Calculator {

	public static void main(String[] args) {
		//Operation add = new Add();

		
		Operation addObj =new Add();
		
		
		Operation sub = new Subtract();
		Operation mul = new Multiply();
		Operation div = new Divide();
		
		//BinaryOperator<Double> add1 = (op1, op2) -> {return op1+op2;  };
		BinaryOperator<Double> add1 = addObj::calc;
		Calculator calculator = new Calculator();
		calculator.print(add1,2D,3D);
		calculator.print(sub,2D,3D);
		calculator.print(mul,2D,3D);
		calculator.print(div,2D,3D);
		
		
		BinaryOperator<Double> adder = (p1,p2) -> p1+p2; 
		Consumer<BinaryOperator<Double>> printer = p -> System.out.println(p.apply(2D,8D));
		printer.accept(adder);
	}
	
	public void print(Operation operation, Double a, Double b){
		System.out.println(operation.calc(a, b));
	}
	
	public void print(BinaryOperator operation, Double a, Double b){
		System.out.println(operation.apply(a, b));
	}
}
