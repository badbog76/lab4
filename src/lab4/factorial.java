package lab4;

/**
 * Created by xyz on 26-Mar-17.
 */
public class factorial {
    public static void main(String[] args) {
        int x;
        int f=1;
        x=SkeletonJava.readIntConsole(" X = ");
        for (int i=1;i<=x;i++)
            f=f*i;
        System.out.println(" factorialul lui " + x + " este " +f);

    }
}
