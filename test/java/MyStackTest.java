import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest
{
    @Test
    public void givenThreeNoWhenPushedTopShouldBeLastAddedNode() {
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(firstNode);
        myStack.printMyStack();
        myStack.push(secondNode);
        myStack.printMyStack();
        myStack.push(thirdNode);
        myStack.printMyStack();
        INode peak = myStack.top();
        Assertions.assertEquals(thirdNode,peak);
    }
    @Test
    public void givenThreeNoWhenPoppedShouldMatchThirdNode() {
        MyNode<Integer> MyFirstNode = new MyNode<>(70);
        MyNode<Integer> MySecondNode = new MyNode<>(30);
        MyNode<Integer> MyThirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();

        System.out.println("First Node Go to stack");
        myStack.push(MyFirstNode);
        myStack.printMyStack();
        System.out.println("Second Node Go to stack");
        myStack.push(MySecondNode);
        myStack.printMyStack();
        System.out.println("Third Node Go to stack");
        myStack.push(MyThirdNode);
        myStack.printMyStack();
        System.out.println("Delete Last Node From stack");
        INode pop = myStack.pop();
        myStack.printMyStack();

        Assertions.assertEquals(MyThirdNode,pop);
    }
}