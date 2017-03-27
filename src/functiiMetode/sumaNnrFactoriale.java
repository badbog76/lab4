package functiiMetode;

/**
 * Created by xyz on 27-Mar-17.
 */
public class sumaNnrFactoriale {
    public static void main(String[] args) {
      int   n,s=0;
      n=SkeletonJava.readIntConsole(" n= ");
     for (int i=1;i<=n;i++)
         s=s+factorial(i);
        System.out.println(s);
    }

    public static int factorial(int n) {
        int f=1;
        for (int j=1;j<=n;j++)
            f=f*j;
        return f;

    }
}
