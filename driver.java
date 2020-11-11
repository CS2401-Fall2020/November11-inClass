
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

  }

}
