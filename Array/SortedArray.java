package Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int n=arr.length;
        boolean sorted = true;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
              sorted =false;
              break;
            }
        }

        if(sorted){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not Sorted");
        }
    }
}
