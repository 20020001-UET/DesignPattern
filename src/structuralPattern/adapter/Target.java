package structuralPattern.adapter;

public class Target extends MyLib {
    void doSomething() {
        int[] arr = new int[10];
        sort(arr);
        int key = 5;
        int result = binary_search(key, arr);
    }
}
