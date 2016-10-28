package assignment03;

public class Intcoll5client {
	public static void main(String[] args) {
		Intcoll5 B = new Intcoll5(4);
		B.insert(1);
		B.insert(2);
		B.insert(2);
		B.insert(3);
		B.insert(4);
		B.insert(5);
		B.omit(1);
		B.omit(3);
		B.omit(5);
		B.insert(-1);
		B.insert(6);

		System.out.println("Collection B created with size 4:");
		System.out.println("(1, 2, 3, 4, 5) inserted");
		System.out.println("(1, 2, 5) omitted");
		System.out.println("(-1, 6) inserted");
		System.out.println("\nCollection B: ");
		B.print();

		Intcoll5 A = new Intcoll5();
		A.copy(B);
		System.out.println("\nA.copy(B):");
		A.print();

		System.out.println("\nNumber of integers in collection A: " + A.get_howmany());

		System.out.print("\nA.equals(B): " + A.equals(B));
		A.omit(-1);
		System.out.print("\nA.omit(1)");
		System.out.print("\nB.equals(A): ");
		System.out.println(B.equals(A));
		A.print();
		System.out.println("\nNumber of integers left in collection A: " + A.get_howmany());
		
		
		System.out.println("\n");
		Intcoll5 P = new Intcoll5(), N = new Intcoll5();
		for (int i = 1; i <= 7; i++) {
			P.insert(i);
		}

		for (int i = 1; i <= 5; i++) {
			N.insert(i);
		}

		System.out.println("\nFirst collection (P):");
		P.print();
		System.out.println("\nSecond Collection (N):");
		N.print();
		
		P.copy(N);
		System.out.println("\nFirst collection after copy (P.copy(N)):");
		P.print();
		System.out.println("\nSecond collection after copy (N):");
		N.print();

		System.out.println("\nP.equals(N): " + P.equals(N));
		System.out.println("N.equals(P): " + N.equals(P));
		System.out.println("P.contains(2): " + P.belongs(2));
		System.out.println("P.contains(7): " + P.belongs(7));
		System.out.println("Number of integers: " + P.get_howmany());

		P.omit(2);
		System.out.println("\nP.contains(2): " + P.belongs(2));
		System.out.println("Number of integers after omit: " + P.get_howmany());
	}
}