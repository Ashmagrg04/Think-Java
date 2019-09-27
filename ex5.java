import java.util.*;
public class ex5{
    public static void main(String[]args){
        
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      System.out.println(sieve(n));
    }
    public static boolean[] sieve(int n){
       
      boolean[] result = new boolean[n];
      for (int i=2;i<10;i++)
           if (result[i] = true){
              for (int number=2;number<=(int)Math.sqrt(n);number++){
               if (result[number] == true){
                    for (int indexInSeries = number*number;indexInSeries < n;indexInSeries += number){
                  result[indexInSeries] = false;
                 }
            
               }
         
              }
            }
        return result;
      }
      
}
   
   