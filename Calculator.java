import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {



Label lbl1, lbl2, lbl3;
TextField txt1, txt2, txt3;
Button btn1, btn2,btn3;
public Calculator()
{
lbl1 = new Label ("num1");
lbl2 = new Label ("num2");
lbl3 = new Label ("result");

txt1 = new TextField(10);
txt2 = new TextField(10);
txt3 = new TextField(10);

btn1 = new Button("Add");
btn2 = new Button("Subtract");



add(lbl1);
add(txt1);

add(lbl2);
add(txt2);

add(lbl3);
add(txt3);

add(btn1);
add(btn2);

setSize(200,200);
setTitle("My calculator");

setLayout(new FlowLayout());

btn1.addActionListener(this);
btn2.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent e)
{
float a = 0f, b = 0f, result = 0f;

   a = Float.parseFloat(txt1.getText());
   b = Float.parseFloat(txt2.getText());
   
   if (e.getSource() == btn1) {
 
       result = a + b;
   } else if (e.getSource() == btn2) {
   
       result = a - b;
   } 

   txt3.setText(String.valueOf(result));

 
}

public static void main(String[] args) {

Calculator calc = new Calculator();
calc.setLocation(300,300);
calc.setVisible(true);


}

}