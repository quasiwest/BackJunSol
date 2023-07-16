import java.util.Scanner;

public class b2470 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr =  new long[N];
        int i,j;
        long sum = 0;
        long min = Long.MAX_VALUE;
        int idx1=0,idx2=0;
        for(i = 0; i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i<N;i++){
            System.out.println(arr[i]);
        }
        for(i = 0; i<N;i++){
            for(j = i+1;j<N;j++){
                sum = arr[i] + arr[j];
                if(sum < 0){
                    sum *=-1;
                }
                if(sum<min){
                    min = sum;
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        if(arr[idx1]>arr[idx2]) System.out.println(arr[idx2] + " " + arr[idx1]);
        else System.out.println(arr[idx1] + " " + arr[idx2]);
    }
}
