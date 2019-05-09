import java.awt.Image;

public class BossSprite extends Sprite {
	private GalagaGame game;

	public BossSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dx = +5;
	}

	@Override
	public void move() {
			if (((dx < 0) && (x < 10)) || ((dx > 0) && (x > 750))) {
				dx = -dx;
				y += 10;
				if (y > 750) {
					game.endGame();
				}
			}
		
		super.move();
	}

}