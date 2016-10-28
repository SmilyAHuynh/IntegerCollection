package assignment03;
import java.util.*;

public class Intcoll5 {
	private LinkedList<Integer> c;
	private int how_many;

	// Creates an empty set and sets the storage capacity for 500 integers
	public Intcoll5() {
		c = new LinkedList<Integer>();
		how_many = c.size();
	}

	// Creates an empty set and sets the storage capacity to what is specified
	// in the method's argument
	public Intcoll5(int i) {
		c = new LinkedList<Integer>();
		how_many = c.size();
	}

	// Copies the content and length of the given Integer collection into the
	// receiving Integer Collection
	public void copy(Intcoll5 obj) {
		if (this != obj) {
			c = new LinkedList<Integer> (obj.c);
		}
	}

	// Tests to see if the integer given as an argument is in the Collection
	public boolean belongs(int i) {
		return c.contains(new Integer(i));
		// Integer I = new Integer(i);
		// return c.contains(I);
	}

	// Inserts an integer into a collection, if the integer is already in the
	// set it does nothing
	public void insert(int i) {
		Integer I = new Integer(i);
		if (!this.belongs(i)) {
			c.addFirst(i);
		}
		how_many = c.size();
	}

	// If the given integer is in the set, this method removes it,
	// if not it does nothing
	public void omit(int i) {
		if (this.belongs(i)) {
			c.remove(new Integer(i));
			// Integer I = new Integer(i);
			// return c.contains(I)
		}
		how_many = c.size();
	}

	// returns how many integers are in the collection
	public int get_howmany() {
		return c.size();
	}

	// Prints all the integers in the collection
	public void print() {
		ListIterator<Integer> m = c.listIterator();
//		System.out.println();
		while (m.hasNext()) {
			System.out.println(m.next());
		}
	}

    // Returns true if both Intcoll5 instances contain
    // identical int collections
	public boolean equals(Intcoll5 obj) {
		return c.equals(obj.c);
	}
}
