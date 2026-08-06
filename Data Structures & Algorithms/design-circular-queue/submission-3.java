class MyCircularQueue {

    int [] queue;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularQueue(int k) {

        this.queue = new int [k];
        this.front =0;
        this.rear= -1;
        this.size =0;
        this.capacity = k;
        
    }
    
    public boolean enQueue(int value) {
        if (!isFull()){
            rear=(rear+1)%(capacity);
            queue[rear]=value;
            size++;
            return true;
        }
        else return false;
    }
    
    public boolean deQueue() {
        if (!isEmpty()){
            front=(front+1)%capacity;
            size--;
            return true;
        }
        else return false;
        
    }
    
    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return queue[rear];
        
    }
    
    public boolean isEmpty() {
        if (size==0){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean isFull() {
        if (size==capacity){
            return true;
        }
        else{
            return false;
        }
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */