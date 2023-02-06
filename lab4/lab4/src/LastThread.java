public class LastThread extends Thread{
    @Override
    public void run()
    {
        while (!isInterrupted())
        {
            String a;
            try
            {
                a = StaticQueue.Queue.take();
            } catch (InterruptedException e)
            {
                break;
            }
            System.out.println("new result: " + a);
        }
    }
}
