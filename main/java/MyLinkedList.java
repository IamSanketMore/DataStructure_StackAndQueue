public class MyLinkedList {
    public static INode head;
    public static INode tail;

    public static int counter;

    public static int getCounter() {
        return counter;
    }
    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void add(INode newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }
        else {
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode myNode){
        if(this.head==null){
            this.head=myNode;
        }
        if(this.tail==null){
            this.tail=myNode;
        }
        else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    //Insert Method
    public void insert(INode myNode, INode newNode)
    {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    //--------------For Pop First element
    public INode pop()
    {
        INode tempNode= this.head;
        this.head=head.getNext();
        return tempNode;
    }
    //---------------For Last element
    public INode popLast()
    {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail))
        {
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode.setNext(null);
        return tempNode;
    }

    //Print  the Nodes method
    public static void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("my Nodes: ");
        INode tempNode=head;
        while (tempNode.getNext()!= null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
    // Search a Node from Linked List
    public boolean search(INode key)
    {
        INode tempNode = head;
        while(tempNode !=null && tempNode.getNext()!=null)
        {

            if (tempNode.getKey()==key.getKey()) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }
    // Insert element by searching node
    public INode insertingBySearching(INode newNode, INode insertNode) {
        insert(insertNode, newNode);
        INode newInsertedNode = head.getNext();
        return newInsertedNode;
    }

    public INode deleteAtIndex(INode element) {
        counter --;

        if (head.equals(element)) {
            INode del = head;
            head = head.getNext();
            return del;
        }
        INode tempDeleteNode= head;
        while (!tempDeleteNode.getNext().equals(element)) {
            tempDeleteNode = tempDeleteNode.getNext();
        }
        INode tempNode = tempDeleteNode.getNext();
        tempDeleteNode.setNext(tempDeleteNode.getNext().getNext());
        return tempNode;
    }
    public static void sorted(INode newNode) {
        counter++;
        INode currentNode = head;
        INode prevNode = null;
        while (currentNode != null && (int) newNode.getKey() > (int) currentNode.getKey()) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (prevNode == null) {
            head = newNode;
        } else {
            prevNode.setNext(newNode);
        }
        newNode.setNext(currentNode);
    }
}