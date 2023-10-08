public class Soln20{

    public static void main(String[] args){
        String a="()(){}";

        int al=a.length();
        char ala,alal;
        if (al%2==0) {
            for (int i = 0; i < al; i=i+2) {
                ala=a.charAt(i);
                alal=a.charAt(+1);
                
                if(ala =='(') {
                    while (alal==')') {
                        System.out.println("()");
                        break;
                        
                    }
                }else if(ala =='{'){
                    while (alal=='}') {
                        System.out.println("{}");
                    break;
                        
                    }}else if(ala =='['){
                    while (alal==']') {
                        System.out.println("[]");
                      break;
                        
                    }   }
                
                  
                       
                
                }
                
            }
            
        }
    }
class Solution {
    public boolean isValid(String s) {
     
        String a=s;

        int al=a.length();
        char ala,alal;
        int lp=2;
        if (al%2==0) {
            for (int i = 0; i < al; i=i+2) {
                ala=a.charAt(i);
                alal=a.charAt(+1);
                
                if(ala =='(') {
                    while (alal!=')') {
                      return false;
                        
                        
                    }
                }else if(ala =='{'){
                    while (alal!='}') {
                      return false;
                    
                        
                    }}else if(ala =='['){
                    while (alal!=']') {
                      return false;
                     
                        
                    }   }
                
                  
                       
                
                } 
                }
                 return true;
            }
           
        }
    


        
    
