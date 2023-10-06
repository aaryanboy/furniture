public class Soln13 {
    public static void main(String[] args) {
     String a="MCMXCIV";
     int b=a.length();
     int d=0;
     int el=0;
      char c=a.charAt(0);
      if (c=='I') {
            d=1;
            
        }
         else if (c =='V') {
            d=5;
        }
         else if (c =='X') {
            d=10;
        }
         else if (c =='L') {
            d=50;
        }
         else if (c =='C') {
            d=100;
        }
         else if ( c=='D') {
            d=500;
        }
          else if (c =='M') {
            d=1000;
        }
     for (int i = 0; i < b; i++) {
       c=a.charAt(i);
       char e=a.charAt(i+1);



       if (c=='I') {
             el=1;
             if (c>e) {
                d=d-el;
                
            }else{
                d=d+el;
        }}
         else if (c =='V') {
            el =5;
            if (c>e) {
                d=d-el;
                
            }else{
                d=d+el;
        }
        }
         else if (c =='X') {
            el=10;
            if (c>e) {
                d=d-el;
                
            }else{
                d=d+el;
        }
        }
         else if (c =='L') {
            el=50;
            if (c>e) {
                d=d-el;
                
            }else{
                d=d+el;
        }
        }
         else if (c =='C') {
            el=100;
            if (c>e) {
                d=d-el;
                
            }else{
                d=d+el;
        }
        }
         else if ( c=='D') {
            el=500;
            if (c>e) {
                d=d-el;
                
            }else{
                d=d+el;
        }
        }
          else if (c =='M') {
            el=1000;
            if (c>e) {
                d=d-el;
                
            }else{
                d=d+el;
        }
        }
     }

    System.out.println(d);

    }
    
}
