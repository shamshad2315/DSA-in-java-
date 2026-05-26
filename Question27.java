import java.util.*;

public class Question27 {
    public static boolean canWin(int leap , int []game){

        return check(0,leap,game);
    }
    public static boolean check(int index, int leap ,int[] game){
        if (index >= game.length){
            return true;
        }
        if (index < 0 || game[index] == 1) {
       return false;
        }
        game[index] = 1;
        return check(index + leap ,leap , game )
                ||check(index + 1,leap ,game)
                ||check(index - 1,leap , game);

    }
    public static void main(String[] args)
    {
            Scanner Scan = new Scanner(System.in);
                int q = Scan.nextInt();

                while (q--> 0){
                        int n = Scan.nextInt();
                        int leap = Scan.nextInt();

                        int []game = new int [n];

                        for(int i = 0; i < n ; i++){
                             game[i] = Scan.nextInt();
                        }
                        System.out.println((canWin(leap,game)) ? "yes" : "No");
                }
                Scan.close();

    }
}
