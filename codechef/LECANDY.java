import java.io.*;
import java.util.StringTokenizer;

class LECANDY{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int T = Integer.parseInt(st.nextToken());
            while(T-- != 0){
                st = new StringTokenizer(br.readLine());
                 int N = Integer.parseInt(st.nextToken());
                 int C = Integer.parseInt(st.nextToken());
                 int sum = 0;
                 int arr[] = new int[N];
                 st = new StringTokenizer(br.readLine());
                 for(int i=0;i<N;i++){
                    arr[i] = Integer.parseInt(st.nextToken());
                    sum += arr[i];
                 }
                 if(sum <= C)
                    sb.append("Yes\n");
                 else
                    sb.append("No\n");
            }
            System.out.println(sb);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}