import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exact_Sum {

    static ArrayList <Integer> arrayP;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int b = 0, m = 0;
        do{
            b = in.nextInt();
            arrayP = new ArrayList<>();
            for(int i = 0; i < b; i++){
                arrayP.add(in.nextInt());
            }
            m = in.nextInt();
            Collections.sort(arrayP);
            System.out.println(books(m));

        }while(b != 0);
    }

    public static String books(int m){
        int lo = 0, hi = arrayP.size()-1;
        int bi = 0, bj = 0;
        while(lo<hi){
            if((arrayP.get(lo) + arrayP.get(hi)) > m){
                hi--;
            }else if((arrayP.get(lo) + arrayP.get(hi)) == m){
                bi = arrayP.get(lo);
                bj= arrayP.get(hi);
                lo++;
                hi--;
            }else{
                lo++;
            }
        }
        return "Peter should buy books whose prices are "+ bi +" and "+bj+".";
    }
}
