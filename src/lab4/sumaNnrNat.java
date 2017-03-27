package lab4;

/**
 * Created by xyz on 26-Mar-17.
 */
public class sumaNnrNat {
    public static void main(String[] args) {
        int x,sum,i;
        sum=0;
        x=SkeletonJava.readIntConsole(" X = ");
        for (i=0;i<=x;i++)
            sum=sum+i;
        System.out.println(" suma primelor " + x + " numere naturale este " +sum);
    }
}
