package sorts;

public class bubbleSortActivity {
    public static void main(String[] args) {

        int[] arr = {5,2,1,4,3};

        for(int i = 0; i < arr.length; i++){
            for (int j =0; j<arr.length-i - 1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
// meke i eka adu krnne ekak adu wena nisa mulu array eken passe deweni step ekedi array length ek unsorted part ekt hariyn widiyt hada ganna

// 1 adu krnne j+1 krgen yana nisa anthima element ekedi j+1k nethi nisa