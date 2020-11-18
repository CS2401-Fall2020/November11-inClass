
public class StackUsingQueue {
  QueueLL theQ;

  StackUsingQueue(){
    theQ = new QueueLL();
  }
  
  public void push(String inVal) {
    theQ.enqueue(inVal);
  }
  
  public String pop() {
    int myLen = getLength();
    for(int i=1; i<myLen; i++) {
      theQ.enqueue(theQ.dequeue());
    }
    return theQ.dequeue();
  }
  
  public boolean isEmpty() {
    return theQ.isEmpty();
  }
  
  public int getLength() {
    return theQ.getLength();
  }
  
  public String peek() {
    String temp = pop();
    push(temp);
    return temp;
  }
  
  public String toString() { return theQ.toString(); } 
}
