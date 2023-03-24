import java.util.Scanner;

public class Q1 {
    public static void reverseSubArray(int[] arr,int n,int k){
        for(int i=0;i<n;i=i+k){
            int l=i;
            int r=Math.min(k+i-1,n-1);
            int temp=0;
            while(l<r){
                temp = arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        System.out.println("Size:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("K:");
        k = sc.nextInt();
        System.out.println("Values Of Array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        reverseSubArray(a,n,k);
    }
}
