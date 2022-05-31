import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] boxes = new int[m];
        int[] matches = new int[m];
        int total = 0, M = 0;
        
        for(int i = 0; i<m; i++){
            boxes[i] = sc.nextInt();
            matches[i] = sc.nextInt();
        }
        while(n > 0){
            int max = 0;
            int idx = 0;
            for(int i = 0; i<matches.length; i++){
                if(matches[i] >= max){
                    max = matches[i];
                    idx = i;
                }
            }
            
            M++;
            if(n - boxes[idx] > 0){
                total += (boxes[idx] * matches[idx]);
            }
            else{
                total += (n * matches[idx]);
            }
            
            n -= boxes[idx];
            matches[idx] = 0;
            
            if(M < m)
                continue;
            else
                break;
        }
        System.out.println(total);
    }
}
