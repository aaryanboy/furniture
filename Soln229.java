import java.util.ArrayList;
import java.util.List;

public class Soln229 {
   
    public void majorityElement(int[] nums) {
        int b=nums.length;
        int c=b/3;
        int[] a =new int[10];
              List<Integer> result = new ArrayList<>();
        for (int i=0; i<=b-1;i++){
        if (nums[i]<c){
          a[i]=nums[i];
          result.add(i, nums[i]);
        }    
        }
      for (Integer num : result) {
        System.out.println(num);
      }

    }

}
