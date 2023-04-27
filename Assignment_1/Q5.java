public class Q5 {
    public static void rotateArray(int[] a,int n, int k){
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);
    }
    public static void reverse(int[] a,int l,int r){
        for(int i=l;i<=r;i++){
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
            r = r-1;
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int k =2;
        rotateArray(a,a.length,k);
        for(int e:a){
            System.out.print(e+" ");
        }

    }
}
