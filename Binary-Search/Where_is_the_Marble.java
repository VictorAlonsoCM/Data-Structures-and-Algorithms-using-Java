import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Where_is_the_Marble {

    static ArrayList <Integer> arrayC;
    static ArrayList <Integer> arrayQ;

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int c = 0, q = 0, cases = 1;
        do{
            arrayC = new ArrayList<>();
            arrayQ = new ArrayList<>();
            c = in.nextInt();
            q = in.nextInt();
            if(c > 0 && q > 0){
                for(int i = 0; i < c; i++){

                    arrayC.add(in.nextInt());
                }
                Collections.sort(arrayC);
                for(int i = 0; i < q; i++){
                    arrayQ.add(in.nextInt());
                }

                System.out.println("CASE# "+cases+":");
                cases++;

                for(int i = 0; i < q; i++){
                    System.out.println(postion(arrayQ.get(i)));
                }

            }
        }while(c > 0 && q > 0);
    }
    public static String postion(int q2){
        int lo = 0, hi = arrayC.size()-1, mid = 0;
        while(lo<hi){
            mid = ((lo + hi)/2);
            if(arrayC.get(mid) >= q2){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        mid=(hi+lo)/2;

        if(arrayC.get(mid) == q2){
            return arrayC.get(mid) +" found at " + (mid+1);
        }else{
            return q2 + " not found";
        }

    }
}
