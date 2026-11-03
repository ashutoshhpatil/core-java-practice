package Array;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr =  {10,10,20,30,40,50,60,60,60,50,20};
        int n=arr.length;

        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+ " = "+ count);
        }
    }
}
