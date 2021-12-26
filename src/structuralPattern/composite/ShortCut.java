package structuralPattern.composite;

public class ShortCut implements FileItem {
    private String path;
    @Override
    public void print() {
        System.out.println(path);
    }
}
