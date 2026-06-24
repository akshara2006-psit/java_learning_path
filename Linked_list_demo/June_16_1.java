import java.util.ArrayList;
import java.util.List;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
public class June_16_1{
    public static int pairSum(ListNode head) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int n=list.size();
        for(int i=0;i<n;i++){
            sum=list.get(i)+list.get(n-1-i);
            ans=Math.max(ans,sum);
        }
        return ans;
    }
     public static void main(String[] args) {
        // Create linked list: 5 -> 4 -> 2 -> 1
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        
        int result = pairSum(head);

        System.out.println("Maximum Twin Sum = " + result);
    }
}
//maximum twin sum of a linked list