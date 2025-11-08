class Hello  //extends Object
{
    public int i;

    public Hello(int no)
    {
        System.out.println("Inside hello constructor");
        this.i = no+1;
    }

    public void Display()
    {
        System.out.println("Inside Hello display");
    }
}
class Demo extends Hello{
    public int i;
    public Demo(int a)
    {
        super(a);    //First use
        System.out.println("Inside Demo constructor");
        this.i = a;       
    }
    public void Display()
    {
        int i = 0;
        System.out.println("Inside Display "+i);      //0
         System.out.println("Inside Display "+this.i);   //31
         System.out.println("Inside Display "+super.i);  //32    Second use
         super.Display();   //Third use
    }
}
class SuperDemo
{
    public static void main(String []A)
    {
       Demo dobj = new Demo(31);
       dobj.Display();
    }
}