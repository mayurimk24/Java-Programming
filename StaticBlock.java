class Demo
{
    public int i;    //Instance Variable
    public static int j;  //class Variable

    static
    {

        j = 21;
    }

    public Demo()
    {
        this.i = 11;
        
    }
    public void fun()    //Instance Method
    {
        System.out.println("fun i:"+this.i);
        System.out.println("fun j:"+Demo.j);
    }
    public static void gun()    //class Method
    {
        // System.out.println("gun i:"+this.i);  Not allowed
        System.out.println("gun j:"+Demo.j);
    }
}
class StaticBlock
{
    public static void main(String []a)
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dobj = new Demo();

        System.out.println(dobj.i);
        dobj.fun();

    }
}