import java.util.Scanner;


public class Task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    for(int i=1;i<=y;i++){
      for(int j = 1;j<=x;j++) System.out.print(j);
      System.err.println("");
    }
  }
}