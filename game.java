import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code=game.class height=1200 width=1200></applet>
*/

public class game extends Applet implements ActionListener
{  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
   TextField tf1;
  static int i=1;
     public void init()
	 {
			Frame f=new Frame("gaming zone");
			f.setLayout(null);
			f.setSize(800,800);
			b1=new Button();
			b2=new Button();
			b3=new Button();
			b4=new Button();
			b5=new Button();
			b6=new Button();
			b7=new Button();
			b8=new Button();
			b9=new Button();
			reset=new Button("reset");
			reset.setBounds(350,170,80,80);
		    b1.setBounds(80,100,70,70);
			b1.addActionListener(this);
		    b2.setBounds(150,100,70,70);
			b2.addActionListener(this);
		    b3.setBounds(220,100,70,70);
			b3.addActionListener(this);
		    b4.setBounds(80,170,70,70);
			b4.addActionListener(this);
		    b5.setBounds(150,170,70,70);
			b5.addActionListener(this);
		    b6.setBounds(220,170,70,70);
			b6.addActionListener(this);
		    b7.setBounds(80,240,70,70);
			b7.addActionListener(this);
		    b8.setBounds(150,240,70,70);
			b8.addActionListener(this);
		    b9.setBounds(220,240,70,70);
			b9.addActionListener(this);
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);
			f.add(b6);
			f.add(b7);
			f.add(b8);
			f.add(b9);
			f.add(reset);
			reset.addActionListener(this);
		    tf1=new TextField(20);
			Label l1=new Label("x");
			Label l2=new Label("0");
			f.add(tf1);
			f.add(l1);
			f.add(l1);
			f.setVisible(true);
			
			
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 Object ob=e.getSource();
		 
