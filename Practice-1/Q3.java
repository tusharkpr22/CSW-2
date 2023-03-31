import java.util.Scanner;

public class Q3 {
    public static int firstElementKTimes(int[] a,int n,int k){
        for (int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                    if(c==k){
                        return a[i];
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Size:");
        n = sc.nextInt();
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Values Of Array a:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(firstElementKTimes(a,n,k));

    }
}
