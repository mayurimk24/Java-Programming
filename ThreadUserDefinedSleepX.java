//code to demonstrates thread scheduling
class Demo extends Thread{
    public void run()
    {
        int i = 0;
        try{
             for(i = 1; i<=5; i++)    //Thread Scheduler
             {
                 Thread.sleep(1000);    
                 System.out.println("Inside run method of: "+Thread.currentThread().getName());
              }
        }
        catch(InterruptedException e)
        {

        }
    }
}
class ThreadUserDefinedSleepX
{
    public static void main(String[ ] a) 
    {
        System.out.println("Inside main thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        try
        {
             dobj1.start();
             dobj1.join();
             
             dobj2.start();
             dobj2.join();
        }
        catch(InterruptedException e)
        {

        }

        System.out.println("End of main thread");
    }
}