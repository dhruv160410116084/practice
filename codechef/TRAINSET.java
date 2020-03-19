import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

class TRAINSET{
    public static void main(String[] args) {
        try {
            // Scanner scan = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            // int T = scan.nextInt();
            int T = Integer.parseInt(st.nextToken());
            int N=0;
            String str = "";
            int zero_or_one = 0;
            int total = 0;

            while(T-- != 0){
                total = 0;
                // N = scan.nextInt();
                N = Integer.parseInt(br.readLine());
                HashMap<String,Node> hs = new HashMap<String,Node>();
                while(N-- != 0){
                    st = new StringTokenizer(br.readLine());
                    str = st.nextToken();
                    zero_or_one = Integer.parseInt(st.nextToken());
                    // str = scan.next();
                    // zero_or_one = scan.nextInt();
                    if(hs.containsKey(str)){
                        Node n = hs.get(str);
                        if(zero_or_one == 0){
                            n.zero_count++;
                        }else{
                            n.one_count++;
                        }

                    }else{
                        Node n = new Node();
                        if(zero_or_one == 0){
                            n.zero_count++;
                            hs.put(str,n);
                        }else{
                            n.one_count++;
                            hs.put(str, n);
                        }
                    }
                }
                for(Map.Entry<String,Node> entry : hs.entrySet()){
                    Node temp = entry.getValue();
                    total += temp.one_count > temp.zero_count? temp.one_count: temp.zero_count;
                }
                sb.append(total+"\n");

            }
            System.out.println(sb);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}

class Node{
    int zero_count = 0;
    int one_count = 0;
}