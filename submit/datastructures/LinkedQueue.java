package datastructures;
import itsc2214.Node;
import itsc2214.QueueADT;

/**
 * Linked list implementation of Queues. 
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 * @param <T> 
 */
public class LinkedQueue<T> implements QueueADT<T> {
    /* front: the beginning of the queue */
    private Node<T> front;
    
    /* rear: the end of the queue */
    private Node<T> rear;
    
    /* size: the number of elements in the queue */
    private int size;
    
    /**
     * Constructor.
     */
    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }
    
    /**
     * Insert an element in the end of the queue.
     * @param target input element
     */
    @Override
    public boolean enqueue(T target) {
        Node<T> node = new Node<T>(target, null);
        if (isEmpty())
        {
            front = node;
            rear = node;
        }
        else
        {
            rear.setNext(node);
            rear = node;
        }
        size++;
    
        return true;
    }
    
    /**
     * Remove from the beginning of the queue.
     * @return the removed element
     */
    @Override
    public T dequeue() {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            T temp = front.getData();
            front = front.getNext();

            if (front == null)
            {
                rear = null;
            }

            size--;
            return temp;
        }
    }
    
    /**
     * Examine whether the queue is empty.
     * @return true: if the queue is empty
     *         false: if the queue is not empty
     */
    @Override
    public boolean isEmpty() {
        //Evaluate whether the queue is empty
        return size == 0;
    }
    
    /**
     * Retrieve the front.
     * @return the element in the beginning of the queue 
     */
    @Override
    public T frontValue() {
        if (isEmpty())
        {
            return null;
        }
        else
        {
            return front.getData();
        }
    }
    
    /**
     * Retrieve the size.
     * @return number of elements in the queue
     */
    @Override
    public int size() {
        //Return the size of the QueueADT
        return size;
    }

    /**
     * Clear the queue.
     */
    @Override
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }
}