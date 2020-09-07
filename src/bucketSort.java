import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    static void bucketSort(float[] arr, int n) {
        if(n <= 0)
            return;
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] b = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            b[i] = new ArrayList<Float>();
        }
        for(int i = 0; i < n; i++){
            int idx = (int)arr[i]*n;
            b[idx].add(arr[i]);
        }
        for(int i = 0; i < n; i++) {
            Collections.sort(b[i]);
        }
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < b[i].size(); j++){
                arr[index++] = b[i].get(j);
            }
        }
    }
}


switch (tokens[1].charAt(0)) {
        case '+':
        result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
        break;
        case '-':
        result = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
        break;
        case '*':
        result = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]);
        break;
        case '/':
        result = Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[2]);