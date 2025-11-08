class Test
{
    public static void main(String []args)
    {
        int a = 12;
        int b = 12;
        if(++a > b && ++b > a){
           System.out.println(a+b);
        }
        else{
            System.out.println(a*b);
        }
    }
}