package pkg;

public class empleado {
	enum TipoEmpleado{Vendedor,Encargado}
	
	static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		//El empleado puede ser Vendedor o Encargado. El salario base será 2000 euros
		//si el empleado es de tipo vendedor, y de 2500 euros si es de tipo encargado.
		//Se le sumará a esta cantidad una prima de 100 euros si las ventas del mes 
		//son mayores o iguales que 1000 euros, y de 200 euros si fuese de 1500 euros o más.
		//Por último, cada hora extra se pagará a 30 euros
		float nominaBruta=0, salarioBase=0;
		
		if(tipo == TipoEmpleado.Vendedor)
			salarioBase = 2000;
		
		else if(tipo==TipoEmpleado.Encargado) 
			salarioBase= 2500;
		
		if(ventasMes >= 1000) {
			if(ventasMes >=1500) {
				salarioBase = salarioBase + 200 ;
			}
			else {
				salarioBase = salarioBase + 100;
			}
		}
		salarioBase += horasExtra*30;
		nominaBruta = salarioBase;
		return nominaBruta;
		
	}
	
	static float calculoNominaNeta(float nominaBruta) {
		//Si la nomina bruta es menor de 1100 euros, no se aplicará ninguna retención. 
		//Para nominas superiores a 1100 pero menores de 1500 euros se les aplicará un 15%. 
		//Para salarios a partir de 1500 euros se les aplicará un 18%. El método devuelve 
		//nominaBruta * (1-retencion).
		float retencion = 0;
		if(nominaBruta >=2500) retencion = 0.18f;
		else if(nominaBruta > 2100 && nominaBruta < 2500)retencion = 0.15f;
		return nominaBruta*(1-retencion);
	}

}
