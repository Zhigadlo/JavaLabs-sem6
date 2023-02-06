import java.util.concurrent.SynchronousQueue;

public class StaticQueue
{
    public static SynchronousQueue<String> Queue;
    static
    {
        Queue = new SynchronousQueue();
    }
}
