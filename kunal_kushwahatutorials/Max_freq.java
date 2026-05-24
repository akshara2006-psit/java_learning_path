import java.util.HashMap;

public class Max_freq {
    public static void main(String[] args) {
        int[] arr={1,3,2,1,4,1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int el:arr)
        {
          if(!mp.containsKey(el))
          mp.put(el, 1);
          else
          mp.put(el,mp.get(el)+1);}
          int ans=0;
          int max=0;
          for(int n:mp.keySet())
          {
            
            if(mp.get(n)>max){
            max=mp.get(n);
            ans=n;  }
        }
        System.out.println("element that occurs most frequently is:");
        System.out.println(ans);
    }
    
}

