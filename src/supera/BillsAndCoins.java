package supera;

import java.time.LocalDate;
import java.util.Locale;

public class BillsAndCoins {
	
	public static void Run() {
		
				
		double valor = 0.73;
		double notas[] = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
		double resultados[] = new double[notas.length];
		
		double resto = valor;
		String k = Double.toString(valor);
		double resto_decimal = 100 * Double.valueOf( k.substring(k.indexOf('.'), k.length()));
		//System.out.println(resto_decimal);
		
		
		for(int i = 0; i < notas.length; i ++) {
			
			if(resto >= 1) {
				if(resto >= notas[i]) {
					resultados[i] = (int)( resto / notas[i]);
					resto = (int)( resto % notas[i]);  //resto - resultados[i] * notas[i];
				}
			}else {
				if(resto_decimal >= notas[i]*100) {
					resultados[i] = (int)( resto_decimal / (notas[i]*100));
					resto_decimal = (int)( resto_decimal % (notas[i]*100));  //resto - resultados[i] * notas[i];
				}
			}			
			
		}
		
		for(int i =  0; i < resultados.length; i++) {
			if(i == 0) System.out.println("NOTAS:");
			
			if(i == 7) System.out.println("MOEDAS:");
			
			if(i < 7) System.out.printf(Locale.US, "%.0f nota(s) de R$ %.2f \n", resultados[i] ,  notas[i]);
			else System.out.printf(Locale.US, "%.0f moedas(s) de R$ %.2f \n", resultados[i] ,  notas[i]);
			
		}
		
						
	}
	
}
