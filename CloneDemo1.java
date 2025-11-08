class Demo implements Cloneable
{
    public int no;
    public String str;

    public void fun()
    {
        System.out.println("Inside fun");
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class CloneDemo1
{
    public static void main(String []A)
    {   
        try
        {
            Demo dobj1 = new Demo();
            Demo dobj2 = (Demo)dobj1.clone();
            dobj2.fun();
        }
        catch(CloneNotSupportedException cobj)
        {

        }
    }
}