
public class OneUsingAnotherDriver {

  public static void main(String[] args) {
    
    //StackLL myStack = new StackLL();
    StackUsingQueue myStack = new StackUsingQueue();
    myStack.push("3");
    myStack.push("10");
    myStack.push("4");
    myStack.push("7");
    System.out.println(myStack);
    System.out.println("Peek (should be 7) : " + myStack.peek());
    System.out.println(myStack);
    
    //StackLL myStack = new StackLL();
    QueueUsingStack myQueue = new QueueUsingStack();
    myQueue.enqueue("3");
    myQueue.enqueue("10");
    myQueue.enqueue("4");
    myQueue.enqueue("7");
    System.out.println(myQueue);
    System.out.println("Dequeue (should be 3) : " + myQueue.dequeue());
    System.out.println(myQueue);
  }

}
