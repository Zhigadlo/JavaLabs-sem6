import java.util.Random;

public class BinaryThread extends Thread {
    @Override
    public void run() {
        Random rnd = new Random();
        while(!isInterrupted()){
            var binaryNum = Integer.toString(rnd.nextInt(), 2);
            try{
                StaticQueue.Queue.put("binary - " + binaryNum);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
}
