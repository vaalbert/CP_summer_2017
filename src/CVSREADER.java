import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Valentin on 02/06/2017.
 */
public class CVSREADER {

    public static void main(String[] args) throws FileNotFoundException, java.io.IOException
    {
        boolean  firstLine;             // Signal it is a header line
        double   open, close, change;   // Stock values

        NumberFormat nf =
                NumberFormat.getNumberInstance(new Locale("en", "US"));
        nf.setMinimumFractionDigits(6);
        nf.setMaximumFractionDigits(6);

        File myDir = new File("C:\\Users\\Valentin\\Documents\\Cours SGH\\S6\\Computer Programming\\STOCKS");
        File[] fileList = myDir.listFiles();

        for (File f : fileList)
        {
            if ( !f.getName().toLowerCase().endsWith(".csv") )
                continue;

            String aux = f.toString();
            String newFileName = aux.substring(0,aux.length()-4)+"-out.csv";
            File newFile = new File(newFileName);
            f.createNewFile();
            FileWriter fw = new FileWriter(newFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw, true);


            Scanner scanner = new Scanner(f);
            firstLine = true;
            while (scanner.hasNext())
            {
                String currLine = scanner.nextLine();
                if ( firstLine )
                {  firstLine = false;
                    out.println(currLine+",Percentage change");
                    continue;
                }


                String[] elem = currLine.split(",");
                open = Double.parseDouble(elem[1]);
                close= Double.parseDouble(elem[4]);
                change = (close-open)/open;
                out.println(currLine+','+nf.format(change));
            }
            out.close();
        }
    }
}