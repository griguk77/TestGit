import java.util.Locale;
import java.util.*;

public class Quiz {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a = new int[a1.length + a2.length];
        if (a1.length == 0) {
            return a2;
        }
        else {
            if (a2.length == 0) {
                return a1;
            }
            else {
                int n = 0, m = 0, f = 0, j = 0;
                for (int i = 0; i < a1.length + a2.length; i++) {
                    if (a1[n] < a2[m]) {
                        a[i] = a1[n];
                        n++;
                    } else {
                        a[i] = a2[m];
                        m++;
                    }
                    if (n == a1.length) {
                        f = 1;
                        j = i + 1;
                        break;
                    } else {
                        if (m == a2.length) {
                            f = 2;
                            j = i + 1;
                            break;
                        }
                    }
                }
                if (f == 1) {
                    for (int i = j; i < a1.length + a2.length; i++) {
                        a[i] = a2[m];
                        m++;
                    }
                } else {
                    for (int i = j; i < a1.length + a2.length; i++) {
                        a[i] = a1[n];
                        n++;
                    }
                }
                return a;
            }
        }
    }

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int [] a1 = {1,4,7,9};
        int [] a2 = {2,3,5,6};
        int [] a = mergeArrays(a1,a2);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}