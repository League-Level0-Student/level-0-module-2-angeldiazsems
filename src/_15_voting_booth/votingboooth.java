 package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingboooth {
public static void main(String[] args) {
	
	
	
 String vote = JOptionPane.showInputDialog("How old are you?");
	
	
	int response = Integer.parseInt(vote );

	if(response >18) {
		
		
		JOptionPane.showMessageDialog(null, "Who do you think should be the next president?");
		
		
	}
	
	
	
	
	else {
		
	JOptionPane.showMessageDialog(null, "Nobody cares what you think");	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
