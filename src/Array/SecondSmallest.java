package Array;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest =smallest;
                smallest=arr[i];
            }

            if (arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest: "+secondSmallest);
    }
}
