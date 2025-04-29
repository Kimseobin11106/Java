import java.util.EmptyStackException;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    //--- 실행 시 예외: 스택이 가득 참 ---//
    public static class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
            super("스택 가득참");
        }
    }

    //--- 실행 시 예외: 스택이 비어있음 ---//
    public static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
            super("스택 비어있음");
        }
    }

    //--- 생성자 ---//
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    //--- 스택에 x를 push ---//
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr ++] = x;
    }

    //--- 스택에 pop ---//
    public int pop() throws EmptyStackException {
        if(ptr <= 0)
            throw new EmptyStackException();
        return stk[-- ptr];
    }

    //--- 스택 조회 ---//
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for(int i=0; i<ptr; i++)
                System.out.print(stk[i]+" ");
            System.out.println();
        }
    }
}
