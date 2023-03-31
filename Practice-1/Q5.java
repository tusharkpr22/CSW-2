import java.util.ArrayList;


public class Q5 {
    public static ArrayList<Integer> continuousSubArray(int[] a,int sum){
        ArrayList<Integer> al = new ArrayList<>();
        int tSum=0;
        int l=0;
        for(int r=0;r<a.length;r++){
            tSum += a[r];
            if(tSum>sum){
                tSum -= a[l];
                l++;
            }
            if(tSum==sum){
                al.add(l+1);
                al.add(r+1);
            }
        }
        if(al.isEmpty()){
            al.add(-1);
        }
        return al;
    }
    public static void main(String[] args) {
        int[] a ={10,5,3,6,4};
        ArrayList<Integer> li = continuousSubArray(a,6);
        for(Integer e : li){
            System.out.print(e+" ");
        }
    }
}
