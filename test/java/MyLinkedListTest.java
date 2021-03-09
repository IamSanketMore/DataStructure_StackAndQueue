import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    //Test Case For Given 3 numbers added on top of LinkedList
    @Test
    public void givenThreeNoWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    //Test Case For Given 3 numbers added on Last of LinkedList
    @Test
    public void givenThreeNoWhenAddedToLinkedListShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    //Test Case For Insert Number Between 2 nodes of LinkedList
    @Test
    public void givenNumberInsertBetweenTwoNodesOfLinkedListThenTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    //Test Case For delete first number of LinkedList
    @Test
    public void deleteGivenFirstNumberLinkedListThenTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        System.out.println("Before Delete First Element");
        myLinkedList.printMyNodes();
        myLinkedList.pop();
        System.out.println("After Delete First Element");
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.head.getNext().equals(myThirdNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    //Test Case For delete Last number of LinkedList
    @Test
    public void deleteGivenLastElementLinkedListThenTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        System.out.println("Before Delete First Element");
        myLinkedList.printMyNodes();
        myLinkedList.popLast();
        System.out.println("After Delete First Element");
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }

    //Search element in the Linked List
    @Test
    public void SearchGivenElementFromLinkedListThenTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        System.out.println("All Element in Linked List");
        myLinkedList.printMyNodes();
        Assertions.assertEquals(true, myLinkedList.search(mySecondNode));
    }

    //Insert element by search node
    @Test
    public void SearchNodeAndThenInsertElementInLinkedListThenTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> newNode = new MyNode<>(40);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        System.out.println("All Element in Linked List");
        myLinkedList.printMyNodes();
        INode newNodePosition = myLinkedList.insertingBySearching(newNode, mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                newNodePosition.getNext().equals(newNode) &&
                myLinkedList.tail.equals(myThirdNode);

        Assertions.assertTrue(result);
    }

    //Delete element at Specific Index
    @Test
    public void deleteElementAtSpecificIndexLinkedListThenTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        System.out.println("All Element in Linked List");
        myLinkedList.printMyNodes();

        myLinkedList.deleteAtIndex(myThirdNode);
        System.out.println("After delete Linked List");
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFourthNode);
        Assertions.assertTrue(result);
    }

    //Sort the linked list
    @Test
    public void given4NumbersShouldSortedInASECorderInLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myNewNode = new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();

        MyLinkedList.sorted(myFirstNode);
        MyLinkedList.printMyNodes();
        MyLinkedList.sorted(mySecondNode);
        MyLinkedList.printMyNodes();
        MyLinkedList.sorted(myThirdNode);
        MyLinkedList.printMyNodes();
        MyLinkedList.sorted(myNewNode);
        MyLinkedList.printMyNodes();

        System.out.println("Linked List Size :-"+MyLinkedList.getCounter());

        boolean result = MyLinkedList.head.equals(mySecondNode)
                && MyLinkedList.head.getNext().equals(myNewNode)
                && MyLinkedList.head.getNext().getNext().equals(myFirstNode)
                && MyLinkedList.head.getNext().getNext().getNext().equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}