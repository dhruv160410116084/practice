import java.util.*;


class Magic {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[n];
        long sum = 0;
        int min_idx = 0;
        int flag = 0;
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
            sum += arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.println("for i th :"+arr[i]+" div by 7 :"+(sum-arr[i])%7);
            if((sum - arr[i]) % 7 == 0 && arr[i] < arr[min_idx]){
                min_idx = i;
                flag = 1;
            }
        }
        if(flag == 0)
            System.out.println(-1);
        else 
            System.out.println(min_idx);
    }
}
