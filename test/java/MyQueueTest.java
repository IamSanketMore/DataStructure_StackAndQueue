import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    MyQueue myQueue=new MyQueue();
    @Test
    public void givenThreeNoWhenAddedToQueueShouldReturnTrue() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        myQueue.queue(myFirstNode);
        myQueue.printQueue();
        myQueue.queue(mySecondNode);
        myQueue.printQueue();
        myQueue.queue(myThirdNode);
        myQueue.printQueue();
        INode peak=myQueue.peak();
        Assertions.assertEquals(peak, myThirdNode);
    }
}