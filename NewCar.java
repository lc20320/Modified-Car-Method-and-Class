import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NewCar {

	public static void main(String [] args) {
	
		ModCar NewCar = new ModCar();
		ModCar TestCar = new ModCar();
		
		// color, HP, ES, make
		JPanel panel = new JPanel();
		JLabel panColor = new JLabel("Enter Color");
		JLabel panHP = new JLabel("Enter Horsepower");
		JLabel panEnSize = new JLabel("Enter Engine Size");
		JLabel panMake = new JLabel("Enter Make");
		
		JTextField txtColor = new JTextField("COLOR"); 
		JTextField txtHP = new JTextField("HORSEPOWER");
		JTextField txtEnSize = new JTextField("ENGINE SIZE");
		JTextField txtMake = new JTextField("MAKE");
		
		panel.add(panColor);
		panel.add(txtColor);
		panel.add(panHP);
		panel.add(txtHP);
		panel.add(panEnSize);
		panel.add(txtEnSize);
		panel.add(panMake);
		panel.add(txtMake);
		
		int result = JOptionPane.showConfirmDialog(null, panel, "Car Info", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, "Color: " + txtColor.getText() + "\nHorsepower: " + txtHP.getText() + "\nEngine Size: " + txtEnSize.getText() + "\nMake: " + txtMake.getText());
		}
	
		NewCar.setcolor("red");
		NewCar.sethorsepower(200);
		NewCar.setenginesize(2.5);
		NewCar.setmake("Smart");
		
		
		TestCar.setcolor(txtColor.getText());	
		int SetHP = Integer.parseInt(txtHP.getText());
		TestCar.sethorsepower(SetHP);		
		double SetES = Double.parseDouble(txtEnSize.getText());
		TestCar.setenginesize(SetES);		
		TestCar.setmake(txtMake.getText());
		
		if ((TestCar.getColor().equals(NewCar.getColor()) && (TestCar.gethorsepower() == (NewCar.gethorsepower()) && 
				(TestCar.getenginesize() == (NewCar.getenginesize()) && (TestCar.getmake().equals(NewCar.getmake())))))) {
			System.out.println("Both Cars Match!");
		}else{ 
			System.out.println("Mismatch");
		}
	}
}