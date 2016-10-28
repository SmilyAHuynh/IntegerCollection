package assignment01;
import java.util.*;

public class Intcoll1client {
	public static final int SENTINEL = 0;
	public static void main(String[] args) {
		int value;
		Scanner keyboard = new Scanner(System.in);
		Intcoll1 P=new Intcoll1(),
				N=new Intcoll1(),
				L= new Intcoll1();

		System.out.print("Enter an integer to be inserted or 0 to quit: ");
		value=keyboard.nextInt();
		
		while(value != SENTINEL) {
			if (value > 0) {
				P.insert(value);
				L.insert(value);
			} else {
				N.insert(-value);
				L.omit(-value);
			}
			System.out.print("Enter next integer to be inserted or 0 to quit: ");
			value=keyboard.nextInt();
		}
		
		System.out.println("\nThe values in collection P are:");
		P.print();
		
		System.out.println("\nThe values in collection N are:");
		N.print();
		
		System.out.println("\nThe values in collection L are:");
		L.print();
		
		if (P.equals(N)) {
			System.out.println("\nP and N are equal.");
		} else {
			System.out.println("\nP and N are NOT equal.");
		}
		
		Intcoll1 A = new Intcoll1();
		A.copy(L);
		System.out.println("\nThe values in the copy of L are:\n");
		A.print();
		
		// ** This block of code will test the copy and print methods
		A.copy(N);
		System.out.println("\nThe values in the copy of N are:\n");
		A.print();
		
		A.copy(A);
		System.out.println("\nThe copy of A should be the same as N:\n");
		A.print();
		// end of block of code **
		
		// ** Test the equals method by comparing A and N
		System.out.println("\nIs A equal to N?\n" + A.equals(N));
		System.out.println("\nIs N equal to A?\n" + N.equals(A));
		// end of the equals code **
		
	    // This will test various inputs of the belongs method
	    System.out.println("\nIs 17 in the collection?\n" + A.belongs(17));
	    System.out.println("\nIs -17 in the collection?\n" + A.belongs(-17));
	    System.out.println("\nIs 0 in the collection?\n" + A.belongs(0));
	    // end of equals code **
		
		// ** This code will test the insert method
		System.out.println("\nWhat will happen to the collection after the insert?\n");
		A.insert(7);
		A.print();
		// end of insert code **
		
		// ** This code tests the omit method
		System.out.println("\nWhat will be the collection after the omit?\n");
		A.omit(7);
		A.print();
		// end of the omit code **

		// This code adds up the number of values left in collection
		System.out.println("\nHow many values are left in the collection:\n" + A.get_howmany());
		// end of code **
	}
}