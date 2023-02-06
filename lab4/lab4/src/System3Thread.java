import java.util.Random;

public class System3Thread  extends Thread {
    @Override
    public void run() {
        Random rnd = new Random();
        while(!isInterrupted()){
            var num3 = Integer.toString(rnd.nextInt(), 3);
            try{
                StaticQueue.Queue.put("3 system - " + num3);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
}
