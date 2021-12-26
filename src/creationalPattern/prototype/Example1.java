package creationalPattern.prototype;

public class Example1 extends Prototype{
    private int status;

    public Example1() {
        status = 0;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public Example1 clone() {
        Example1 temp = new Example1();
        temp.status = this.status;
        return temp;
    }
}
