package dataStruct;

public class IntStack {
	private int size;
	private int[] stack;
	private int top;
	
	public IntStack() {
		this.size = 3;
		stack = new int[this.size];
		top = -1;
	}
	
	public boolean push(int item) {
		top++;
		stack[top] = item;
		return true;
	}
	
	public int pop() {
		return stack[--top];
	}
	
	public boolean isFull() {
		return (stack.length-1 == top);
	}
}
