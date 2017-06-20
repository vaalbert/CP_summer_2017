/**
 * Created by prubac on 3/15/2017.
 */
public class Conditions {

    public static void main(String[] args) {

        boolean b1;
        b1 = true && false;

        b1 = "abc".contains("c") && 5 > 7;
        if (b1) {
            System.out.println("b1 is true");
        }

        int a = 3;
        {
            int b = 5;
            System.out.println("2nd line " + a + " " + b);
            {
                System.out.println("b=" + b);
            }
        }
        //System.out.println("b=" +b);

        double n = 7;

        if (n >= 5 && n <= 8)
            System.out.println("n is within limit");

        if (!(n >= 5 && n <= 8))
            System.out.println("n is not within limit");

        if (n < 5 || n > 8) {
            System.out.println("n is not within limit");
        }

/*
        if (n >= 5 && n <=8) {

        } else {
            System.out.println("n is not within limit");
        }
*/


        String s = "B";

        if (s.equals("A")) {
            System.out.println("A");
        } else if (s.equals("B")) {
            System.out.println("B");
        } else if (s.equals("C")) {
            System.out.println("C");
        } else {
            System.out.println("neither A B C");
        }

        switch (s) {
            case "A":
                System.out.println("AA");
                break;
            case "B":
                System.out.println("BB");
                //break;
            case "C":
                System.out.println("CC");
                break;
            default:
                System.out.println("neither A B C");
        }


        int res = s.equals("B") ? 10 : 0;

        System.out.println("res=" + res);


    }
}
