import java.util.Scanner;


public class Task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    
    while(true){
      int div_count=0;
      System.out.print("Enter Number: ");
    
      int n = sc.nextInt();
      System.out.print("\n");
      if(n%2!=0){
        break;
      }
      for(int i =1;i<=n;i++){
        if(n%i==0){
          div_count++;
        }
      }
      
      System.out.println(n+" has "+div_count+" divisors");
    }
     
  
  }
}