public class Solnpalendro {
        public boolean isPalindrome(int x) {
         int b=x;
            int c=b;
           int d=0;
            
            while (b!=0){
               
                d= d*10 +(b % 10);
                b=b/10;
                
            }
          return d==x;
        }
    
}
