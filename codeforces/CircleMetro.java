import java.util.Scanner;
public class CircleMetro{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int x = in.nextInt();
        int b = in.nextInt();
        int y = in.nextInt();
        
        boolean flag = true;
        while(true) {
            if (a == b) {
                break;
            }
            
            if (a == x || b == y) {
                flag = false;
                break;
            }
            
            if (a == n)
                a = 1;
            else 
                ++a;
                
            if (b == 1)
                b = n;
            else
                --b;
        }
        
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
