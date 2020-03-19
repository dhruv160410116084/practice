import java.util.*;
import java.lang.Math;

class SeatingArrangement {
    public static void main(String[] args) {

        // for(int i=1;i<61;i++){
        // int group = (int)Math.ceil((double)i/3);
        // int line = (int)Math.ceil((double)(group*3)/6) ;
        // int elementNo = i-(((group-1)*3)+1);
        // System.out.println(" seatNo :"+i+" is in group :"+group+ " line no :"+line +
        // " elementNO: "+elementNo );
        // }

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int seat = s.nextInt();
            int group = (int) Math.ceil((double) seat / 3);
            int line = (int) Math.ceil((double) (group * 3) / 6) % 2;
            int elementNo = seat - (((group - 1) * 3) + 1);
            System.out.println("seat :" + seat + " group :" + group + " line: " + line + " elementNo: " + elementNo);
            int ans = 0;

            // sb.append(seat);
            if (line == 0) {
                if (group % 2 == 0) {
                    switch (elementNo) {
                    case 0: {
                        ans = (group -3) * 3;
                        sb.append(ans + " AS\n");
                        break;
                    }
                    case 1: {
                        ans = (group -3) * 3 - 1;
                        sb.append(ans + " MS\n");
                        break;
                    }
                    case 2: {
                        ans = (group -3) * 3 - 2;
                        sb.append(ans + " WS\n");
                        break;
                    }
                    }

                } else {
                    switch (elementNo) {
                    case 0: {
                        ans = (group -1) * 3;
                        sb.append(ans + " WS\n");
                        break;
                    }
                    case 1: {
                        ans = (group -1) * 3 - 1;
                        sb.append(ans + " MS\n");
                        break;
                    }
                    case 2: {
                        ans = (group -1) * 3 - 2;
                        sb.append(ans + " AS\n");
                        break;
                    }
                    }
                }

            }
            if (line == 1) {
                if (group % 2 == 0) {
                    switch (elementNo) {
                    case 0: {
                        ans = (group + 1) * 3;
                        sb.append(ans + " AS\n");
                        break;
                    }
                    case 1: {
                        ans = (group + 1) * 3 - 1;
                        sb.append(ans + " MS\n");
                        break;
                    }
                    case 2: {
                        ans = (group + 1) * 3 - 2;
                        sb.append(ans + " WS\n");
                        break;
                    }
                    }

                } else {
                    switch (elementNo) {
                    case 0: {
                        ans = (group + 3) * 3;
                        sb.append(ans + " WS\n");
                        break;
                    }
                    case 1: {
                        ans = (group + 3) * 3 - 1;
                        sb.append(ans + " MS\n");
                        break;
                    }
                    case 2: {
                        ans = (group + 3) * 3 - 2;
                        sb.append(ans + " AS\n");
                        break;
                    }
                    }
                }
            }

        }
        System.out.println(sb);

    }
}