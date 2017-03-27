package lab4;

/**
 * Created by xyz on 27-Mar-17.
 */
public class sirCrescator {
    public static void main(String[] args) {
        int x,aux;
        boolean pres=true,pres1;
        int[] a={9,8,7,6,5,4,3,2,1};
        for (x=0;x<a.length-1;x++)
            if (a[x]>a[x+1])
                pres=false;
        if (pres)
            System.out.println(" crescator");
        else
        {
            System.out.print(" sirul ordonat crescator este a[]= ");
            do{
                pres1=true;
                for (int i=0;i<a.length-1;i++)
                    if(a[i]>a[i+1])
                    {
                        aux=a[i];
                        a[i]=a[i+1];
                        a[i+1]=aux;
                        pres1=false;
                    }

            }while(pres1!=true);
        }
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
