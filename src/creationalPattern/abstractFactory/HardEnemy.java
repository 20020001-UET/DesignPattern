package creationalPattern.abstractFactory;

public abstract class HardEnemy {
    protected long hp;
    protected int hitPoint;
    protected int special;

    protected HardEnemy() {

    }

    public abstract void doAction();
    public abstract void update();
}
