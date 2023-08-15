package controller;

public class RecursivaMDC {
	public RecursivaMDC() {
		super();
	}
	/* Explicação: Condição de parada definida como n1==n2 pois, segundo a lógica utilizada, quando n1 for igual a n2, o Máximo Multiplo Comum será quaqer um dos dois
	 * O código recebe os dois valores e compara. Caso n1 seja maior que n2, a operação n1 - n2 será feita até que n2 seja superior a n1.
	 * Após isso, caso os dois valores não sejam iguais, a operação inversa é feita (n2 - n1) até que o MDC seja achado*/
	public int maxdivc(int n1, int n2) {
	        if (n1 == n2) {
	            return n1;
	        } else {
	        	if ( n1 > n2) {
	            return maxdivc(n1 - n2, n2);
	        } else {
	            return maxdivc(n1, n2 - n1);
	        } 
		}
	}
}
