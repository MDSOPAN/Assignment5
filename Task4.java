import java.util.Scanner;


public class Task4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      int b_ptr= sc.nextInt();
      int count = sc.nextInt();
      int sum = 0;
      if(b_ptr%2!=0){
        sum = b_ptr;
        count--;
      }
      while(count!=0){
        if(b_ptr%2==0){
          ++b_ptr;
        }else{
          b_ptr+=2;
        }
        sum+=b_ptr;
        count--;
      }
      System.out.println(sum);
    }
    
  }
}