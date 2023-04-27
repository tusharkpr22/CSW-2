import java.util.*;
public class Q2 {
    public static void binaryEquivalentDec(int n){
        ArrayList<Integer> al = new ArrayList<>();
        while(n!=0){
            int r=n%2;
            al.add(r);
            n /= 2;
        }
        Collections.reverse(al);
        printList(al);
    }
    public static  void printList(ArrayList al){
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
    public static void main(String[] args) {
        int n=7;
        binaryEquivalentDec(n);
    }
}
