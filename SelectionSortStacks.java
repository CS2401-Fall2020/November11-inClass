
public class SelectionSortStacks {
  public static void main(String[] args) {
    String[] myArr = {"C","F","D","A"};
    
    for(int i=0; i<myArr.length; i++) System.out.print(myArr[i] + " ");
    System.out.println();
    
    sort(myArr);
    
    for(int i=0; i<myArr.length; i++) System.out.print(myArr[i] + " ");
    System.out.println();
    
  }
  
  public static void sort(String[] inArr) {
    StackLL myStack = new StackLL();
    for(int i=0; i<inArr.length; i++) {
      int min = min(inArr, i, inArr.length-1);
      myStack.push(inArr[min]);
      inArr[min] = inArr[i];
    }
    
    // stack contains all the stuff in reverse order
    for(int i=inArr.length-1; i>=0; i--) {
      inArr[i] = myStack.pop();
    }
  }
  
  // finds the index of the minimum string in the range
  public static int min(String[] inArr, int start, int end) {
    int rtn = start;
    for(int i = start; i<= end; i++){
      if(inArr[i].compareTo(inArr[rtn]) < 0) {
        rtn = i;
      }
    }
    return rtn;
  }
}
