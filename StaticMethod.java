class Demo
{
    public int i;
    public static int j = 21;
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
class StaticMethod
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