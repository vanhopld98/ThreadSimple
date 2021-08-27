public class NumberGenerator implements Runnable {
    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread object1 = new Thread(numberGenerator);
        Thread object2 = new Thread(numberGenerator);

        object1.start();
        object2.start();
    }
}