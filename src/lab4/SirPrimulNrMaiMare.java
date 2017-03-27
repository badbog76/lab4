package lab4;

/**
 * Created by xyz on 25-Mar-17.
 */
public class SirPrimulNrMaiMare {
    public static void main(String[] args) {
        int[] anArray = {11,13,9,8,16};
        for (int i=1;i<anArray.length;i++)
        if (anArray[i-1]>anArray[i]) {
            System.out.println(+anArray[i - 1] + " " + anArray[i]);
            i=i+1;//un nr sa nu fie comparat de 2 ori
        }
    }
}
