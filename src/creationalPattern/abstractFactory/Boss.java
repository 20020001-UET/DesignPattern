package creationalPattern.abstractFactory;

public abstract class Boss {
    protected int hp;
    protected int hitPoint;
    protected int special;

    protected Boss() {

    }

    public abstract void doAction();
    public abstract void update();
    public abstract void doSpecial();
}
