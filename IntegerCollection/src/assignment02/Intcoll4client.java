package assignment02;

public class Intcoll4client {
	public static void main(String[] args) {
		Intcoll4 A = new Intcoll4();
		System.out.println("The integers in collection A before insertions are:\n");
		A.print();
		System.out.println("The number of integers in collection A is: " + A.get_howmany());
		
		System.out.println("\nThe integers in collection A after insertions are:");
		A.print();
		A.insert(1);
		A.insert(4);
		A.insert(7);
		A.insert(10);
		A.insert(17);
		A.print();
		System.out.println("\nThe number of integers in collection A is: " + A.get_howmany());
		
		System.out.println("\nCollection A after integers are removed:");
		A.omit(1);
		A.omit(10);
		A.print();
		System.out.println("\nThe number of integers left in collection A is: " + A.get_howmany());
		
		Intcoll4 B = new Intcoll4();
		System.out.println("\nThe copy of collection A into B:");
		B.copy(A);
		B.print();
		System.out.println("\nThe number of integers in collection B is: " + B.get_howmany());
		
		System.out.println("\nThe integer 3 belongs in collection A: " + A.belongs(3));
		System.out.println("\nThe integer 17 belongs in collection A: " + A.belongs(17));
		
		System.out.println("\nCollection A is equal to collection B: ");
		A.equals(B);
		System.out.println("\nCollection B is equal to collection A: ");
		B.equals(A);
	}
}
