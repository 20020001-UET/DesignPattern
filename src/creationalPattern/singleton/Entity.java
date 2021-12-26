package creationalPattern.singleton;

import java.awt.image.BufferedImage;

public class Entity {
    protected static final int WIDTH = 16;
    protected static final int HEIGHT = 16;

    protected BufferedImage img;

    protected static void draw() {
        //system.draw(WIDTH, HEIGHT, img);
    }
}
