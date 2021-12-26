package structuralPattern.composite;

public class File implements FileItem {

    private String name;
    private int size;

    @Override
    public void print() {
        System.out.println(name + " " + size);
    }
}
