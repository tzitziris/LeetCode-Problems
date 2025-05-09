//225. Implement Stack using Queues
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyStack {

    private List<Integer> stack;

    public MyStack() {
        this.stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        int index = stack.size() - 1;
        int value = stack.get(index);
        stack.remove(index);
        return value;
    }

    public int top() {
        int index = stack.size() - 1;
        int value = stack.get(index);
        return value;
    }

    public boolean empty() {
        if (stack.size() == 0)
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */