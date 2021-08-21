import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
    public Calculator() {
    	jf=new JFrame("Calculator"); 
    	jf.setLayout(null);
    	jf.setSize(600, 600);
    	jf.setLocation(250, 150);
    	
    	
    	displayLabel=new JLabel("Hello");
    	displayLabel.setBounds(30, 50, 540, 40);
    	displayLabel.setBackground(Color.gray);
    	displayLabel.setOpaque(true);
    	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    	displayLabel.setForeground(Color.white);
    	jf.add(displayLabel);
    	
    	
    	JButton sevenButton=new JButton("7");
    	sevenButton.setBounds(40, 130, 80, 80);
    	sevenButton.addActionListener(this);
    	jf.add(sevenButton);
    	
    	JButton eightButton=new JButton("8");
    	eightButton.setBounds(140, 130, 80, 80);
    	jf.add(eightButton);
    	
    	JButton nineButton=new JButton("9");
    	nineButton.setBounds(240, 130, 80, 80);
    	jf.add(nineButton);
    	
    	JButton fourButton=new JButton("4");
    	fourButton.setBounds(40, 230, 80, 80);
    	jf.add(fourButton);
    	
    	JButton fiveButton=new JButton("5");
    	fiveButton.setBounds(140, 230, 80, 80);
    	jf.add(fiveButton);
    	
    	JButton sixButton=new JButton("6");
    	sixButton.setBounds(240, 230, 80, 80);
    	jf.add(sixButton);
    	
    	JButton oneButton=new JButton("1");
    	oneButton.setBounds(40, 330, 80, 80);
    	jf.add(oneButton);
    	
    	
    	JButton twoButton=new JButton("2");
    	twoButton.setBounds(140, 330, 80, 80);
    	jf.add(twoButton);
    	
    	JButton threeButton=new JButton("3");
    	threeButton.setBounds(240, 330, 80, 80);
    	jf.add(threeButton);
    	
    	JButton dotButton=new JButton(".");
    	dotButton.setBounds(40, 430, 80, 80);
    	jf.add(dotButton);
    	
    	
    	JButton zeroButton=new JButton("0");
    	zeroButton.setBounds(140, 430, 80, 80);
    	jf.add(zeroButton);
    	
    	JButton equalButton=new JButton("=");
    	equalButton.setBounds(240, 430, 80, 80);
    	jf.add(equalButton);
    	
    	JButton plusButton=new JButton("+");
    	plusButton.setBounds(340, 130, 80, 80);
    	jf.add(plusButton);
    	
    	JButton minusButton=new JButton("-");
    	minusButton.setBounds(340, 230, 80, 80);
    	jf.add(minusButton);
    	
    	JButton multiplicationButton=new JButton("*");
    	multiplicationButton.setBounds(340, 330, 80, 80);
    	jf.add(multiplicationButton);
    	
    	JButton divisionButton=new JButton("/");
    	divisionButton.setBounds(340, 430, 80, 80);
    	jf.add(divisionButton);
    	
    	jf.setVisible(true);
    	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
		Calculator c=new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jf.getContentPane().setBackground(Color.BLACK);
		
	}
}
