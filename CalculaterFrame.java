import javax.swing.*;
import java.awt.event.*;

class Calculater extends JFrame
{
    // Characteristics
    JFrame fobj;
    JLabel NumberLabel1, NumberLabel2, AnswerLabel;
    JTextField tobj1,tobj2, tobj3;
    JButton bobj1,bobj2,bobj3,bobj4;

    public Calculater(String title, int width, int height)
    {
        fobj = new JFrame(title);

        NumberLabel1 = new JLabel("Number1 :");
        NumberLabel1.setBounds(50,50,100,30);

        tobj1 = new JTextField();
        tobj1.setBounds(150,50,150,30);
        
        NumberLabel2 = new JLabel("Number2 :");
        NumberLabel2.setBounds(50,100,100,30);

        tobj2 = new JTextField();
        tobj2.setBounds(150,100,150,30);

        bobj1 = new JButton("+");
        bobj1.setBounds(60,150,42,30);

        bobj2 = new JButton("-");
        bobj2.setBounds(120,150,40,30);

        bobj3 = new JButton("*");
        bobj3.setBounds(180,150,40,30);

        bobj4 = new JButton("/");
        bobj4.setBounds(240,150,40,30);

        AnswerLabel = new JLabel("Answer :");
        AnswerLabel.setBounds(100,200,100,30);

        tobj3 = new JTextField();
        tobj3.setBounds(160,200,60,30);
        tobj3.setEditable(false);

        fobj.add(NumberLabel1);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(tobj3);
        fobj.add(NumberLabel2);
        fobj.add(AnswerLabel);
        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);  

        bobj1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent aobj1)
            {
                int number1 = Integer.parseInt(tobj1.getText());
                int number2 = Integer.parseInt(tobj2.getText());

                String Result = String.valueOf(number1+number2);

                tobj3.setText(Result);
                }
        });
        
        bobj2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent aobj1)
            {
                int number1 = Integer.parseInt(tobj1.getText());
                int number2 = Integer.parseInt(tobj2.getText());

                String Result = String.valueOf(number1-number2);

                tobj3.setText(Result);
                }
        });

        bobj3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent aobj1)
            {
                int number1 = Integer.parseInt(tobj1.getText());
                int number2 = Integer.parseInt(tobj2.getText());

                String Result = String.valueOf(number1*number2);

                tobj3.setText(Result);
                }
        });

        bobj4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent aobj1)
            {
                int number1 = Integer.parseInt(tobj1.getText());
                int number2 = Integer.parseInt(tobj2.getText());

                String Result = String.valueOf(number1/number2);

                tobj3.setText(Result);
                }
        });

        fobj.setLayout(null);
        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    
}
class CalculaterFrame
{
    public static void main(String []a)
    {
        Calculater cobj = new Calculater("Calculater",400,300);
    }
}