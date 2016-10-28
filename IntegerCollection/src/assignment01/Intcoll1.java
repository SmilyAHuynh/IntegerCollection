package assignment01;
import java.util.*;

public class Intcoll1 {
	int[] c;

	/* This default constructor creates a new array c of size 501
	 */
	public Intcoll1() {
		c = new int[500+1];
		c[0] = 0;
	}

	/* Another constructor that creates a new array
	 * the size i+1
	 */
	public Intcoll1(int i) {
		c = new int[i+1];
		c[0] = 0;
	}

	/* The copy method will copy what is in array c to obj
	 */
	public void copy(Intcoll1 obj) {
		if (this != obj) {
		c = new int[obj.c.length];
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
      	while ((c[j] != 0) && (c[j] != i))
      		j++;
      	return ((i>0) && (c[j] == i));
	}

	/* The insert method will add int i if it is not
	 * already in the collection 
	 */
	public void insert(int i) {
		if (i > 0) {
	 	int j = 0;
	     	while ((c[j] != 0) && (c[j] != i))
	     		j++;
	    if (c[j] == 0) {
			if (j == c.length - 1) {
				c = new int[i*2];
		   	}
		   	c[j] = i; c[j + 1] = 0;
		}
		}
	}

	/* The omit method will remove int i from the collection.
	 */
	public void omit(int i) {
		if (i>0) {
      		int j = 0;
      		while ((c[j] != 0) && (c[j] != i))
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
		int j=0, howmany=0;

		while (c[j]!=0) {
			howmany++;
			j++;
		}
		return howmany;
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
	public boolean equals(Intcoll1 obj) {
      	int j = 0;
      	boolean result = true;
      	while ((c[j] != 0) && result) {
         	result = obj.belongs(c[j]);
         	j++;
      	}
      	j = 0;
      	while ((obj.c[j] != 0) && result) {
         	result = belongs(obj.c[j]);
         	j++;
      	}
      	return result;
	}
}