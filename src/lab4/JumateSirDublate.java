package lab4;

/**
 * Created by xyz on 27-Mar-17.
 */
public class JumateSirDublate {
    public static void main(String[] args) {
        int i;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8,9};
        for (i = 0; i < a.length; i++) {
            if (i <= a.length / 2)//daca vrem sa fie mai multe nr in prima jumatate,lasam "="
                System.out.print(+a[i] * 2 + " ");
            if (i > a.length / 2)//daca vrem sa fie mai multe nr in prima jumatate,punem "="
                if (a[i] % 2 != 0)
                    System.out.print(+a[i] * 3 + " ");
                else
                    System.out.print(+a[i] + " ");
        }
    }
}
