import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Dibujar extends JPanel implements ActionListener{

	private Nave nave;
	private Timer timer;


	public Dibujar() {

		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(new teclado());

		nave = new Nave();
		timer = new Timer(5, this);
		timer.start();
	}

	public void paint(Graphics grafica) {
		super.paint(grafica);

		Graphics2D g2 = (Graphics2D) grafica;
		g2.drawImage(nave.tenerImagen(), nave.tenerX(), nave.tenerY(), null);
	}

	public void actionPerformed(ActionEvent e) {

		nave.mover();
		repaint();
	}

	private class teclado extends KeyAdapter {

		public void keyReleased(KeyEvent e) {
			nave.keyReleased(e);

		}

		public void keyPressed(KeyEvent e) {
			nave.keyPressed(e);
			
		}
	}

}