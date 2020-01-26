package GameTile;

import Mario.Game;
import Mario.Handler;
import Mario.Id;

import java.awt.*;

public class Coin extends Tile {
    public Coin(int x, int y, int width, int height, boolean solid, Id id, Handler handler) {
        super(x, y, width, height, false, id, handler);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Game.coin.getBufferedImage(), x, y, width, height, null);
    }

    @Override
    public void tick() {

    }

}
