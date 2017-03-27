package lab4;

/**
 * Created by xyz on 26-Mar-17.
 */
public class aLaN {
    public static void main(String[] args) {
        int a,n;
        int x=1;
        a=SkeletonJava.readIntConsole(" a =");
        n=SkeletonJava.readIntConsole(" n=");
        for (int i=1;i<=n;i++)
            x=x*a;
        System.out.println(" X=" +x);
    }

}
