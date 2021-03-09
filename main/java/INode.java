public interface INode<S>
{
    S getKey();
    void setKey(S key);
    INode getNext();
    void setNext(INode next);

}