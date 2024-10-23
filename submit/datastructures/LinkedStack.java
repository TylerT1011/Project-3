package datastructures;
import itsc2214.Node;
import itsc2214.StackADT;

/**
 * Linked list implementation of Stacks. 
 * 
 * @author ITSC 2214
 * @version 1.0
 * @param <T> 
 */
public class LinkedStack<T> implements StackADT<T> {
    /* top: the top of the stack */
    private Node<T> top;

    /* size: the number of elements in the stack */
    private int size;

    /**
     * Constructor.
     */
    public LinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * Insert an element on the top of the stack.
     * @param target input element
     */
    @Override
    public boolean push(T target) {        
        Node<T> newTop = new Node<T>(target, top);
        top = newTop;
        size++;
        return true;

    }

    /**
     * Remove out of the top of the stack.
     * @return the removed element
     */
    @Override
    public T pop() {
        if(! isEmpty())
        {
            T pop = top.getData();
            top = top.getNext();
            size--;
            return pop;
        }
        return null;   

    }

    /**
     * Retrieve the element on the top of the stack.
     * @return the element on the top of the stack
     */
    @Override
    public T topValue() {
        if (top != null)
        {
            return top.getData();
        }
        return null;
        
    }

    /**
    * Examine whether the stack is empty.
    * @return true: if the stack is empty
    *         false: if the stack is not empty
    */
    @Override
    public boolean isEmpty() {
        //Evaluate whether the stack is empty
        return size == 0;
    }

    /**
    * Retrieve the size.
    * @return number of elements in the queue
    */
    @Override
    public int size() {
        //Return the size of the stack 
        return size;
    }

    /**
     * Clear the stack.
     */
    @Override
    public void clear() {
        while (!this.isEmpty()) {
            this.pop();
        }
    }
}


