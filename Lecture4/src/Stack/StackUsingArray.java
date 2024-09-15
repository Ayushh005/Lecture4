package Stack;

public class StackUsingArray {
    private int data[];
    private int top;

    public StackUsingArray(){               //  default constructor
        data = new int[10];
        top = -1;
    }
    public StackUsingArray(int capacity){               //  user defines size
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int size(){
        return top+1;
    }

    public int top() throws StackEmptyException{
        if (size() == 0){
            // stack empty exception
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        else {
            return data[top];
        }
    }

    public void push(int elem) throws StackFullException{
        if (size() == data.length){
            StackFullException e = new StackFullException();
            throw e;
        }
        top++;
        data[top] = elem;
    }

    public int pop() throws StackEmptyException{
        if (size()==0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
}
