public class Q8 {
    public static void indexArray(int[] a,int n){
        for(int i=0;i<n;i++){
            while(a[i] != -1 && a[i] != i){
                int temp = a[i];
                a[i] = a[temp];
                a[temp] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {8,-1,6,1,9,3,2,7,4,-1};
        indexArray(a,a.length);
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
