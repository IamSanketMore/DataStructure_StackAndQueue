public class MyStack
{
    public MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }
    public INode top() {
        return myLinkedList.head;
    }
    public void printMyStack() {
        myLinkedList.printMyNodes();
    }

}