package threading.runnable;

public class test {
    public static void main(String args[]) {
        System.out.println("Users thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-book1-HR-Database");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Users thread stopped!!! ");
    }
}
