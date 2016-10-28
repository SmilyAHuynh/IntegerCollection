package assignment04;

public class Intcoll6 {
	private int how_many;
	private btNode c;
	
	private static class btNode {
		int info;
		btNode lt;
		btNode rt;

		private btNode(int i, btNode left, btNode right) {
			info = i;
			lt = left;
			rt = right;
		}

		private btNode() {
			info = 0;
			lt = null;
			rt = null;
		}
	}

//	The main constructor. Creates a new collection.
	public Intcoll6() {
		c = null;
		how_many = 0;
	}

//	The alternate constructor. Creates a new collection of ints.
	public Intcoll6(int i) {
		c = null;
		how_many = 0;
	}

//	Inserts the integer it's passed in the parameter
//	if it is not already present in the array.
	public void insert(int i) {
		btNode p = c, pred = null;
		while ((p != null) && (p.info != i)) {
			pred = p;
			if (i < p.info) {
				p = p.lt;
			} else if (i > p.info) {
				p = p.rt;
			}
		}
		if (p == null) {
			how_many++;
			p = new btNode();
			if (pred != null) {
				if (i < pred.info) {
					pred.lt = p;
				} else {
					pred.rt = p;
				}
				p.info = i;
			} else {
				c = p;
				p.info = i;
			}
		}
	}
	
//	Removes an integer from the array if it is present.
	public void omit(int i) {
		btNode p = c, pred = null;
		while (p != null && p.info != i) {
			pred = p;
			if (p.info < i) {
				p = p.rt;
			} else {
				p = p.lt;
			}
		}
		if (p != null) {
			btNode q = p;
			if (p.rt == null) {
				q = p.lt;
			} else if (p.lt == null) {
				q = p.rt;
			} else {
				btNode j = p.lt;
				if (j.rt == null) {
					q = j;
					q.rt = p.rt;
				} else {
					while (j.rt.rt != null)
						j = j.rt;
					q = j.rt;
					j.rt = q.lt;
					q.rt = p.rt;
					q.lt = p.lt;
				}
			}
			if (pred == null) {
				c = q;
			} else if (pred.rt == p) {
				pred.rt = q;
			} else {
				pred.lt = q;
			}
			how_many--;
		}
	}
	
//	Creates a new Intcoll6 object based on the contents
//	of an existing Intcoll6 object.
	public void copy(Intcoll6 obj) {
		if (this != obj) {
			how_many = obj.how_many;
			c = copy(obj.c);
		}
	}

	private btNode copy(btNode obj) {
		btNode result = null;
		if (obj != null) {
			result = new btNode();
			result.info = obj.info;
			result.lt = copy(obj.lt);
			result.rt = copy(obj.rt);
		}
		return result;
	}
	
//	Prints every integer
	private static void printtree(btNode t) {
		if (t != null) {
			printtree(t.lt);
			System.out.println(t.info);
			printtree(t.rt);
		}
	}

	public void print() {
		printtree(c);
		System.out.println();
	}
	
//	This method checks if an integer is present in the array.	
	public boolean belongs(int i) {
		boolean result = true;
		btNode p = c;
		while((p != null) & (p.info != i)) {
			if(i < p.info) {
				p = p.lt;
			} else {
				p = p.rt;
			}
		}
		return result;
	}

//	Counts the number of ints in the array
	public int get_howmany() {
		return how_many;
	}
	
//	Compares two Intcoll6 objects to see if they
//	contain matching sets of integers.
	public boolean equals(Intcoll6 obj) {
		boolean result = (how_many == obj.how_many);
		if (result) {
			int a[] = new int[how_many];
			int b[] = new int[how_many];

			toArray(c, a, 0);
			toArray(obj.c, b, 0);

			for (int j = 0; j < how_many; j++) {
				if (a[j] == b[j]) {
					result = true;
				} else {
					result = false;
				}
			}
		}
		return result;
	}

    private static int toArray(btNode b, int[] a, int i) {
        if(b!=null) {
            i = toArray(b.lt, a, i);
            a[i++] = b.info;
            i = toArray(b.rt, a, i);
        }
        return i;
    }
}
