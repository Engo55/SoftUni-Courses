package advanced.Workshop.Lab;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
    private int capacity;
    private int size;
    private int[] items;

    public CustomStack() {
        this.capacity = INITIAL_CAPACITY;
        this.items = new int[this.capacity];
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void push(int element) {
        // resize if the size is equal to the capacity
        if (this.size == this.capacity) {
            this.resize();
        }

        this.items[this.size++] = element;
    }

    private void resize() {
        this.capacity *= 2;
        int[] copy = new int[this.capacity];

        for (int i = 0; i < this.items.length; i++) {
            copy[i] = this.items[i];
        }

        this.items = copy;
    }

    public int pop() {
        // throw NoSuchElementException if the size is zero
        checkEmpty();
        int element = this.items[this.size - 1];
        this.size--;
        return element;
    }

    public int peek() {
        return this.items[size - 1];
    }

    private void checkEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("CustomStack is empty");
        }
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
    }
}














