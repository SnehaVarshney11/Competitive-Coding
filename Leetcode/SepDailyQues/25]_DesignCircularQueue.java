package Leetcode.SepDailyQues;


class DesignCircularQueue {
    int maxSize, head = 0, tail = -1;
    int[] data;
    public void MyCircularQueue(int k) {
        data = new int[k];
        maxSize = k;
    }
    public boolean enQueue(int val) {
        if (isFull()) return false;
        tail = (tail + 1) % maxSize;
        data[tail] = val;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty()) return false;
        if (head == tail) {
            head = 0;
            tail = -1;
        } else head = (head + 1) % maxSize;
        return true;
    }
    public int Front() {
        return isEmpty() ? -1 : data[head];
    }
    public int Rear() {
        return isEmpty() ? -1 : data[tail];
    }
    public boolean isEmpty() {
        return tail == -1;
    }
    public boolean isFull() {
        return !isEmpty() && (tail + 1) % maxSize == head;
    }
}
