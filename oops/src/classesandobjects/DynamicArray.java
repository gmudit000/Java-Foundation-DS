package classesandobjects;

public class DynamicArray {
	private int[] data;
	private int nextElementIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		return nextElementIndex==0;
	}
	
	public int get(int i) {
		if(i >= nextElementIndex) {
			// throw error, because value is not assigned there
			return -1;   // for now this
		}
		return data[i];
	}
	
	public void set(int index, int value) {
		if(index >= nextElementIndex) {
			// throw error, because value is not assigned there
			return;   // for now this
		}
		data[index] = value;
	}
	
	public void add(int element) {
		// if nextElementIndex is equal to data.length, then double the length of array
		if(nextElementIndex == data.length) {
			doublecapacity();
		}
		
		// Now add element
		data[nextElementIndex] = element;
		nextElementIndex++;
		
	}
	
	private void doublecapacity() {
		//  first store reference of data array
		int temp[] = data;
		// double the length of array
		data = new int[2*data.length];
		
		// from temp array copy elements to new array
		for(int i = 0 ; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}

	// remove last element and return its index
	public int removeLastElement() {
		if(nextElementIndex == 0) {
			return -1;
		}
		int lastElementValue = data[nextElementIndex-1];
//		data[nextElementIndex-1] = 0;
		nextElementIndex--;
		return lastElementValue;
	}

}


/*
 * // checking if degree is smaller to initial degree then storing
                if(i + j <=p.degree)
                    p.setCoefficient( i + j ,p.DynArray[i+j]+p1.DynArray[i] * this.DynArray[j]);
                else
                    // otherwise we'll not have anythig there to add so just putting multiply result
                   // this is similar step just like u do in maths multiplication
                    p.setCoefficient(i + j ,p1.DynArray[i] * this.DynArray[j]);
*/
