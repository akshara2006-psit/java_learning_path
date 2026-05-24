public class linkedlistimplementationofqueue {
     public static class Node{
            int  data;
            Node next=null;
            Node(int data)
            {
                this.data=data;
            }
        }
    public static class queueB{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x)
        {
            Node temp=new Node(x);
            if(size==0)
            {
                head=tail=temp;
            }
            else{
            tail.next=temp;
            tail=temp;}
             size++;
        }
        public Node remove()
        {
           if(size==0){
           System.out.println("queue is empty");
           return null;
           }
            head=head.next;
            size--;
            return head;

           
        }
         public int peek()
            {
                if(size==0){
                System.out.println("queue is empty");
                return -1;}
                return head.data;
            }
            public void display()
            {
                if(size==0)
                System.out.println("queue is empty");
                Node temp=head;
                while(temp!=null)
                {
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                System.out.println();
            }
       
       
    }
    public static void main(String[] args) {
        // Node head=new Node(1);
        // Node second=new Node(2);
        // Node third=new Node(3);
        // Node fourth=new Node(4);
        // Node fifth=new Node(5);
        // head.next=second;
        // second.next=third;
        // third.next=fourth;
        // fourth.next=fifth; 
         queueB q1=new queueB();
         q1.display();
         q1.add(1);
         q1.add(2);
         q1.add(3);
         
         q1.add(4);
         q1.display();
         System.out.println(q1.peek());


    
    
}
}