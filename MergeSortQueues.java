
public class MergeSortQueues {

  public static void main(String[] args) {
    QueueLL myQ = new QueueLL();
    myQ.enqueue("A");
    myQ.enqueue("B");
    myQ.enqueue("C");
    myQ.enqueue("D");
    myQ.enqueue("E");
    myQ.enqueue("F");
    System.out.println(myQ);
    sort(myQ);
    System.out.println(myQ);
  }
  
  // given a possibly unsorted queue
  // split into two queues, sort them, 
  // then use the merge method to put the values back 
  public static void sort(QueueLL inQ) {
    // base case(s)
    if(inQ.isEmpty() || inQ.getLength()==1) return;
    
    QueueLL left = new QueueLL();
    QueueLL right = new QueueLL();
    boolean addToLeft = true;
    while(!inQ.isEmpty()) {
      if(addToLeft) {
        left.enqueue(inQ.dequeue());
        addToLeft = false;
      }else {
        right.enqueue(inQ.dequeue());
        addToLeft = true;
      }
    }
    
    // recursive calls
    sort(left);
    sort(right);
    merge(inQ, left, right);
    
  }
  
  // given two sorted queues (minimum in at the front)
  // merge them into a third queue (again, minimum at the front)
  public static void merge(QueueLL outQ, QueueLL inQ1, QueueLL inQ2) {
    while(!(inQ1.isEmpty() || inQ2.isEmpty())) { // !(A|B) --> !A&!B
      if(inQ1.peek().compareTo(inQ2.peek()) < 0){
        outQ.enqueue(inQ1.dequeue());
      }else {
        outQ.enqueue(inQ2.dequeue());
      }
    }
    // at least one of them is empty
    // not both
    while(!inQ1.isEmpty()) {
      outQ.enqueue(inQ1.dequeue());
    }
    while(!inQ2.isEmpty()) {
      outQ.enqueue(inQ2.dequeue());
    }
  }

}
