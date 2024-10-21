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
        //TODO Instantiate the linked list-based data 
        //collection

        
    }

    /**
     * Insert an element on the top of the stack.
     * @param target input element
     */
    @Override
    public boolean push(T target) {
        //TODO Add targer to the top of the stack 
        //(represented by the top reference node)

        

    }

    /**
     * Remove out of the top of the stack.
     * @return the removed element
     */
    @Override
    public T pop() {
        //TODO Remove and return the top item on the stack
        //Corresponding to retrieve the top node and reset 
        //the top reference to the reference of its next node


        
    }

    /**
     * Retrieve the element on the top of the stack.
     * @return the element on the top of the stack
     */
    @Override
    public T topValue() {
        //TODO Return the top item on this stack, but do 
        //not modify the stack.
        //Corresponding to return the element in the node 
        //referred by the reference top

        
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

/*
 *     //**
     * main() function.
     * @param argv no arguments
     //
    public static void main(String argv[]){
        final  int iSIZE = 10;
        LinkedStack<String> stringStack = new LinkedStack<String>();
        
        String line;
        for (int i = 0; i < iSIZE; i++) {
            //push the new element
            stringStack.push(Integer.valueOf(i).toString());
        }
        try{            
            System.out.println("\nOpposite order is: ");
            for (int i = 0; i < iSIZE; i++){
                // TODO Remove an element in the order opposite to they were entered
                //      Save it to the String variable, named line
                line = stringStack.pop();
                
                System.out.println(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
 */

