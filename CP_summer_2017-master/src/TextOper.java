/**
 * Created by prubac on 3/8/2017.
 */
public class TextOper {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;

        int posBC = s3.lastIndexOf("ab");

        String s4 = s3.substring(2, 4);

        s4 = s3.replace("ab", "AB");

        s4 = s4.toUpperCase();

        int s4len = s4.length();

        System.out.println(s3);
        System.out.println(posBC);
        System.out.println(s4);
        System.out.println(s4len);

        char c1 = s4.charAt(4);

        System.out.println(c1);

        // &&  - AND
        // ||  - OR

        if (s4.contains("F") && (s4.length() < 7)) {
            System.out.println("s4 contains F");
        } else {
            System.out.println("s4 doesn't contain F");
        }


    }
}
