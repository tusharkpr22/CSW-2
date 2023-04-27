public class Q17 {
    public static int recBinarySearch(int[] a,int low, int high,int key){
        if(low>=0 && high<a.length){
            if(low>high){
                return -1;
            }
            int mid=low+(high-low)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(key<a[mid]){
                return recBinarySearch(a,low,mid-1,key);
            }
            else {
                return recBinarySearch(a,mid+1,high,key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int low=0,high=arr.length-1;
        System.out.println(recBinarySearch(arr,low,high,20));
    }
}
