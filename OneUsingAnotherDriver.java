
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
  }

}
