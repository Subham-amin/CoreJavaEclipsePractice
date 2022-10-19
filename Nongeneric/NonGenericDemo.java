package com.Nongeneric;

public class NonGenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nongeneric intobject = new Nongeneric(88);
		intobject.showType();
		int a = (Integer) intobject.getObct();
		System.out.println(a);

		Nongeneric strngobjct = new Nongeneric("Java");
		strngobjct.showType();

		String str = (String) strngobjct.getObct();
		System.out.println(str);
	}
}