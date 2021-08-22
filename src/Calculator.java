import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sun.awt.windows.ThemeReader;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton plusButton;
	JButton minusButton;
	JButton multiplicationButton;
	JButton divisionButton,clearButton;
	
	
	
    public Calculator() {
    	jf=new JFrame("Calculator"); 
    	jf.setLayout(null);
    	jf.setSize(600, 600);
    	jf.setLocation(250, 150);
    	jf.getContentPane().setBackground(Color.darkGray);
    	
    	
    	displayLabel=new JLabel();
    	displayLabel.setBounds(30, 50, 540, 40);
    	displayLabel.setBackground(Color.gray);
    	displayLabel.setOpaque(true);
    	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    	displayLabel.setForeground(Color.white);
    	jf.add(displayLabel);
    	
    	
    	sevenButton=new JButton("7");
    	sevenButton.setBounds(40, 130, 80, 80);
    	sevenButton.addActionListener(this);
    	jf.add(sevenButton);
    	
    	eightButton=new JButton("8");
    	eightButton.setBounds(140, 130, 80, 80);
    	eightButton.addActionListener(this);
    	jf.add(eightButton);
    	
    	nineButton=new JButton("9");
    	nineButton.setBounds(240, 130, 80, 80);
    	nineButton.addActionListener(this);
    	jf.add(nineButton);
    	
    	fourButton=new JButton("4");
    	fourButton.setBounds(40, 230, 80, 80);
    	fourButton.addActionListener(this);
    	jf.add(fourButton);
    	
    	fiveButton=new JButton("5");
    	fiveButton.setBounds(140, 230, 80, 80);
    	fiveButton.addActionListener(this);
    	jf.add(fiveButton);
    	
    	sixButton=new JButton("6");
    	sixButton.setBounds(240, 230, 80, 80);
    	sixButton.addActionListener(this);
    	jf.add(sixButton);
    	
    	oneButton=new JButton("1");
    	oneButton.setBounds(40, 330, 80, 80);
    	oneButton.addActionListener(this);
    	jf.add(oneButton);
    	
    	
    	twoButton=new JButton("2");
    	twoButton.setBounds(140, 330, 80, 80);
    	twoButton.addActionListener(this);
    	jf.add(twoButton);
    	
    	threeButton=new JButton("3");
    	threeButton.setBounds(240, 330, 80, 80);
    	threeButton.addActionListener(this);
    	jf.add(threeButton);
    	
    	dotButton=new JButton(".");
    	dotButton.setBounds(40, 430, 80, 80);
    	dotButton.addActionListener(this);
    	jf.add(dotButton);
    	
    	
    	zeroButton=new JButton("0");
    	zeroButton.setBounds(140, 430, 80, 80);
    	zeroButton.addActionListener(this);
    	jf.add(zeroButton);
    	
    	equalButton=new JButton("=");
    	equalButton.setBounds(240, 430, 80, 80);
    	jf.add(equalButton);
    	
    	plusButton=new JButton("+");
    	plusButton.setBounds(340, 130, 80, 80);
    	jf.add(plusButton);
    	
    	minusButton=new JButton("-");
    	minusButton.setBounds(340, 230, 80, 80);
    	jf.add(minusButton);
    	
    	multiplicationButton=new JButton("*");
    	multiplicationButton.setBounds(340, 330, 80, 80);
    	jf.add(multiplicationButton);
    	
    	divisionButton=new JButton("/");
    	divisionButton.setBounds(340, 430, 80, 80);
    	jf.add(divisionButton);
    	
    	clearButton=new JButton("Clear");
    	clearButton.setBounds(440, 430, 80, 80);
    	clearButton.addActionListener(this);
    	jf.add(clearButton);
    	
    	jf.setVisible(true);
    	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
		Calculator c=new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenButton) {
		
			displayLabel.setText(displayLabel.getText()+"7");
			
		}else if(e.getSource()== eightButton){
			displayLabel.setText(displayLabel.getText()+"8");	
		}
		else if(e.getSource()== nineButton){
			displayLabel.setText(displayLabel.getText()+"9");	
		}
		else if(e.getSource()== fourButton){
			displayLabel.setText(displayLabel.getText()+"4");	
		}else if(e.getSource()== fiveButton){
			displayLabel.setText(displayLabel.getText()+"5");	
		}else if(e.getSource()== sixButton){
			displayLabel.setText(displayLabel.getText()+"6");	
		}else if(e.getSource()== oneButton){
			displayLabel.setText(displayLabel.getText()+"1");	
		}else if(e.getSource()== twoButton){
			displayLabel.setText(displayLabel.getText()+"2");	
		}else if(e.getSource()== threeButton){
			displayLabel.setText(displayLabel.getText()+"3");	
		}else if(e.getSource()== dotButton){
			displayLabel.setText(displayLabel.getText()+".");	
		}else if(e.getSource()== zeroButton){
			displayLabel.setText(displayLabel.getText()+"0");
		}else if(e.getSource()== minusButton){
			
		}else if(e.getSource()== plusButton){
			
		}else if(e.getSource()== multiplicationButton){
			
		}else if(e.getSource()== divisionButton){
			
		}else if(e.getSource()== equalButton){
			
		}else if(e.getSource()== clearButton){
			displayLabel.setText("");
		}
			
	}
}
