class ThreadDemo2
{
    public static void main(String[ ] a)
    {
        System.out.println("INside main method");
        Thread tobj = Thread.currentThread();

        String name =tobj.getName();

        System.out.println("Name of current Thread is : "+name);
    }
}