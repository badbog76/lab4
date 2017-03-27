package lab4;

/**
 * Created by xyz on 26-Mar-17.
 */
public class afisareSirPozitie {
    public static void main(String[] args) {
        int x,i,poz=-1;
        x=SkeletonJava.readIntConsole(" numarul este = ");
        int[] a={1,2,3,4,5,6,7,8,9};
        for (i=0;i<a.length;i++)
            if (a[i]== x)
               poz=i;
        if (poz!=-1)
            System.out.println( " numarul se afla la pozitia " +(poz));
        else
                System.out.println("numarul nu se afla in sir");
    }
}
