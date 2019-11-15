package uselessclasses;
import java.util.EmptyStackException;
import java.util.LinkedList;


/*Useless classes consist of classes that don't have responsabilities on 
  their own. That is that they're often used to invoke useless methods which have
  an unneeded level of abstraction*/

public class UselessClasses {
    public static void main(String[] args) {
        /*Lets say we want to have a brand new class called myStack for dealing with
          stack related problems*/
        
        /*logic of the problem using myStack object's*/
    }
    
}


class myStack<T> {
    private LinkedList<T> stack;
    
    public myStack() {
        this.stack = new LinkedList<T>();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public T peek() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public T pop() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    public void push(T element) {
        stack.push(element);
    }

    public int size() {
        return stack.size();
    }

    public void makeEmpty() {
        stack.clear();
    }

    public String toString() {
        return stack.toString();
    }
    /*
    it may appear that empty, peek, pop, push, size and makeEmpty methods are relevant to our class
        but they show an unneeded level of abstraction by using the default methods of 
        a LinkedList object and just rename them in the myStack class.
    The same functionality can be achived by having the LinkedList on the main class
        instead of creating a hole new class.
    */
  
}