import java.io.*;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Valentin on 06/06/2017.
 */
public class TicTacToe {

    public static void main(String[] args) throws FileNotFoundException {

        char[][] tab= new char[3][3];
        char     winner = ' ';

        File TicTacGame = new File("C:\\Users\\Valentin\\Desktop\\tictactoe.txt");
        Scanner scanner = new Scanner(TicTacGame);

        // Read data
        for ( int i=0; i < 3; i++)
        {  String currLine = scanner.nextLine();
            tab[i][0] = currLine.charAt(0);
            tab[i][1] = currLine.charAt(2);
            tab[i][2] = currLine.charAt(4);
        }

        for ( int i=0; i < 3; i++)
        {  System.out.println(tab[i][0]+"|"+tab[i][1]+"|"+tab[i][2]);
            if ( tab[i][0]==tab[i][1] && tab[i][1] == tab[i][2] )
                winner = tab[i][0];
        }

        if ( winner == ' ' )
            for ( int j=0; j < 3; j++)
                if ( tab[0][j]==tab[1][j] && tab[1][j] == tab[2][j] )
                    winner = tab[0][j];

        if ( winner == ' ' )
            if ( tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2] )
                winner = tab[0][0];

        if ( winner == ' ' )
            if ( tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0] )
                winner = tab[0][2];

        if ( winner == ' ' )
            System.out.println("There is no winner for this game.");
        else
            System.out.println("The winner is: " + winner+".");
    }
}
