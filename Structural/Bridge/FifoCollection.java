package Structural.Bridge;

// This is the abstraction
public interface FifoCollection<T> {
    
    void offer(T element); // Adds element

    T poll(); // Removes and returns 1st element
}
