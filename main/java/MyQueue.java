public class MyQueue {
    private final MyLinkedList myLinkedList;
    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }
    public void queue(INode myNode) {
        myLinkedList.add(myNode);
    }
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
    public INode peak() {
        return myLinkedList.head;
    }
    public INode dequeue() {
        return myLinkedList.pop();
    }
}