import javax.swing.JOptionPane;

public class EverythingisAwesome {
public static void main(String[] args) {
	String awesome = JOptionPane.showInputDialog("What do you think is awesome?");
	JOptionPane.showMessageDialog(null, awesome + " is awesome!");
}
}
