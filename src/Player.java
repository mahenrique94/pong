import java.awt.*;

public class Player {

    public static int HEIGHT = 5;
    public static int WIDTH = 40;

    public boolean left;
    public boolean right;
    public int x;
    public int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void tick() {
        if (right) {
            x++;
        } else if (left) {
            x--;
        }

        if (x + WIDTH > Game.WIDTH) {
            x = Game.WIDTH - WIDTH;
        } else if (x < 0) {
            x = 0;
        }
    }

    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

}
