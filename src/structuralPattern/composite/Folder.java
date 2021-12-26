package structuralPattern.composite;

import java.util.ArrayList;

public class Folder implements FileItem {
    private String name;
    private ArrayList<FileItem> items;

    @Override
    public void print() {
        System.out.println(name);
        for (FileItem item : items) {
            item.print();
        }
    }
}
