import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin
{
    public MarvellousLogin()
    {
        JFrame fobj = new Jframe("Login Portal");
        fobj.setsize(500,400);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class LoginFrame1
{
    public static void main(String []a)
    {
        MarvellousLogin mobj = new MarvellousLogin();
    }
}