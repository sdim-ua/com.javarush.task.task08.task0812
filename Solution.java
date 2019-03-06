import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
             int s = Integer.parseInt(reader.readLine());
              num.add(s);
            
            }
            
             
           
            int max = 1;
            int posl = 1;
            
            for (int i = 0; i < num.size()-1; i++) {//
            if (num.get(i).equals(num.get(i+1))){
               posl++;
              }else {
               posl = 1;
            }
           if (max < posl){
                max = posl;
            }
        }
        System.out.println(max);
               
    }
}
