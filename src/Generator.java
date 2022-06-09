public class Generator {
    private char[] charset;

    public Generator()
    {
        charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    int a = 0;
    public void generate(String str, int pos, int length)
    {
        if (length == 0) {
            a ++;
            System.out.println(a);
        } else {
            for (int i = pos; i < charset.length; i++) {
                generate(str + charset[i], i, length - 1);
            }
        }
    }

    public static void main(String[] args)
    {
        Generator test = new Generator();
        //test.generate("", 1);
        for (int length = 1;  length < 5; length++) // Change 5 with the length of charset
            test.generate("", 0, length);
    }

}
