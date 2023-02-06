public class Main {
    public static void main(String[] args) {
        System16Thread system16 = new System16Thread();
        System8Thread system8 = new System8Thread();
        System3Thread system3 = new System3Thread();
        BinaryThread binary = new BinaryThread();
        LastThread last = new LastThread();

        system16.start();
        system8.start();
        system3.start();
        binary.start();
        last.start();

        try
        {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        system16.interrupt();
        system8.interrupt();
        system3.interrupt();
        binary.interrupt();
        last.interrupt();
        System.out.println("results in queue count: " + StaticQueue.Queue.stream().count());
    }
}