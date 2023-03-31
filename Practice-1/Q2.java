import java.util.*;


public class Q2 {
    public static void equalArray(int[] a,int[] b,int n){
        int c=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                c++;
                break;
            }
        }
        if(c==0){
            System.out.println("Arrays are equal:");
        }
        else{
            System.out.println("Arrays are not equal:");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Size:");
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Values Of Array a:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Values Of Array b:");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        equalArray(a,b,n);
    }
}
