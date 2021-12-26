package creationalPattern.singleton;

public class Bomberman extends Entity {
    public Bomberman() {
        img = Graphic.getBombermanGraphic().getSprite();
        //img = Graphic.getEnemyGraphic().getSprite();
    }

    public void update() {
        //int x = WIDTH - ();
        // calc
    }

    public void display() {
        draw();
    }
}
