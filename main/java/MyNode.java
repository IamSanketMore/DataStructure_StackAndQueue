public class MyNode<S> implements INode<S>
{
    private S key;
    private  INode next;



    public MyNode(S key)
    {
        this.key =key;
        this.next=null;
    }
    @Override
    public S getKey() {
        return key;
    }

    @Override
    public void setKey(S key) {
        this.key=key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}