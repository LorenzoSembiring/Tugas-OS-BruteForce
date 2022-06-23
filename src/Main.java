public class Main {
    public static void main(String[] args) {

        Main2 s0 = new Main2();
        Main2 s1 = new Main2();

        Thread t0 = new Thread(s0);
        Thread t1 = new Thread(s1);

        t0.start();
        t1.start();
    }
}
