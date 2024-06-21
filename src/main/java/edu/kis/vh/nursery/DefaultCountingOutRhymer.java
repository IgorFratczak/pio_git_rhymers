package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    final private int SIZE = 12;
    final private int[] NUMBERS = new int[SIZE];
    private final int EMPTY_STACK_VALUE = -1;
    private final int ERROR_RETURN_VALUE = -1;
    private int total = -1;
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

    public int getSIZE() {
        return SIZE;
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }

    private int getEMPTY_STACK_VALUE() {
        return EMPTY_STACK_VALUE;
    }

    private int getERROR_RETURN_VALUE() {
        return ERROR_RETURN_VALUE;
    }

    private void setTotal(int total) {
        this.total = total;
    }
}
