class childThread extends Thread {

    public void run() {

        for (int i = 0; i < 2; i++) {

            System.out.println("side THreads");
        }

    }
}

public class threadsExample {

    public static void main(String[] args) {

        childThread t = new childThread();
        t.start();

    }
}