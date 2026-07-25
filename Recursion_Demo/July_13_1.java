import java.util.ArrayList;
import java.util.List;

public class July_13_1 {
    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {

            int size = res.size();

            for (int j = 0; j < size; j++) {

                List<Integer> list = new ArrayList<>(res.get(j));

                list.add(nums[i]);

                res.add(list);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> result=subsets(nums);
        System.out.println(result);

    }
}
//subsets-get the power set of subsets
