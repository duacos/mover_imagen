import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Dibujar());
		setTitle("Mover imagen con java");
		setSize(800, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public static void main(String[] args) {
        new Ventana();
    }
}