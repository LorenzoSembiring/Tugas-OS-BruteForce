import java.util.Objects;
import java.util.Scanner;

public class Main {
    static char[] alfabetAtas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
    static char[] alfabetBawah = {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("0");
//        System.out.println("Masukkan teks yang akan di brute force:");
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();

        System.out.println("<-----------batas uji------------>");
//        string.append(alfabet[1]);
        System.out.println(string);
        string.setCharAt(0, alfabet[3]);
        System.out.println(string);
        String tebak = string.toString();
        String uji;
//        System.out.println("tebak adalah:" + tebak);
        System.out.println("<-----------batas uji------------>");


//        for (int j = 0; j < alfabet.length; j++) {
//            if(!tebak.equals(input)){
//                string.setCharAt(0, alfabet[j]);
//                System.out.println(string);
//                uji = string.toString();
////                System.out.println("uji: " + uji);
//                if(uji.equals("z") || uji.equals("zz")){
//                    string.append("a");
//                    for (int i = 0; i < alfabet.length; i++){
//                        string.setCharAt(0,alfabet[i]);
//                        for (int k = 0; k < alfabet.length; k++){
//                            string.setCharAt(1,alfabet[k]);
//                            System.out.println(string);
//                        }
//                        System.out.println(string);
//                    }
////                    System.out.println(string);
//                }
//            }
//            tebak = string.toString();
//        }

        if (input.length() == 1) {
            for (int a = 0; a < alfabetAtas.length; a++) {
                System.out.print(alfabetAtas[a]);
                System.out.println("");
            }
            for (int b = 0; b < alfabetBawah.length; b++) {
                System.out.print(alfabetBawah[b]);
                System.out.println("");
            }
        } else if (input.length() == 2) {
            for (int a = 0; a < alfabetAtas.length; a++) {
                for (int b = 0; b < alfabet.length; b++) {
                    System.out.print(alfabetAtas[a]);
                    System.out.print(alfabet[b]);
                    System.out.println("");
                }
            }
            for (int c = 0; c < alfabetBawah.length; c++) {
                for (int d = 0; d < alfabet.length; d++) {
                    System.out.print(alfabetBawah[c]);
                    System.out.print(alfabet[d]);
                    System.out.println("");
                }
            }
        } else if (input.length() == 3) {
            for (int i = 0; i < alfabetAtas.length; i++) {
                for (int j = 0; j < alfabet.length; j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        System.out.print(alfabetAtas[i]);
                        System.out.print(alfabet[j]);
                        System.out.print(alfabet[k]);
                        System.out.println("");
                    }
                }
            }
            for (int l = 0; l < alfabetBawah.length; l++) {
                for (int m = 0; m < alfabet.length; m++) {
                    for (int n = 0; n < alfabet.length; n++) {
                        System.out.print(alfabetBawah[l]);
                        System.out.print(alfabet[m]);
                        System.out.print(alfabet[n]);
                        System.out.println("");
                    }
                }
            }
        } else if (input.length() == 4) {
            for (int i = 0; i < alfabetAtas.length; i++) {
                for (int j = 0; j < alfabet.length; j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        for (int l = 0; l < alfabet.length; l++) {
                            System.out.print(alfabetAtas[i]);
                            System.out.print(alfabet[j]);
                            System.out.print(alfabet[k]);
                            System.out.print(alfabet[l]);
                            System.out.println("");
                        }
                    }
                }
            }
            for (int i = 0; i < alfabetBawah.length; i++) {
                for (int j = 0; j < alfabet.length; j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        for (int l = 0; l < alfabet.length; l++) {
                            System.out.print(alfabetBawah[i]);
                            System.out.print(alfabet[j]);
                            System.out.print(alfabet[k]);
                            System.out.print(alfabet[l]);
                            System.out.println("");
                        }
                    }
                }
            }
        } else if (input.length() == 5) {
            for (int i = 0; i < alfabetAtas.length; i++) {
                for (int j = 0; j < alfabet.length; j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        for (int l = 0; l < alfabet.length; l++) {
                            for (int m = 0; m < alfabet.length; m++) {
                                System.out.print(alfabetAtas[i]);
                                System.out.print(alfabet[j]);
                                System.out.print(alfabet[k]);
                                System.out.print(alfabet[l]);
                                System.out.print(alfabet[m]);
                                System.out.println("");
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < alfabetBawah.length; i++) {
                for (int j = 0; j < alfabet.length; j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        for (int l = 0; l < alfabet.length; l++) {
                            for (int m = 0; m < alfabet.length; m++) {
                                System.out.print(alfabetBawah[i]);
                                System.out.print(alfabet[j]);
                                System.out.print(alfabet[k]);
                                System.out.print(alfabet[l]);
                                System.out.print(alfabet[m]);
                                System.out.println("");
                            }
                        }
                    }
                }
            }
        } else if (input.length() == 6) {
            for (int i = 0; i < alfabetAtas.length; i++) {
                for (int j = 0; j < alfabet.length; j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        for (int l = 0; l < alfabet.length; l++) {
                            for (int m = 0; m < alfabet.length; m++) {
                                for (int n = 0; n < alfabet.length; n++) {
                                    System.out.print(alfabetAtas[i]);
                                    System.out.print(alfabet[j]);
                                    System.out.print(alfabet[k]);
                                    System.out.print(alfabet[l]);
                                    System.out.print(alfabet[m]);
                                    System.out.print(alfabet[n]);
                                    System.out.println("");
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < alfabetBawah.length; i++) {
                for (int j = 0; j < alfabet.length; j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        for (int l = 0; l < alfabet.length; l++) {
                            for (int m = 0; m < alfabet.length; m++) {
                                for (int n = 0; n < alfabet.length; n++) {
                                    System.out.print(alfabetBawah[i]);
                                    System.out.print(alfabet[j]);
                                    System.out.print(alfabet[k]);
                                    System.out.print(alfabet[l]);
                                    System.out.print(alfabet[m]);
                                    System.out.print(alfabet[n]);
                                    System.out.println("");
                                }
                            }
                        }
                    }
                }
            }
        } else if (input.length() == 7) {
            for (int i = 0; i < alfabetAtas.length; i++) {
                System.out.println(alfabetAtas[i]);
                for (int j = 0; j < alfabet.length; j++) {
                    System.out.print(alfabetAtas[i] + alfabet[j]);
                    for (int k = 0; k < alfabet.length; k++) {
                        for (int l = 0; l < alfabet.length; l++) {
                            for (int m = 0; m < alfabet.length; m++) {
                                for (int n = 0; n < alfabet.length; n++) {
                                    for (int o = 0; o < alfabet.length; o++) {
//                                        System.out.print(alfabetAtas[i]);
//                                        System.out.print(alfabet[j]);
//                                        System.out.print(alfabet[k]);
//                                        System.out.print(alfabet[l]);
//                                        System.out.print(alfabet[m]);
//                                        System.out.print(alfabet[n]);
//                                        System.out.print(alfabet[o]);
//                                        System.out.println("");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < alfabetBawah.length; i++) {
                for (int j = 0; j < alfabet.length; j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        for (int l = 0; l < alfabet.length; l++) {
                            for (int m = 0; m < alfabet.length; m++) {
                                for (int n = 0; n < alfabet.length; n++) {
                                    for (int o = 0; o < alfabet.length; o++) {
                                        System.out.print(alfabetBawah[i]);
                                        System.out.print(alfabet[j]);
                                        System.out.print(alfabet[k]);
                                        System.out.print(alfabet[l]);
                                        System.out.print(alfabet[m]);
                                        System.out.print(alfabet[n]);
                                        System.out.print(alfabet[o]);
                                        System.out.println("");
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

