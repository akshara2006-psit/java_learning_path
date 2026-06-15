public class June_15_2 {
    public static void main(String[] args) {
        String str="LIELIEILIEAMLIECOOL";
        String sub="LIE";
        String result=str.replaceAll(sub, " ");
        result=result.trim();
        System.out.println("the final answer is: "+result);

    }
}
//replace all occureneces of a string with space