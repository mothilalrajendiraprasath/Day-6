public class fibonacci {
    public static void main(String args[]){
        int a=0,b=1,count=10,n;
        for(int i=2;i<count;++i) {
            n = a + b;
            System.out.print(" "+n);
            a = b;
            b = n;
        }
    }
}
