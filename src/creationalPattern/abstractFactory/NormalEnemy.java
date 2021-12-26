package creationalPattern.abstractFactory;

public abstract class NormalEnemy {
    protected long hp;
    protected int hitPoint;

    protected NormalEnemy() {

    }

    public abstract void doAction();
    public abstract void update();
}
