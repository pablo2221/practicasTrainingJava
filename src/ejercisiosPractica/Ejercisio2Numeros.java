package ejercisiosPractica;

import libs.Input;

public class Ejercisio2Numeros {
	
	static float division;

	public static void main(String[] args) {
		
		
		System.out.print("Digite el dato del primer numero a utilizar"+"\n");
		float primerNumero = Input.get_int();
		
		System.out.print("Digite el dato del segundo numero a utilizar"+"\n");
		float segundoNumero = Input.get_int();
		/**/

		if (segundoNumero==0) {
			
			while (segundoNumero==0) {
				
				System.out.print("Digite el dato del segundo numero nuevamente ya que el numero no puede ser igual a cero"+"\n");
				segundoNumero = Input.get_int();
				
			}
			
			 division = primerNumero/segundoNumero;
			
		}
		
		division = primerNumero/segundoNumero;
		float suma = primerNumero+segundoNumero;
		float resta = primerNumero-segundoNumero;
		float multiplicacion = primerNumero*segundoNumero;
		
		System.out.print("\n");
		System.out.print("El resultado de la Suma de ("+primerNumero+" + "+segundoNumero+") es: "+suma+"\n");
		System.out.print("El resultado de la Resta de ("+primerNumero+" - "+segundoNumero+") es: "+resta+"\n");
		System.out.print("El resultado de la Multiplicacion de ("+primerNumero+" * "+segundoNumero+") es: "+multiplicacion+"\n");
		System.out.print("El resultado de la Division de ("+primerNumero+" / "+segundoNumero+") es: "+division+"\n");
	
	}

}
