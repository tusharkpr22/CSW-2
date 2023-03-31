import java.util.Scanner;

public class Q4 {
    public static void  rearrangeElements(int[] a,int n){
        int c=0;
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            else{
                if(a[i]<a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Size:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Values Of Array a:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rearrangeElements(a,n);
    }
}
