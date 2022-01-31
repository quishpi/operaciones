package ec.demos;

public class Calculadora extends Operaciones {

	public void modulo() {
		int result = getValue1() % getValue2();
		System.out.println("Móludo = " + result);
	}
}
