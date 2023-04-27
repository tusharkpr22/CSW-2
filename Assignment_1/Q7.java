public class Q7 {
    public static void waveForm(int[] a,int n) {
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
                }
            else {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {16,17,4,15,10};
        waveForm(a,a.length);
        for(int e:a){
            System.out.print(e+" ");
        }
    }

}
