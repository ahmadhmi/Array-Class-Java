package com.ahmad;

public class Main {

    public static void main(String[] args) {
	    Array test = new Array(3);
	    test.insert(1);
	    test.insert(2);
	    test.insert(3);
	    test.insert(4);
	    test.insert(5);

	    test.removeAt(2);

	    test.print();
	    int index = test.indexOf(4);
	    int index2 = test.indexOf(8);
        System.out.println(index);
        System.out.println(index2);
    }
}
