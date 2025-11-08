// interface Demo{
//     int no = 11;
//     void Display();
// }

// class Hello implements Demo
// {
//     //Error
// }
// class InterfaceDemo1
// {
//     public static void main(String []a){
//         Hello hobj = new Hello();
//     }
// }

class A{
    public void show(){
      System.out.println("Inside A");
    }
}
interface B extends A{
    default void show()
    {
        System.out.println("inside b inter");
    }
}

class InterfaceDemo1 {
    public static void main(String []a)
    {

    }
}




