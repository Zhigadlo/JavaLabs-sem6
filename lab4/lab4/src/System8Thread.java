import java.util.Random;

public class System8Thread extends Thread {
    @Override
    public void run() {
        Random rnd = new Random();
        while(!isInterrupted()){
            var num8 = Integer.toString(rnd.nextInt(), 8);
            try{
                StaticQueue.Queue.put("8 system - " + num8);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
}
