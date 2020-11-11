
public class driver {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.prepend("Test 1");
    list.prepend("Test 0");
    list.append("Test 2");
    while(list.count()>=1) {
      System.out.println("head: " + list.headValue() + "\ttail: " + list.tailValue());
      list.deleteTail();
      //list.deleteHead();
    }
    
    // Stack Tests
    StackLL myStack = new StackLL();
    System.out.println("Stack Empty: " + myStack.isEmpty() + "\tLength: " + myStack.getLength() + "\tpeek:  " + myStack.peek() );
    myStack.push("String 1");
    System.out.println("Stack Empty: " + myStack.isEmpty() + "\tLength: " + myStack.getLength() + "\tpeek:  \"" + myStack.peek() + "\"" );
    myStack.push("String 2");
    System.out.println("Stack Empty: " + myStack.isEmpty() + "\tLength: " + myStack.getLength() + "\tpeek:  \"" + myStack.peek() + "\"" );
    myStack.push("String 3");
    System.out.println("Stack Empty: " + myStack.isEmpty() + "\tLength: " + myStack.getLength() + "\tpeek:  \"" + myStack.peek() + "\"" );
    System.out.println("pop: \"" + myStack.pop() + "\"");
    System.out.println("Stack Empty: " + myStack.isEmpty() + "\tLength: " + myStack.getLength() + "\tpeek:  \"" + myStack.peek() + "\"" );
    
    System.out.println("pop: \"" + myStack.pop() + "\"");
    System.out.println("pop: \"" + myStack.pop() + "\"");
    System.out.println("pop: \"" + myStack.pop() + "\"");
    
    System.out.println("Stack Empty: " + myStack.isEmpty() + "\tLength: " + myStack.getLength() + "\tpeek:  \"" + myStack.peek() + "\"" );
    
    
    // Queue Tests
    QueueLL myQueue = new QueueLL();
    System.out.println("Queue empty? " + myQueue.isEmpty() + "\tLength: " + myQueue.getLength() + "\tpeek: \""+myQueue.peek()+"\"");
    myQueue.enqueue("String 1");
    System.out.println("Queue empty? " + myQueue.isEmpty() + "\tLength: " + myQueue.getLength() + "\tpeek: \""+myQueue.peek()+"\"");
    myQueue.enqueue("String 2");
    System.out.println("Queue empty? " + myQueue.isEmpty() + "\tLength: " + myQueue.getLength() + "\tpeek: \""+myQueue.peek()+"\"");
    myQueue.enqueue("String 3");
    System.out.println("Queue empty? " + myQueue.isEmpty() + "\tLength: " + myQueue.getLength() + "\tpeek: \""+myQueue.peek()+"\"");
    System.out.println("Dequeue: " + myQueue.dequeue());
    System.out.println("Dequeue: " + myQueue.dequeue());
    System.out.println("Dequeue: " + myQueue.dequeue());
    System.out.println("Dequeue: " + myQueue.dequeue());
    System.out.println("Queue empty? " + myQueue.isEmpty() + "\tLength: " + myQueue.getLength() + "\tpeek: \""+myQueue.peek()+"\"");
    
  }

}
