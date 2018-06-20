import java.util.Scanner;

public class Alphabet {

    static char[] sequence;
    static int[] lis;

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        sequence = str.toCharArray();
        lis = new int[sequence.length];
        System.out.println(lisMax());
    }

    public static int lisMax(){
        int max = 0;
        int alphabetLong = 26;
        for(int i = 0; i < lis.length; i++){
            lis[i] = 1;
        }
        for(int i = 1; i < sequence.length; i++){
            for(int j = 0; j < i; j++){
                if(sequence[j] < sequence[i] && lis[i] < lis[j]+1){
                    lis[i] = lis[j]+1;
                }
            }
        }
        for(int i = 0; i < lis.length; i++){
            if(max < lis[i]){
                max = lis[i];
            }
        }
        return (alphabetLong-max);
    }
}
