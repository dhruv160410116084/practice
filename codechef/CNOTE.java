import java.io.*;
import java.util.StringTokenizer;

class CNOTE{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int T = Integer.parseInt(st.nextToken());
            while(T-- != 0){
                st = new StringTokenizer(br.readLine());
                 int X = Integer.parseInt(st.nextToken());
                 int Y = Integer.parseInt(st.nextToken());
                 int K = Integer.parseInt(st.nextToken());
                 int N = Integer.parseInt(st.nextToken());
                 int pages =  0;
                 int price = 0;
                 if(Y >= X)
                    sb.append("LuckyChef\n");
                else{
                    int diff = X - Y;
                    boolean foundAns = false;
                    
                    for(int i=0;i<N;i++){
                        st = new StringTokenizer(br.readLine());
                        pages = Integer.parseInt(st.nextToken());
                        price = Integer.parseInt(st.nextToken());
                        if(pages >= diff && price <= K){
                            foundAns = true;
                        }
                    }
                    if(!foundAns)
                        sb.append("UnluckyChef\n");
                    else
                        sb.append("LuckyChef\n");
                }
            }
            System.out.print(sb);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}