package structuralPattern.adapter;

public class MyLib implements JavaAlgorithm {
    @Override
    public void sort(int[] arr) {
        JavaSort javaLib = new JavaSort();
        javaLib.quickSort(arr);
    }

    @Override
    public int binary_search(int key, int[] arr) {
        JavaBinarySearch javaBinarySearch = new JavaBinarySearch();
        return javaBinarySearch.binary_search(key, arr);
    }
}
