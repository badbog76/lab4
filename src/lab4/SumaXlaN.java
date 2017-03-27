package lab4;

/**
 * Created by xyz on 27-Mar-17.
 */
public class SumaXlaN {
    public static void main(String[] args) {
        int n,x,s=0;
        x=SkeletonJava.readIntConsole("X=");
        n=SkeletonJava.readIntConsole("N=");
        for(int i=0;i<=n;i++)
            s=s+putere(x,i);
        System.out.println(s);

    }

    public static int putere(int x,int n) {
        int p=1;
        for (int j=1;j<=n;j++)
           p=p*x;
        return p;

    }
}
