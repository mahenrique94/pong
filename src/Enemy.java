import java.awt.*;

public class Enemy {

    public double x;
    public double y;
    public int width;
    public int height;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = Player.WIDTH;
        this.height = Player.HEIGHT;
    }

    public void tick() {
        x += (Game.ball.x - x - 6) * 0.07;
    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int) x, (int) y, width, height);
    }

}
