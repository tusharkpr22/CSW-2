public class Q4 {
    public static int binarySearch(int[] a,int n,int key){
        int  l=0;
        int h =a.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(key==a[mid]){
                return mid;
            }
            if(key>mid){
                l=l+1;
            }
            if(key<mid){
                h = h-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        System.out.println(binarySearch(arr,arr.length,900));

    }
}
