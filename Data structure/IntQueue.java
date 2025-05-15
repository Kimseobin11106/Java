public class IntQueue {

    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    //--- 실행시 예외: 큐가 비어있음---//
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
            super("큐 비어있음");
        }
    }

    //--- 실행시 예외: 큐가 가득찼음---//
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
            super("큐 가득참");
        }
    }

    //생성자
    public IntQueue (int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;

        try {
            que = new int[capacity];
        } catch(OutOfMemoryError e) {
            capacity = 0;
        }
    }

    //--- 큐에 데이터를 인큐 데이터 입력 ---//

    public int enque(int x) throws OverflowIntQueueException {
        if(num >= capacity)
            throw new OverflowIntQueueException();
        que[rear++]=x;
        num++;
        if(rear==capacity)
            rear = 0;
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if(front==capacity)
            front = 0;
        return x;
    }

    //--- 큐를 비움 ---//
    public void clear() {
        num = front = rear = 0;
    }

    public void dump() {
        if(num <= 0) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for(int i = 0; i < num; i++) {
                int idx = (front + i) % capacity;
                System.out.println(que[idx]);
            }
        }
    }
}