		    if(i%2==1)
			{
			  if(e.getSource()==b1)
			  {
				  b1.setLabel("x");
				  b1.setEnabled(false);
			  }			
			  		
			   if(ob==b2)
			  {
				  b2.setLabel("x");
				  b2.setEnabled(false);
			  }			 
			   if(ob==b3)
			  {
				  b3.setLabel("x");
				  b3.setEnabled(false);
			  }			
			  
			  if(ob==b4)
			  {
				  b4.setLabel("x");
				  b4.setEnabled(false);
			  }			
			   if(ob==b5)
			  {
				  b5.setLabel("x");
				  b5.setEnabled(false);
			  }			
			  if(ob==b6)
			  {
				  b6.setLabel("x");
				  b6.setEnabled(false);
			  }			
			   if(ob==b7)
			  {
				  b7.setLabel("x");
				  b7.setEnabled(false);
			  }
			   if(ob==b8)
			  {
				  b8.setLabel("x");
				  b8.setEnabled(false);
			  }
			   if(ob==b9)
			  {
				  b9.setLabel("x");
				  b9.setEnabled(false); 
			} 
			if(i==5||i==7||i==9)
				
			{
				if(b1.getLabel()=="x" && b2.getLabel()=="x" && b3.getLabel()=="x")
				{
					JOptionPane.showMessageDialog(null,"player 1 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
						}
				if(b1.getLabel()=="x" && b4.getLabel()=="x" && b7.getLabel()=="x")
				{
					JOptionPane.showMessageDialog(null,"player 1 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				}
				if(b1.getLabel()=="x" && b5.getLabel()=="x" && b9.getLabel()=="x")
				{
					JOptionPane.showMessageDialog(null,"player 1 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				}if(b2.getLabel()=="x" && b5.getLabel()=="x" && b8.getLabel()=="x")
				{
					JOptionPane.showMessageDialog(null,"player 1 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				}if(b3.getLabel()=="x" && b6.getLabel()=="x" && b9.getLabel()=="x")
				{
					JOptionPane.showMessageDialog(null,"player 1 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				}if(b3.getLabel()=="x" && b5.getLabel()=="x" && b7.getLabel()=="x")
				{
					JOptionPane.showMessageDialog(null,"player 1 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				}if(b4.getLabel()=="x" && b5.getLabel()=="x" && b6.getLabel()=="x")
				{
					JOptionPane.showMessageDialog(null,"player 1 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				}if(b7.getLabel()=="x" && b8.getLabel()=="x" && b9.getLabel()=="x")
				{
					JOptionPane.showMessageDialog(null,"player 1 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				}
				
			} 
			i++;
			}
			
			 else if(i%2==0)
			  {
				if(ob==b1)
			  {
				  b1.setLabel("0");
				  b1.setEnabled(false);
			  }
			 
			if(ob==b2)
			    {
				  b2.setLabel("0");
				  b2.setEnabled(false);
				 			}
			   if(ob==b3)
			  {
				  b3.setLabel("0");
				  b3.setEnabled(false);
			  }
			   if(ob==b4)
			  {
				  b4.setLabel("0");
				  b4.setEnabled(false);
			}
			   if(ob==b5)
			  {
				  b5.setLabel("0");
				  b5.setEnabled(false);
			  }
			   if(ob==b6)
			  {
				  b6.setLabel("0");
				  b6.setEnabled(false);
					  }
			   if(ob==b7)
			  {
				  b7.setLabel("0");
				  b7.setEnabled(false);
			}
			   if(ob==b8)
			  {
				  b8.setLabel("0");
				  b8.setEnabled(false);
				  } 
			   if(ob==b9)
			  {
				  b9.setLabel("0");
				  b9.setEnabled(false); 
			}
			  if(i==6 || i==8 ){
			  if(b1.getLabel()=="0" && b2.getLabel()=="0" && b3.getLabel()=="0")
				{
					JOptionPane.showMessageDialog(null,"player 2 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
					
				} if(b1.getLabel()=="0" && b4.getLabel()=="0" && b7.getLabel()=="0")
				{
					JOptionPane.showMessageDialog(null,"player 2 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
					
				} if(b1.getLabel()=="0" && b5.getLabel()=="0" && b9.getLabel()=="0")
				{
					JOptionPane.showMessageDialog(null,"player 2 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				} if(b2.getLabel()=="0" && b5.getLabel()=="0" && b8.getLabel()=="0")
				{
					JOptionPane.showMessageDialog(null,"player 2 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				} if(b3.getLabel()=="0" && b6.getLabel()=="0" && b9.getLabel()=="0")
				{
					JOptionPane.showMessageDialog(null,"player 2 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				} if(b3.getLabel()=="0" && b5.getLabel()=="0" && b7.getLabel()=="0")
				{
					JOptionPane.showMessageDialog(null,"player 2 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				} if(b4.getLabel()=="0" && b5.getLabel()=="0" && b6.getLabel()=="0")
				{
					JOptionPane.showMessageDialog(null,"player 2 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				} if(b7.getLabel()=="0" && b8.getLabel()=="0" && b9.getLabel()=="0")
				{
					JOptionPane.showMessageDialog(null,"player 2 win","tic tac toe",0);
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
				}
			  			  }
			  i++;
			  }
			  
			  
			  
			  if(ob==reset)
		 {   
					i=1;
					
			        b1.setLabel(" ");
			        b2.setLabel(" ");
			        b3.setLabel(" ");
			        b4.setLabel(" ");
			        b5.setLabel(" ");
			        b6.setLabel(" ");
			        b7.setLabel(" ");
			        b8.setLabel(" ");
			        b9.setLabel(" ");
				

				 b1.setEnabled(true);
				 b2.setEnabled(true);
				 b3.setEnabled(true);
				 b4.setEnabled(true);
				 b5.setEnabled(true);
				 b6.setEnabled(true);
				 b7.setEnabled(true);
				 b8.setEnabled(true);
				 b9.setEnabled(true);
				 

		 }
		 

	 }
        
    }

