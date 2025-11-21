package Array;

import java.util.Scanner;

public class ArrayActivity {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        for (int i=0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The numbers array : ");

        for(int s : arr){
            System.out.println(s);
        }

        System.out.println("which placed number you want to change : ");
        int changeInd = sc.nextInt();
        System.out.println("what is the change number : ");
        int newNum = sc.nextInt();

        arr[changeInd - 1] = newNum;

        System.out.println("The numbers array : ");

        for(int s : arr){
            System.out.println(s);
        }

        System.out.println("Enter the number you want to search :");
        int searchNum = sc.nextInt();
        boolean found = false;

        for (int i=0; i<arr.length; i++){
            if(arr[i] == searchNum){
                found = true;
                System.out.println("this number is valid in "+(i+1) +" place.");
                break;
            }

        }
        if(!found){
            System.out.println("there is not that number");
        }

        System.out.println("which placed number you want to delete : ");
        int deleteInd = sc.nextInt();

        arr[deleteInd-1] = 0;

        System.out.println("The numbers array : ");

        for(int s : arr){
            System.out.println(s);
        }
    }
}
