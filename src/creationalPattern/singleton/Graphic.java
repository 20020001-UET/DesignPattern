package creationalPattern.singleton;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Graphic {
    private static Graphic instance = new Graphic();
    private static Graphic bombermanGraphic = new Graphic(0);
    private static Graphic enemyGraphic = new Graphic(1);

    private BufferedImage sprite;

    private Graphic() {
        //load sprites
        try {
            sprite = ImageIO.read(new File("sprite.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Graphic(int type) {
        switch (type) {
            case 1 -> {
                // load bomberman sprites
            }
            case 2 -> {
                // load enemy sprites
            }
        }
    }

    public synchronized static Graphic getInstance() {
        if (instance == null) {
            // create new a thread
            // using that thread to create a new instance
        }
        return instance;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public static Graphic getBombermanGraphic() {
        return bombermanGraphic;
    }

    public static Graphic getEnemyGraphic() {
        return enemyGraphic;
    }
}
