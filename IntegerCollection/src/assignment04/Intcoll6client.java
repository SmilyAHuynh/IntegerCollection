package assignment04;

public class Intcoll6client {

	public static void main(String[] args) {
		Intcoll6 A = new Intcoll6();
		A.insert(60);
		A.insert(40);
		A.insert(80);
		A.insert(30);
		A.insert(50);
		A.insert(120);
		A.insert(54);
		A.insert(52);
		A.insert(53);
		System.out.println("A collection: ");
		A.print();
		A.omit(60);
		System.out.println("After omitting 60: ");
		A.print();
		
		Intcoll6 B = new Intcoll6();
		B.insert(60);
		B.insert(40);
		B.insert(80);
		B.insert(30);
		B.insert(50);
		B.insert(120);
		B.insert(54);
		B.insert(52);
		B.insert(53);
		System.out.println("B collection: ");
		B.print();
		System.out.println("After omitting 40: ");
		B.omit(40);
		B.print();
		
		Intcoll6 C = new Intcoll6();
		C.insert(60);
		C.insert(40);
		C.insert(80);
		C.insert(30);
		C.insert(50);
		C.insert(120);
		C.insert(54);
		C.insert(52);
		C.insert(53);
		System.out.println("C collection: ");
		C.print();
		System.out.println("After omitting 120: ");
		C.omit(120);
		C.print();
	}

}
