package clases;

public class Calculadora {
	
	public static int suma(int a, int b) {
		return a + b;
	}
	
	public static int resta(int a, int b) {
		return a - b;
	}
	
	public static int multiplica(int a, int b) {
		return a*b;
	}
	
	public static int divide(int a, int b) {
		if(b == 0)
			return -1;
		else
			return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
