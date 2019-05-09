import java.awt.Image;

public class AlienSprite extends Sprite {
	private GalagaGame game;

	public AlienSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dx = -1;
		dy = -1;
	}

	@Override
	public void move() {
			if (((dx < 0) && (x < 10)) || ((dx > 0) && (x > 750))) {

				// if (((dy < 0) && (y < 100)) || ((dy > 0) && (y > 550))) {
				dx = -dx;
				y += 10;
				if (y > 750) {
					game.endGame();
				}

			}
			super.move();
			if (((dy < 0) && (y < 10)) || ((dy > 0) && (y > 530))) {

				// if (((dy < 0) && (y < 100)) || ((dy > 0) && (y > 550))) {
				dy = -dy;
				x += 10;
				if (y > 750) {
					game.endGame();
				}

			}
			super.move();
		
	}
	// }
}
