public class Soln14{
    public static void main(String[] args) {
        String[] strs={"cat","cot"};
        if (strs == null || strs.length == 0) {
            System.out.println("");   
        }else if( strs.length == 1){
             String koko=strs[0];
             System.out.println(koko);  
        }

       
        int[] z = new int[200];
        char[][] newstr = new char[200][200];
        int a = strs.length;
        String lol = "";
        int lot=1;
        int b = strs[0].length();

        for (int i = 1; i < a; i++) {
            int c = strs[i].length();
            if (c < b) {
                b = c;
            }
        }

        for (int i = 0; i < b; i++) {
            char a1 = strs[0].charAt(i);
            for (int j = 1; j < a; j++) {
                char a2 = strs[j].charAt(i);
                if (a1 == a2) {
                    z[i] = z[i] + 1;
                    newstr[i][j] = a2;
                } else {
                    lot=56;
                    break;
                }
            }if (lot==56) {
                break;
                
            }
        }
        for (int i = 0; i < b; i++) {
            if (z[i] >= a - 1) {
                lol = lol + newstr[i][1];
            }
        }
        System.out.println(lol);
    }
}