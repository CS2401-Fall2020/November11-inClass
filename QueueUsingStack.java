
public class QueueUsingStack {
  // back of the queue is the top of the stack
  StackLL theS; 
  
  QueueUsingStack(){
    theS = new StackLL();
  }
  
  public void enqueue(String inVal){
    theS.push(inVal);
  }
  
  public String dequeue(){
    StackLL tempS = new StackLL();
    while(!theS.isEmpty()) {
      tempS.push(theS.pop());
    }
    String hold = tempS.pop();
    while(!tempS.isEmpty()) {
      theS.push(tempS.pop());
    }
    return hold;
  }
  
  public boolean isEmpty(){
    return theS.isEmpty();
  }
  
  public String peek(){
    StackLL tempS = new StackLL();
    while(!theS.isEmpty()) {
      tempS.push(theS.pop());
    }
    String hold = tempS.peek();
    while(!tempS.isEmpty()) {
      theS.push(tempS.pop());
    }
    return hold;
  }
  
  public int getLength() {
    return theS.getLength();
  }
  
  public String toString() { return theS.toString(); } 
  
}
