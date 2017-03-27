package lab4;


public class afisareVector {
    public static void main(String[] args) {
        int x,i,j;
        j=0;
        int[] poz;
        boolean verif=false;
        x=SkeletonJava.readIntConsole(" numarul este = ");
        int[] a={1,1,1,1,1,1,1,1,1};
        poz=new int[a.length];
        for (i=0;i<a.length;i++)
            if (a[i]== x){
                poz[j]=i;
                 j=j+1;
                 verif=true;
        }
        if (verif){
            System.out.print( " numarul se afla la pozitia " );
            for (int k=0;k<j;k++)
                System.out.print(( poz[k] + " "));
        }

        else
                System.out.println("numarul nu se afla in sir");
    }
}
