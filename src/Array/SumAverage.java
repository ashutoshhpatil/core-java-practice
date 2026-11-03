package Array;

public class SumAverage {
    public static void main(String[] args) {
        int[] arr = new int[]{2,8,5,6,4,3};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum is: "+sum);

        double average;

            average = (double) sum/arr.length;

        System.out.println("Average: "+average);

    }
}
