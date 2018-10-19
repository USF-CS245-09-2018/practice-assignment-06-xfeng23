
public class ArrayStack implements Stack{

	private Object[] arr; 
	private int top; 
	
	public Object[] getArr() {
		return this.arr; 
	}

	public ArrayStack() {
		top = -1; 
		arr = new Object[10]; 
	}

	
	@Override
	public void push(Object item) {
		if (top == arr.length - 1) {
			grow_array(); 
		} 
		arr[++top] = item; 
		
	}

	@Override
	public Object pop() {
		return arr[top--]; 
	}

	@Override
	public Object peek() {
		return arr[top]; 
	}

	@Override
	public boolean empty() {
		return top == -1; 
	}
	
	private void grow_array() {
		Object[] newArr = new Object[arr.length * 2]; 
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i]; 
		}
		arr = newArr; 
	}

}
