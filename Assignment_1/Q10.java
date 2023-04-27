public class Q10 {
    public static void maxMinForm(int[] a,int n){
        for(int i=0;i<n-1;i++){
            reverse(a,i,n-1);
        }
    }
    public static void reverse(int[] a,int l,int h){
        while(l<=h){
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        maxMinForm(a,a.length);
        for(int e:a){
            System.out.print(e+" ");
        }

    }
}
