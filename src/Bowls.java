public class Bowls {

    public static void main(String[] args) {


// determines the number of rows if given number of pins
        int pins = 21;
        int sum = 0;
        int rows = 0;
        for (int i = 1; sum < pins; i++) {
        sum = sum + i;
        rows = i;
        }

        System.out.println(rows);


        int n;
        n = 6;
// prints out the shape
        for (int i=0; i < n; i++){

        for (int j = 0; i > j; j++ ) {
        System.out.print("*");
        }
        System.out.println();

        }
// determines the number of pins given number of rows
        int j = 0;
        int r = 6;
        for (int i=0; i<=r; i++){
        j = j + i;
        }
        System.out.println(j);

        }

        }
