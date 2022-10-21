import java.util.Scanner;
public class Main133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M = ");
        int m  = scanner.nextInt();
        int m1 = m;
        System.out.print("N = ");
        int n  = scanner.nextInt();
        int out = 0;
        int out1 = 0;
        while(out == 0)
        {
            m1 -=1;
            m +=1;
            if(m1 % n == 0)
                out = m1;
            if(m % n == 0)
                out1 = m;
            if(out!=0 || out1 != 0)
                out = maxnumber(out,out1);
        }
        if(m > 0)
            System.out.println("Output : " + out);
        else
            System.out.println("Output : -" + out);
        scanner.close();
    }

    private static int maxnumber(int out, int out1) {
        if(out < 0)
            out *=-1;
        if(out1 < 0)
            out1 *=-1;
        if(out>out1)
            return out;
        else
            return out1;
    }   
}
