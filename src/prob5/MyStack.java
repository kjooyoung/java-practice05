package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
		top = -1;
	}

	public void push(String s) {
		System.out.println(buffer.length);
		for(int i=buffer.length-1; i>=0; i--) {
			if(buffer[i]== null) {
				buffer[i] = s;
				top++;
 			}
		}
	}

	public String pop() throws MyStackException {
		for(int i=0; i<buffer.length; i++) {
			if(buffer[i] != null) {
				top--;
				return buffer[i];
			}
		}
		return "d";
	}

	public boolean isEmpty() {
		return top == -1;
	}
}