import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        char[] alfabetAtas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        char[] alfabetBawah = {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Scanner myObj = new Scanner(System.in);
        System.out.println("ketikkan teks:");
        String input = myObj.nextLine();
        String teks = "";

        for (int i = 0; i < alfabetAtas.length; i++) {
            teks = String.valueOf(alfabetAtas[i]);
            System.out.println(teks);
            if(teks.equals(input)) {
                System.exit(0);
            }
            for (int j = 0; j < alfabet.length; j++) {
                teks = String.valueOf(alfabetAtas[i]) + String.valueOf(alfabet[j]);
                System.out.println(teks);
                if(teks.equals(input)) {
                    System.exit(0);
                }
                for (int k = 0; k < alfabet.length; k++) {
                    teks = String.valueOf(alfabetAtas[i]) + String.valueOf(alfabet[j]) + String.valueOf(alfabet[k]) ;
                    System.out.println(teks);
                    if(teks.equals(input)) {
                        System.exit(0);
                    }
                    for (int l = 0; l < alfabet.length; l++) {
                        teks = String.valueOf(alfabetAtas[i]) + String.valueOf(alfabet[j]) + String.valueOf(alfabet[k]) + String.valueOf(alfabet[l]);
                        System.out.println(teks);
                        if(teks.equals(input)) {
                            System.exit(0);
                        }
                        for (int m = 0; m < alfabet.length; m++) {
                            teks = String.valueOf(alfabetAtas[i]) + String.valueOf(alfabet[j]) + String.valueOf(alfabet[k]) + String.valueOf(alfabet[l])
                                    + String.valueOf(alfabet[m]);
                            System.out.println(teks);
                            if(teks.equals(input)) {
                                System.exit(0);
                            }
                            for (int n = 0; n < alfabet.length; n++) {
                                teks = String.valueOf(alfabetAtas[i]) + String.valueOf(alfabet[j]) + String.valueOf(alfabet[k]) + String.valueOf(alfabet[l])
                                        + String.valueOf(alfabet[m]) + String.valueOf(alfabet[n]);
                                System.out.println(teks);
                                if(teks.equals(input)) {
                                    System.exit(0);
                                }
                                for (int o = 0; o < alfabet.length; o++) {
                                    teks = String.valueOf(alfabetAtas[i]) + String.valueOf(alfabet[j]) + String.valueOf(alfabet[k]) + String.valueOf(alfabet[l])
                                            + String.valueOf(alfabet[m]) + String.valueOf(alfabet[n]) + String.valueOf(alfabet[o]);
                                    System.out.println(teks);
                                    if(teks.equals(input)) {
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
