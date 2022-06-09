import java.lang.Math;
import java.util.Objects;

public class BruteForce {

public static void bruteforce(String tebak, String input, int awal, int cur) {
    char[] alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


    if(cur == 0) {
        System.out.println(tebak);
        if(Objects.equals(tebak, input)) {
            System.exit(0);
        }


    } else {
        for(int i = awal; i < alfabet.length; i++){
            bruteforce(tebak + alfabet[i],input, i,cur-1);
        }
    }
}

    public static void main(String[] args) {
        BruteForce bruteForce = new BruteForce();
        for(int i = 1; i < 6; i++){
            BruteForce.bruteforce("","enzo",0,i);
        }
    }
}

