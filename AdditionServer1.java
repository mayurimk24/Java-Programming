import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer1
{
    public static void main(String []a) throws Exception
    {
        System.out.println("Server is running...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port no 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client Request is arrives and accepted by the server");
    }
}