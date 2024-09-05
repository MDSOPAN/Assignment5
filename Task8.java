import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    while(x<=y){
        int cp =x;
        int sum=0;
        while(cp!=0){
            int l_dig= cp%10;
            cp=cp/10;
            sum+=l_dig*l_dig*l_dig;
        }
        if(sum==x){
            System.out.println(x);
        }
        x++;
    }
  }
}
