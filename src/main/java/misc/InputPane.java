package misc;import javax.swing.JOptionPane;


public class InputPane {
	int a =10;

	public static void main(String[] args) {
		
		String input= JOptionPane.showInputDialog("What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello "+input);
		
		
	}
	
	public void print()
	{
		System.out.println(a);
	}
}
