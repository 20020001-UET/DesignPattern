package structuralPattern.composite;

public class HiddenFile implements FileItem {
    private String name;
    private boolean hidden = true;

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public void print() {
        if (!hidden) {
            System.out.println(name);
        }
    }
}
