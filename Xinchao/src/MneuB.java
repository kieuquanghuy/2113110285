import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MneuB extends JFrame{
	public  MneuB(){
		setTitle("menu exp");
		setSize(300, 300);
		
		JMenuBar menub = new JMenuBar();
		setJMenuBar(menub);
		
		JMenu filem = new JMenu("File");
		menub.add(filem);
		
		JMenuItem newa = new JMenuItem("NEW");
		JMenuItem opena = new JMenuItem("Open");
		JMenuItem exita = new JMenuItem("Exit");
		
		JCheckBoxMenuItem check = new JCheckBoxMenuItem("Check Action");
		
		filem.add(newa);
		filem.add(opena);
		filem.add(check);
		filem.addSeparator();
		filem.add(exita);
		
		newa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("you have cliked on the new acion");
				
			}
		});
		
		
		
	}
	public static void main(String[] args) {
		MneuB me = new MneuB();
		me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		me.setVisible(true);

	}
}