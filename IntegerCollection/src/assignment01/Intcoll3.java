package assignment01;

public class Intcoll3 {
	private boolean[] c;
	private int how_many = 0;

	/* This default constructor creates a new array c of size 500
	 */
	public Intcoll3() {
		c = new boolean[500];
		c[0] = false;
	}

	/* Another constructor that creates a new array
	 * the size i+1
	 */
	public Intcoll3(int i) {
		c = new boolean[i+1];
		c[0] = false;
	}

	/* The copy method will copy what is in array c to obj
	 */
	public void copy(Intcoll3 obj) {
		if (this != obj) {
	   		c = new boolean[obj.c.length];
			int j = 0;
			while (obj.c[j] != false) {
				c[j] = obj.c[j];
				j++;
			}
			c[j] = false;
      	}
	}

	/* The belongs method will search array c for
	 * either 0 or the argument.
	 */
	public boolean belongs(int i) {
		boolean result = false;
		if (i < c.length -1) {
			result = c[i];
		}
		return result;
	}

	/* The insert method will add int i if it is not
	 * already in the collection 
	 */
	public void insert(int i) {
		if (i > 0) {
	 	int j = 0;
	     	while ((c[j] != false) && (c[j] != true))
	     		j++;
	    if (c[j] == false) {
			if (j == c.length - 1) {
				c = new boolean[i*2];
		   	}
		   	c[j] = true;
		   	c[j + 1] = false;
	    }
	    }
	}

	/* The omit method will remove int i from the collection.
	 */
	public void omit(boolean i) {
		if (i != false) {
      		int j = 0;
      		while ((c[j] != false) && (c[j] != i))
      			j++;
      		if (c[j] == i) {
         		int k = j+1;
         		while (c[k] != false)
         			k++;
         		c[j] = c[k-1];
         		c[k-1]= false;
      		}
		}
	}

	/* This method will update howmany each time
	 * it locates something in the array. 
	 */
	public int get_howmany() {
		int j=0;
		while (c[j] != false) {
			how_many++;
			j++;
		}
		return how_many;
	}

	/* The print method will return every int in array c. 
	 */
	public void print() {
		int j = 0;
		System.out.println();
		while (c[j] != false) {
			System.out.println(c[j]);
			j++;
		}
	}

	/* This method will check if the collection in
	 * obj are the same as array C.
	 */
	public boolean equals(Intcoll3 obj) {
      	int j = 0;
      	boolean result = (how_many == obj.how_many);
      	while ((c[j] != false) && result) {
      		result = (how_many == obj.how_many); 
          	j++;
      	}
      	j = 0;
      	return result;
	}
}