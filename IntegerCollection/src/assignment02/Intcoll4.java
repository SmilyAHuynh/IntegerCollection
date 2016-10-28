package assignment02;

public class Intcoll4 {
	private int how_many;
	private ListNode c;

	public Intcoll4() {
		how_many = 0;
		c = null;
	}

	private class ListNode {
		private int info;
		private ListNode link;

		public ListNode() {
			info = 0;
			link = null;
		}
	}

	// This method will go through the ListNode.
	// If int i is found, the method ends.
	// If not, the method will insert the integer.
	public void insert(int i) {
		if (i > 0) {
			ListNode p = c;
			while ((p != null) && (p.info != i)) {
				p = p.link;
			}
			if (p == null) {
				p = new ListNode();
				p.info = i;
				p.link = c;
				how_many++;
				c = p;
			}
		}
	}

	// This method will go through the ListNode.
	// If int i is found, the method removes it from the List.
	// If not, the method ends.
	public void omit(int i) {
		if (i > 0) {
			ListNode p = c;
			ListNode pred = null;
			while ((p != null) && (p.info != i)) {
				pred = p;
				p = p.link;
			}
			if (p != null) {
				how_many--;
				if (pred != null) {
					pred.link = p.link;
				} else {
					c = p.link;
				}
			}
		}
	}

	// This method will go through the ListNode.
	// If int i is found, the method prints true.
	// If not, false.
	public boolean belongs(int i) {
		boolean result = true;
		if (i > 0) {
			ListNode p = c;
			while ((p != null) && (p.info != i)) {
				p = p.link;
				result = (p != null);
			}
		} 
		return result;
	}

	// This method will go through the ListNode
	// and prints what is stored
	public void print() {
		ListNode p = c;
		while (p != null) {
			System.out.println(p.info);
			p = p.link;
		}
	}

	// This method will go through each ListNodes
	// and compares the size and what is stored
	// between the two ListNodes
	// If everything matches, prints true.
	// If not, false.
	public boolean equals(Intcoll4 obj) {
		boolean result = (how_many == obj.how_many);
		ListNode p = c;
		while ((p != null) && (result)) {
			result = obj.belongs(p.info);
			p = p.link;
		}
		return result;
	}

	// This method goes through one existing ListNode
	// for anything stored in it, makes a new ListNode
	// and copies the content over.
	public void copy(Intcoll4 obj) {
		if (this != obj) {
			this.how_many = obj.how_many;
		}
		if (obj.c == null) {
			c = null;
		} else {
			c = new ListNode();
			c.info = obj.c.info;
		}
	}

	// This method counts the number of
	// integers are inside the ListNode.
	public int get_howmany() {
		return how_many;
	}
}