import java.util.ArrayList;
import java.util.Scanner;

public class The_Jackpot {

    static ArrayList<Integer> arraySQ;
    static ArrayList<Integer> maxSum;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        n = in.nextInt();
        while (n != 0) {
            arraySQ = new ArrayList<>();
            maxSum = new ArrayList<>();
            //Adder
            int max = 0;
            for (int i = 0; i < n; i++) {

                arraySQ.add(in.nextInt());
            }
            //if arraySQ is less than 0 it is not added to maxSum
            if(arraySQ.get(0)>0){
                maxSum.add(arraySQ.get(0));
            }else{
                maxSum.add(0);
            }

            for (int i = 1; i < n; i++) {
                //on each iteration we add the last maxSum+arraySQ
                maxSum.add((maxSum.get(i-1) + arraySQ.get(i)));
                //we compare the last sum and if it less than 0 we override that position with a 0
                //with that it will not affect our result in the next add.
                if (maxSum.get(i) < 0) {
                    maxSum.set(i, 0);
                }
                //if our adder is less than maxSum in the position it will be override
                if(max<maxSum.get(i)){
                    max = maxSum.get(i);
                }
            }
            if (max > 0) {
                System.out.println("The maximum winning streak is " + max + ".");
            } else {
                System.out.println("Losing streak.");
            }
            n = in.nextInt();
        }
    }
}
