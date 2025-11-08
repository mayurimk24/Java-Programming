class Demo{
    public int Division(int iNo1, int iNo2) throws ArithmeticException
    {
        int Ans = 0;
        Ans = iNo1 / iNo2;
        return Ans;
    }
}
class ThrowsDemo
{
    public static void main(String[] a)
    {
        Demo dobj = new Demo();

        int Ret = 0;
        try{
            Ret = dobj.Division(11,0);
        }
        catch(ArithmeticException aobj){
            System.out.println("Inside catch: "+aobj);
        }
        System.out.println("Division is:"+Ret);
    }
}