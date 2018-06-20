import java.util.Scanner;

public class SolveIt {
    static int p, q, r, s, t, u;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        p = in.nextInt();
        q = in.nextInt();
        r = in.nextInt();
        s = in.nextInt();
        t = in.nextInt();
        u = in.nextInt();
        /*This example has a binary search done inside of the loop for */
        double lo = 0.0, hi = 1.0, mid = 0.0;
        for (int i = 0; i < 80; i++) {
            mid = (lo + hi) / 2;
            double y = calc(mid);
            if (y > 0) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        if (mid > 0 && mid < 1) {
            System.out.println(String.format("%.4f", mid));
        } else {
            System.out.println("No solution");
        }
    }

    public static double calc(double x){

        return p * Math.exp(-x) + q * Math.sin(x) + r * Math.cos(x) + s * Math.tan(x) + t * Math.pow(x, 2) + u;
    }
}
