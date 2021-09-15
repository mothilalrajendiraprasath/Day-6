import java.util.Scanner;
public class stopWatch {
    public long start=0;
    public long stop=0;
    public long elapse;

    public void start() {
        start = System.currentTimeMillis();
        System.out.println("Start time:"+start);
    }
    public void stop() {
        stop = System.currentTimeMillis();
        System.out.println("Stop time:"+stop);
    }
    public long elapseTime() {
        elapse=stop-start;
        return elapse;
    }
    public static void main(String[] args){
        int a,b;
        stopWatch sw=new stopWatch();
        System.out.println("Start the time:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        sw.start();

        System.out.println("Stop the time :");
        b=sc.nextInt();
        sw.stop();

        long l=sw.elapseTime();
        System.out.println("time elapsed in millisecond:"+l);
    }
}
