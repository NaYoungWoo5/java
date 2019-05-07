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

	int item = 0;

	private boolean running = true;

	private ArrayList sprites = new ArrayList();
	private Sprite starship;

	private BufferedImage BossImage;
	private BufferedImage MBossImage;
	private BufferedImage NaImage;
	private BufferedImage alienImage;
	private BufferedImage shotImage;
	private BufferedImage shipImage;

	public GalagaGame() {
		JFrame frame = new JFrame("Galaga Game");

		frame.setSize(800, 600);
		frame.add(this);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			BossImage = ImageIO.read(new File("Boss.jpg"));// 보스
			MBossImage = ImageIO.read(new File("MBoss.png"));// 중간 보스
			NaImage = ImageIO.read(new File("Na.png")); // 아이템
			shotImage = ImageIO.read(new File("fire.png")); // 총알
			shipImage = ImageIO.read(new File("starship.png")); // 주인공
			alienImage = ImageIO.read(new File("alien.png"));// 몬스터

		} catch (IOException e) {
			e.printStackTrace();
		}
		this.requestFocus();
		this.initSprites();
		addKeyListener(this);

	}

	private void initSprites() {
		starship = new StarShipSprite(this, shipImage, 370, 550);
		sprites.add(starship);
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 12; x++) {
				Sprite alien = new AlienSprite(this, alienImage, 1 + (x * 60), (60) + y * 60);
				Sprite Na = new AlienSprite(this, NaImage, 1 + (x * 60), (60) + y * 60);
				sprites.add(alien);
				sprites.add(Na);

				Sprite MBoss = new AlienSprite(this, MBossImage, 1000 + (x * 10), (10) + y * 10);
				sprites.add(MBoss);

				Sprite Boss = new AlienSprite(this, BossImage, 2500 + (x * 0), (1) + y * 1);
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
		ShotSprite shot = new ShotSprite(this, shotImage, starship.getX() + 5, starship.getY() - 30);
		if (item <= 1) {
			ShotSprite shot1 = new ShotSprite(this, shotImage, starship.getX() + 10, starship.getY() - 10);
			ShotSprite shot2 = new ShotSprite(this, shotImage, starship.getX() + 1, starship.getY() - 10);
			sprites.add(shot1);
			sprites.add(shot2);
		}
		sprites.add(shot);
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
		if (e.getKeyCode() == KeyEvent.VK_A)
			starship.setDx(-5);
		if (e.getKeyCode() == KeyEvent.VK_D)
			starship.setDx(+5);
		if (e.getKeyCode() == KeyEvent.VK_CONTROL)
			fire();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A)
			starship.setDx(0);
		if (e.getKeyCode() == KeyEvent.VK_D)
			starship.setDx(0);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	public static void main(String argv[]) {
		GalagaGame g = new GalagaGame();
		g.gameLoop();
	}
}
