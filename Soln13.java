public class Soln13 {
    public static void main(String[] args) {
     String a="III";
     int b=a.length();
     int[] d=new int[b];
     int el=0;
      
      for (int i = 0; i < b; i++) {
        char c=a.charAt(i);
        if (c=='I') {
            d[i]=1;
            
        }
         else if (c =='V') {
            d[i]=5;
        }
         else if (c =='X') {
            d[i]=10;
        }
         else if (c =='L') {
            d[i]=50;
        }
         else if (c =='C') {
            d[i]=100;
        }
         else if ( c=='D') {
            d[i]=500;
        }
          else if (c =='M') {
            d[i]=1000;
        }
     
      }
      el=d[b-1];
     System.out.println(el);
      
      for (int i = b-1; i > 0; i--) {
        if (d[i] > d[i - 1]) {
            System.out.println(el +"-"+d[i-1]);
            el =el - d[i-1];
            
        } else {
              System.out.println(el +"+"+d[i-1]);
            el += d[i-1];
            
        }
    }

System.out.println(el);



    
    }
    
}
