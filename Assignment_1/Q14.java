public class Q14 {
    public static void tOH(int n,char from,char to,char aux){
        if(n<1){
            return;
        }
        tOH(n-1,from,aux,to);
        System.out.println(n+" moved "+from+" to "+to);
        tOH(n-1,aux,to,from);
    }
    public static void main(String[] args) {
        tOH(3,'A','C','B');
    }
}
