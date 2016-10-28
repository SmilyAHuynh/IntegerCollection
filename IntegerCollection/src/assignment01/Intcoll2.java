package assignment01;

public class Intcoll2 {
	int[] c;
	private int how_many = 0;

	/* This default constructor creates a new array c of size 500
	 */
	public Intcoll2() {
		c = new int[500];
		c[0] = 0;
	}

	/* Another constructor that creates a new array
	 * the size i+1
	 */
	public Intcoll2(int i) {
		c = new int[i+1];
		c[0] = 0;
	}

	/* The copy method will copy what is in array c to obj
	 */
	public void copy(Intcoll2 obj) {
		if (this != obj) {
			this.how_many = obj.how_many;
			int j = 0;
			while (obj.c[j] != 0) {
				c[j] = obj.c[j];
				j++;
			}
			c[j] = 0;
      	}
	}

	/* The belongs method will search array c for
	 * either 0 or the argument.
	 */
	public boolean belongs(int i) {
      	int j = 0;
      	while((j <= how_many) && (j != how_many))
      		j++;
      	return ((i>0) && (c[j] == i));
	}

	/* The insert method will add int i if it is not
	 * already in the collection 
	 */
	public void insert(int i) {
		if (i > 0) {
	 	int j = 0;
	     	while ((c[j] != how_many) && (c[j] != i))
	     		j++;
	    if (c[j] == 0) {
			if (j == c.length - 1) {
				c = new int[i*2];
				how_many++;
		   	}
		   	c[j] = i; c[j + 1] = 0;
		} else {
			how_many--;
		}
		}
	}

	/* The omit method will remove int i from the collection.
	 */
	public void omit(int i) {
		if (i>0) {
      		int j = 0;
      		while ((c[j] != how_many) && (c[j] != i))
      			j++;
      		if (c[j] == i) {
         		int k = j+1;
         		while (c[k] != 0)
         			k++;
         		c[j] = c[k-1];
         		c[k-1]=0;
      		}
		}
	}

	/* This method will update howmany each time
	 * it locates something in the array. 
	 */
	public int get_howmany() {
		int j=0;
		while (c[j]!=0) {
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
		while (c[j] != 0) {
			System.out.println(c[j]);
			j++;
		}
	}

	/* This method will check if the collection in
	 * obj are the same as array C.
	 */
	public boolean equals(Intcoll2 obj) {
      	int j = 0;
      	boolean result = true;
      	while ((c[j] != how_many) && result) {
      		result = (how_many == obj.how_many); 
          	j++;
      	}
      	return result;
	}
}