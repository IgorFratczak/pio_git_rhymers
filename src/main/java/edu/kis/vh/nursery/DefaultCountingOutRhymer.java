package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    final private int SIZE = 12;
    final private int[] NUMBERS = new int[SIZE];
    final int EMPTY_STACK_VALUE = -1;
    final int ERROR_RETURN_VALUE = -1;
    public int total = -1;
    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }


    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_RETURN_VALUE;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERROR_RETURN_VALUE;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

}
