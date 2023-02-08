package threading.count;

public class test {
    public static void main(String args[])
    {
        Count count = new Count();
        try
        {
            while(count.getMyThread().isAlive())
            {
                System.out.println("Users thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Users thread interrupted");
        }
        System.out.println("Users thread run is over" );
    }
}
