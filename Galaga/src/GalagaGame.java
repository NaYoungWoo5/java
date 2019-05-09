import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GalagaGame extends JPanel implements KeyListener {

	private boolean running = true;

	private ArrayList sprites = new ArrayList();
	private Sprite starship;

	private BufferedImage BossImage;
	private BufferedImage monsterImage;
	private BufferedImage alienImage;
	private BufferedImage shotImage;
	private BufferedImage Player1Image;

	public GalagaGame() {
		JFrame frame = new JFrame("Galaga Game");

		frame.setSize(800, 600);
		frame.add(this);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			BossImage = ImageIO.read(new File("Boss.png"));
			monsterImage = ImageIO.read(new File("monster.png"));
			shotImage = ImageIO.read(new File("fire.png"));
			Player1Image = ImageIO.read(new File("Player1.png"));
			alienImage = ImageIO.read(new File("alien.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		this.requestFocus();
		this.initSprites();
		addKeyListener(this);

	}

	private void initSprites() {
		starship = new StarShipSprite(this, Player1Image, 370, 550);
		sprites.add(starship);
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 12; x++) {
				Sprite alien = new AlienSprite(this, alienImage, 1 + (x * 60), (60) + y * 60);
				/*Sprite alien1 = new AlienSprite(this, alienImage, 1 + (x * 60), (60) + y * 60);
				sprites.add(alien1);*/
				Sprite monster = new AlienSprite(this, monsterImage, 1 + (x * 60), (60) + y * 60);
				sprites.add(alien);
				sprites.add(monster);
				Sprite Boss = new BossSprite(this, BossImage, 2500 + (x * 0), (1) + y * 1);
				sprites.add(Boss);

			}
		}
	}

	private void startGame() {
		sprites.clear();
		initSprites();
	}

	public void endGame() {
		System.exit(0);
	}

	public void removeSprite(Sprite sprite) {
		sprites.remove(sprite);
	}

	public void fire() {
		ShotSprite shot = new ShotSprite(this, shotImage, starship.getX() + 10, starship.getY() - 10);
		sprites.add(shot);
		Sxprite1 shot2 = new Sxprite1(this, shotImage, starship.getX() + 1, starship.getY() - 0);
		sprites.add(shot2);
		Sxprite shot3 = new Sxprite(this, shotImage, starship.getX() + 21, starship.getY() - 0);
		sprites.add(shot3);
		Shot1Sprite shot4 = new Shot1Sprite(this, shotImage, starship.getX() + 10, starship.getY() + 20);
		sprites.add(shot4);
		SSprite shot1 = new SSprite(this, shotImage, starship.getX() + 10, starship.getY() + 20);
		sprites.add(shot1);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 600);
		for (int i = 0; i < sprites.size(); i++) {
			Sprite sprite = (Sprite) sprites.get(i);
			sprite.draw(g);
		}
	}

	public void gameLoop() {

		while (running) {
			for (int i = 0; i < sprites.size(); i++) {
				Sprite sprite = (Sprite) sprites.get(i);
				sprite.move();
			}

			for (int p = 0; p < sprites.size(); p++) {
				for (int s = p + 1; s < sprites.size(); s++) {
					Sprite me = (Sprite) sprites.get(p);
					Sprite other = (Sprite) sprites.get(s);

					if (me.checkCollision(other)) {
						me.handleCollision(other);
						other.handleCollision(me);
					}
				}
			}

			repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			starship.setDx(-5);
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			starship.setDx(+5);
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			starship.setDy(+5);
		if (e.getKeyCode() == KeyEvent.VK_UP)
			starship.setDy(-5);
		if (e.getKeyCode() == KeyEvent.VK_CONTROL)
			fire();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			starship.setDx(0);
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			starship.setDx(0);
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			starship.setDy(0);
		if (e.getKeyCode() == KeyEvent.VK_UP)
			starship.setDy(0);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	public static void main(String argv[]) {
		GalagaGame g = new GalagaGame();
		g.gameLoop();
	}
}
