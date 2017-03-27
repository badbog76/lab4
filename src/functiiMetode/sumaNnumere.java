package functiiMetode;

/**
 * Created by xyz on 27-Mar-17.
 */
public class sumaNnumere {
    public static void main(String[] args) {
        int n;
        n= SkeletonJava.readIntConsole(" N=");
        System.out.println(suma(n));
    }
    public static int suma(int n ) {
        int s=0;
        for (int i=0;i<=n;i++)
            s=s+i;
        return s;
     }
}

