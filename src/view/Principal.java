package view;

import controller.RecursivaMDC;

public class Principal {

	public static void main(String[] args) {
		RecursivaMDC rmdc = new RecursivaMDC();
		
		int n1 = 114;
		int n2 = 47;
		
		int res = rmdc.maxdivc(n1, n2);
		
		System.out.println(res);

	}

}
