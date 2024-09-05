import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sp_ct= x-2;
        for(int i=1;i<=x;i++){
          for(int j=0;j<sp_ct;j++){
            System.out.print(" ");
          }
      sp_ct-=2;
      for(int j = 1;j<=i;j++) System.out.print(j);
      System.err.println("");
    }
  }
}
