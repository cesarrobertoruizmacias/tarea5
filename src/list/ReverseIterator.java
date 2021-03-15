package list;

public class ReverseIterator {
    private Node tail;

    public ReverseIterator(Node tail) {
        this.tail = tail;
    }

    public boolean hasNext(){
        return tail != null;
    }

    public int next(){
        int data = tail.getData();

        tail = tail.getPrevious();

        return data;
    }
}