package Array;

public class operation {
    public static void main(String[] args) {
        int Test[] = new int[3];
        int n = Test.length;
        System.out.println("Array Before Deletion:");
        for(int i = 0; i < n; i++) {Test[i] = i + 3;
            System.out.println(" Test[" + i + "] = " + Test[i]); }
        for(int i = 1; i<n-1; i++)
        {Test[i] = Test[i+1]; n = n - 1; }
        System.out.println("Array After Deletion:");
        for(int i = 0; i < n; i++)
        { System.out.println(" Test[" + i + "] = " + Test[i]); }
    }
}
