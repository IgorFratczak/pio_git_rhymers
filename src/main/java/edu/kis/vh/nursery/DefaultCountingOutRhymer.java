package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    final private int SIZE = 12;
    final private int[] NUMBERS = new int[SIZE];
    final private int CHECK = -1;
    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == CHECK;
    }

    public boolean isFull() {
        return total == SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return CHECK;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return CHECK;
        return NUMBERS[total--];
    }

}
