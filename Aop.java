import java.util.List;
import java.util.ArrayList;

public class Aop {
    public static void main(String[] args){
       Soln229 a=new Soln229();
       int[] b={2,3,4,2};
       List<Integer> Calu= new ArrayList<>();
       a.majorityElement(b);
      for (Integer num : Calu) {
         System.out.println(num);
      }
      


       /* Soln229 a=new Soln229();
        int[] nums1={2,3,4,5};

           List<Integer> result1 = a.majorityElement(nums1);
System.out.println(result1);
*/
        
        /* 
        Solnpalendro palendrone = new Solnpalendro();
        if (palendrone.isPalindrome(101)==true) {
            System.out.println("palendroe");
        } else {
            System.out.println("not palendrone");
        }*/
    }
}
