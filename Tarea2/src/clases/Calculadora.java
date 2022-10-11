package clases;

public class Calculadora {
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	public int resta(int a, int b) {
		return a - b;
	}
	
	public int multiplica(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		if(b == 0)
			return -1;
		else
			return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
