class Demo
{
    public int i;    //Instance Variable
    public static int j;  //class Variable

    static
    {
        System.out.println("Inside a Static Block");
        j = 21;
    }

    {
        System.out.println("Inside Initializer block");
    }

    public Demo()
    {
        System.out.println("Inside a Constructor");
        this.i = 11;
        
    }
}

class BlocksX
{
    public static void main(String []a)
    {
       System.out.println("Inside a main");
       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo();
       Demo dobj3 = new Demo();
    }
}