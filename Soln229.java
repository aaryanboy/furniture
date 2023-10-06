import java.util.ArrayList;
import java.util.List;

public class Soln229 {
   
    public List<Integer> majorityElement(int[] nums) {
        int b=nums.length;
        int c=b/3;
        int[] a;
              List<Integer> result = new ArrayList<>();
        for (int i=0; i<=b;i++){
        if (nums[i]<c){
          a[i]=nums[i];
            System.out.println("hello");
        }    
        }
      return result;

    }

}
