package controller;

public class RecursivaMDC {
	public RecursivaMDC() {
		super();
	}
	/* Explica��o: Condi��o de parada definida como n1==n2 pois, segundo a l�gica utilizada, quando n1 for igual a n2, o M�ximo Multiplo Comum ser� quaqer um dos dois
	 * O c�digo recebe os dois valores e compara. Caso n1 seja maior que n2, a opera��o n1 - n2 ser� feita at� que n2 seja superior a n1.
	 * Ap�s isso, caso os dois valores n�o sejam iguais, a opera��o inversa � feita (n2 - n1) at� que o MDC seja achado*/
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
