package com.examples.massmind.firstfifty;

class Test2 {
	int a;

	Test2(int i) {
		a = i;
	}

	// pass an object
	void meth(Test2 o) {
		// o.a=o.a+5;
		o.a = 26;
		System.out.println("a Aftr cal : " + a);
	}
}

class CallByRef {
	public static void main(String args[]) {
		Test2 ob = new Test2(11);
		System.out.println("a before cal : " + ob.a);
		ob.meth(ob);
		System.out.println("a Aftr cal : " + ob.a);
	}
}