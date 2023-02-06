import java.util.Random;

public class System16Thread extends Thread {

    @Override
    public void run() {
        Random rnd = new Random();
        while(!isInterrupted()){
            var num16 = Integer.toString(rnd.nextInt(), 16);
            try{
                StaticQueue.Queue.put("16 system - " + num16);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
}
