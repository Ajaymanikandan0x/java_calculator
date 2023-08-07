import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public  class Calculator implements ActionListener{
    JFrame jf;
    JLabel dispJLabel; 
    JButton sevButton, eigButton,ninButton,forButton,fivButton,sixButton, zeButton,equButton,jB,
    threeButton,twoButton,oneButton, divButton,mulButton,subButton,addButton,clearButton,doButton;

    boolean operclick=false;
    String oldvalue;
    double firstnum=0.0;
    double secondnum=0.0;
    double result=0.0;
    String operator="";
    

      
     


    public Calculator(){
         jf =new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(500, 600);
        jf.setLocation(300, 100);
         dispJLabel=new JLabel();
        dispJLabel.setBounds(20, 30, 440, 40);
        jf.add(dispJLabel);
        dispJLabel.setBackground(Color.gray);
        dispJLabel.setOpaque(true);
        dispJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        dispJLabel.setForeground(Color.WHITE);

         sevButton=new JButton("7");
        sevButton.setBounds(40, 105, 70, 70);
        sevButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevButton.addActionListener(this);
        jf.add( sevButton);

         eigButton=new JButton("8");
        eigButton.setBounds(130, 105, 70, 70);
        eigButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eigButton.addActionListener(this);
        jf.add( eigButton);

         ninButton=new JButton("9");
        ninButton.setBounds(220, 105, 70, 70);
        ninButton.setFont(new Font("Arial", Font.PLAIN, 40));
        ninButton.addActionListener(this);
        jf.add( ninButton);

          forButton=new JButton("4");
        forButton.setBounds(40, 195, 70, 70);
        forButton.setFont(new Font("Arial", Font.PLAIN, 40));
        forButton.addActionListener(this);
        jf.add( forButton);

          fivButton=new JButton("5");
        fivButton.setBounds(130, 195, 70, 70);
        fivButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fivButton.addActionListener(this);
        jf.add( fivButton);

        sixButton=new JButton("6");
        sixButton.setBounds(220, 195, 70, 70);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add( sixButton);

         oneButton=new JButton("1");
        oneButton.setBounds(40, 285, 70, 70);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add( oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130, 285, 70, 70);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add( twoButton);

         threeButton=new JButton("3");
        threeButton.setBounds(220, 285, 70, 70);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add( threeButton);

         zeButton=new JButton("0");
        zeButton.setBounds(40, 375, 70, 70);
        zeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeButton.addActionListener(this);
        jf.add( zeButton);

         doButton=new JButton(".");
        doButton.setBounds(130, 375, 70, 70);
        doButton.setFont(new Font("Arial", Font.PLAIN, 40));
        doButton.addActionListener(this);
        jf.add( doButton);

        equButton=new JButton("=");
        equButton.setBounds(220, 375, 70, 70);
        equButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equButton.addActionListener(this);
        jf.add( equButton);

         divButton=new JButton("/");
        divButton.setBounds(310, 105, 70, 70);
        divButton.setFont(new Font("Arial", Font.PLAIN, 35));
        divButton.addActionListener(this);
        jf.add( divButton);

        mulButton=new JButton("x");
        mulButton.setBounds(310, 195, 70, 70);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 35));
        mulButton.addActionListener(this);
        jf.add( mulButton);

         subButton=new JButton("-");
        subButton.setBounds(310, 285, 70, 70);
        subButton.setFont(new Font("Arial", Font.PLAIN, 45));
        subButton.addActionListener(this);
        jf.add( subButton);

         addButton=new JButton("+");
        addButton.setBounds(310, 375, 70, 70);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        addButton.addActionListener(this);
        jf.add( addButton);

        clearButton=new JButton("C");
        clearButton.setBounds(310, 465, 70, 70);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 35));
        clearButton.addActionListener(this);
        jf.add(clearButton);
        


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }

    public static void main(String[] args) {
        new Calculator();
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==sevButton){
        if(operclick){
           dispJLabel.setText("7"); 
           operclick=false;
        }else{
             dispJLabel.setText(dispJLabel.getText()+"7");
            }
       
      }else if(e.getSource()==eigButton){
        if(operclick){
           dispJLabel.setText("8"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"8");
        }
      }else if(e.getSource()==ninButton){
        if(operclick){
           dispJLabel.setText("9"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"9");
        }
    }else if(e.getSource()==forButton){
        if(operclick){
           dispJLabel.setText("4"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"4");
        }
      }else if(e.getSource()==fivButton){
        if(operclick){
           dispJLabel.setText("5"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"5");
        }
    }else if(e.getSource()==sixButton){
        if(operclick){
           dispJLabel.setText("6"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"6");
        }
      }else if(e.getSource()==threeButton){
        if(operclick){
           dispJLabel.setText("3"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"3");
        }
    }else if(e.getSource()==twoButton){
        if(operclick){
           dispJLabel.setText("2"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"2");
        }
      }else if(e.getSource()==oneButton){
        if(operclick){
           dispJLabel.setText("1"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"1");
        }
    }else if(e.getSource()==zeButton){
        if(operclick){
           dispJLabel.setText("0"); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+"0");
        }
      }else if(e.getSource()==clearButton){
        dispJLabel.setText("");

      }else if(e.getSource()==doButton){
        if(operclick){
           dispJLabel.setText("."); 
           operclick=false;
        }else{
        dispJLabel.setText(dispJLabel.getText()+".");
      }
        
    }else if(e.getSource()==addButton || e.getSource()==subButton || e.getSource()==mulButton || e.getSource()==divButton){ 
      
      firstnum = Double.parseDouble(dispJLabel.getText());
      operator = e.getActionCommand();
     
      operclick = true;
  
   }else if(e.getSource()==equButton){ 
     
      secondnum = Double.parseDouble(dispJLabel.getText());
      
      switch(operator){
         case "+":
            result = firstnum + secondnum;
            break;
         case "-":
            result = firstnum - secondnum;
            break;
         case "x":
            result = firstnum * secondnum;
            break;
         case "/":
           
            if(secondnum != 0){
               result = firstnum / secondnum;
            }else{
               result = Double.NaN; // Not a number
            }
            break;
         default:
            result = 0.0; // Invalid operator
      }
      // Display the result
      dispJLabel.setText(String.valueOf(result));
      // Reset the flag and operands
      operclick = true;
      firstnum = 0.0;
      secondnum = 0.0;   
   }
    }

  }




  






