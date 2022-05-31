import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i< (int)n/2; i++){
            sum += (arr[i]+arr[n-1-i]) * (arr[i]+arr[n-1-i]);
        }
        System.out.println(sum);
    }
}
