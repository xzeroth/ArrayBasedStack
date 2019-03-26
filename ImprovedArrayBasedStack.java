
public class ImprovedArrayBasedStack<T> implements ImprovedStackInterface<T> {

	private int top;
	private T[] stack;
	
	//Constructor
	public ImprovedArrayBasedStack() {
		top = -1;
		//downcasting object to parameterized types
		stack = (T[]) new Object[100];
	}
	
	public ImprovedArrayBasedStack(int size) {
		top = -1;
		//downcasting object to parameterized types
		stack = (T[]) new Object[size];
	}
	
	//methods implemented from interface
	public void push(T item) throws StackFullException{
		if(top < stack.length -1) {
			top++;
			stack[top] = item;
		}else {
			throw new StackFullException("Not enoughroom for one item");
		}
	}
	
	public void push(T item1, T item2) throws StackFullException{
		if(top < stack.length -2) {
			top++;
			stack[top] = item1;
			top++;
			stack[top] = item2;
		}else {
			throw new StackFullException("Not enough room for two items");
		}
	}
	
	public void pop() throws StackEmptyException{
		if(top > -1) {
			stack[top] = null;
			top--;
		}else {
			throw new StackEmptyException("No item to remove");
		}
	}
	
	public void doublePop() throws StackEmptyException{
		if(top > 0) {
			stack[top] = null;
			top--;
			stack[top] = null;
			top--;
		}else {
			throw new StackEmptyException("ther are less than two items in the stack");
		}
	}
	
	public T top() throws StackEmptyException{
		if(top > -1) {
			return stack[top];
		}else {
			throw new StackEmptyException("Top attempted on a empty stack");
		}
	}
	
	
}
