package lab4;

/**
 * Created by xyz on 27-Mar-17.
 */
public class SirNrValori {
    public static void main(String[] args) {
        int x,y,i,j=0;
        int[] a={3,1,5,8,22,16};
        int[] b=new int[a.length];
        x=SkeletonJava.readIntConsole(" X=");
        y=SkeletonJava.readIntConsole(" Y=");
        for (i=0;i<a.length;i++)
           if (a[i]==x) {
               do
                   b[j++]=a[i++];


               while (a[i] != y);
           }
        for (i=1;i<j;i++)
            System.out.print(b[i]+" ");
    }
}
