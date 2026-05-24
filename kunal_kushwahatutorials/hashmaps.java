import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args) {
        // String name="Kunal";
        // int code=name.hashCode();
        // System.out.println(code);//it is not giving any random code it is actually doing some sort of calculation as per defined func in computers memory
        // Integer a=223456782;
        // int re=a.hashCode();
        // System.out.println(a.hashCode());//this Integer is not primitive data type and for any Integer it generates the same hashcode as number


     //Declaration
        HashMap<String,Integer>mp=new HashMap<>();
        //Adding Elements
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        //Getting value of a key from the HashMap
        System.out.println(mp.get("Yash"));//16
        System.out.println(mp.get("Rahul"));//null

        //changing/updating value of a key in the HashMap
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));//25

        //removing a pair from the HashMap
       System.out.println(mp.remove("Akash"));
       System.out.println(mp.remove("Rahul"));
       //Checking if a key in the HashMap
       System.out.println(mp.containsKey("Akash"));//false
       System.out.println(mp.containsKey("Harry"));//true

       //Adding a new entry only if the new key does not exist already
       mp.putIfAbsent("Yashika",56);//will enter yashika in map
       mp.putIfAbsent("Yash",30);//will not enter

       //get all keys in the Hashmap
       System.out.println(mp.keySet());
       //get all keys in the hashmap
       System.out.println(mp.values());
       //get all entries in the hashmap
       System.out.println(mp.entrySet());

       //traverisng all entries of hashmap-multiple methods
       for(String key:mp.keySet())
       {
        System.out.printf("Age of %s is %d",key,mp.get(key));
       }
       for(var e:mp.entrySet())
       {
        System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
       }


    }
    
}
