import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Cal extends JFrame implements ActionListener
{
  JTextField t1;
  int a,b,c;
  String msg="",s,s1,s2,s3,s4;
  JButton eq,sum,sub,mul,div;
  JButton n[]=new JButton[10];
  Cal()
  {
      Container c=getContentPane();
      c.setLayout(new FlowLayout());
      this.setLayout(null);
      sum=new JButton("+");
      div=new JButton("/");
      mul=new JButton("*");
      eq=new JButton("=");
      sub=new JButton("-");
      t1=new JTextField(20);
      for(int i=0;i<10;i++)
      {
          n[i]=new JButton(i+"");
          n[i].setActionCommand(i+"");
          add(n[i]);
          n[i].addActionListener(this);
      }
      for(int i=0;i<3;i++)
        n[i].setBounds(10+55*i,30,50,50);
      for(int i=3;i<6;i++)
        n[i].setBounds(10+55*(i-3),85,50,50);
      for(int i=6;i<9;i++)
        n[i].setBounds(10+55*(i-6),140,50,50);
      n[9].setBounds(10+55,195,50,50);

      t1.setBounds(10,5,150,20);
      sum.setBounds(10,250,50,50);
      sub.setBounds(70,250,50,50);
      div.setBounds(130,250,50,50);
      mul.setBounds(30,305,50,50);
      eq.setBounds(90,305,50,50);
      add(eq);
      add(sum);
      add(sub);
      add(mul);
      add(div);
      add(t1);
      sum.addActionListener(this);
      sub.addActionListener(this);
      mul.addActionListener(this);
      div.addActionListener(this);
      eq.addActionListener(this);
    }
public void actionPerformed(ActionEvent e)
{
  s=e.getActionCommand();
  if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||
  s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")||s.equals("0"))
  {
      s1=t1.getText()+s;
      t1.setText(s1);
  }
 if(s.equals("+"))
 {
   s2=t1.getText();
   t1.setText("");
   s3="+";
 }
 if(s.equals("-"))
 {
   s2=t1.getText();
   t1.setText("");
   s3="-";
 }
 if(s.equals("*"))
 {
   s2=t1.getText();
   t1.setText("");
   s3="*";
 }
if(s.equals("/"))
{
   s2=t1.getText();
   t1.setText("");
   s3="/";
}
if(s.equals("="))
{
  s4=t1.getText();
  a=Integer.parseInt(s2);
  b=Integer.parseInt(s4);
  if(s3.equals("+"))
    c=a+b;
  if(s3.equals("-"))
    c=a-b;
  if(s3.equals("*"))
    c=a*b;
  if(s3.equals("/"))
    c=a/b;
  t1.setText(String.valueOf(c));
 }
 if(s.equals("Clear"))
 {
   t1.setText("");
 }
}
    public static void main(String args[])
    {
        Cal a1=new Cal();
        a1.setSize(400,400);
        a1.setVisible(true);
    }
}
