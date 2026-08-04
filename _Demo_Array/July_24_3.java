import java.util.Stack;

public class July_24_3 {
    class twoStacks{
    int[] arr = new int[100];
    int size = 100;
    int top1, top2;
    Stack<Integer> st1;
    Stack<Integer> st2;
    twoStacks() {
     
        st1=new Stack<>();
        st2=new Stack<>();
        top1=-1;
        top2=-1;
    }

  
    void push1(int x) {
    
       top1++;
       st1.push(x);
        
    }

    void push2(int x) {
        // code here
        top2++;
        st2.push(x);
    }

    
    int pop1() {
     
      if(top1==-1)
      return -1;
      top1--;
      return st1.pop();
    }
        
   
    int pop2() {

        if(top2==-1)
      return -1;
      top2--;
      return st2.pop();
    }
}}
//implement two stacks of array