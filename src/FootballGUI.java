import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FootballGUI  extends JFrame implements ActionListener {
	
	// button of different leagues
	JButton IranBtn, GermanyBtn, SpainBtn, BritainBtn  ;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public FootballGUI()
	{
		super("Footbal Forcasting");
		
		setSize(450,550);
		
		setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
	//	football = new Football() ;
		
		addGuiComponents();
		
	}	
	
	private void addGuiComponents() {
		IranBtn = new JButton("Iran league");
		IranBtn.setBounds(80, 100, 105, 80);
		IranBtn.setFont(new Font("Dialog" , Font.BOLD, 10));
		IranBtn.addActionListener(this);
		add(IranBtn);
		
		GermanyBtn = new JButton("US league");
		GermanyBtn.setBounds(80, 300, 105, 80);
		GermanyBtn.setFont(new Font("Dialog" , Font.BOLD, 10));
		GermanyBtn.addActionListener(this);
		add(GermanyBtn);
		
		SpainBtn = new JButton("Spain league");
		SpainBtn.setBounds(240, 100, 105, 80);
		SpainBtn.setFont(new Font("Dialog" , Font.BOLD, 10));
		SpainBtn.addActionListener(this);
		add(SpainBtn);
		
		BritainBtn = new JButton("Britain league");
		BritainBtn.setBounds(240, 300, 105, 80);
		BritainBtn.setFont(new Font("Dialog" , Font.BOLD, 10));
		BritainBtn.addActionListener(this);
		add(BritainBtn);
	}
	
	
	
	
	
	
	
	
	
	
}
