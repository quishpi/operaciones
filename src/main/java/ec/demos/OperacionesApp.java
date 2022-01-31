package ec.demos;

public class OperacionesApp {

	public static void main(String[] args) {
		
		Calculadora calculadora=new Calculadora();
		calculadora.setValue1(50);
		calculadora.setValue2(83);
		calculadora.sumar();
		
		calculadora.setValue1(50);
		calculadora.setValue2(20);
		calculadora.restar();
		
		calculadora.setValue1(25);
		calculadora.setValue2(10);
		calculadora.modulo();
		
	}
}
