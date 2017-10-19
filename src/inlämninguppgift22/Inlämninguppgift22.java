package inlämninguppgift22;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;

import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Inlämninguppgift22 {

    public Inlämninguppgift22() throws ParseException {

        String kundensInputInfo
               = JOptionPane.showInputDialog(null, "Skriv  in kundens 'personnummer' eller 'förnamn efternam': ");
        

        String filePath = "src\\Inlämninguppgift22\\Customer.txt";
        Path inFilePath;
        Path nyfil = Paths.get("src\\Inlämninguppgift22\\nyfil2.txt");//skapa en file (nyfil)

        String firstLine;// första rad  personnummer och namn  
        String secondLine;//  andra rad datum  
        String[] personInformationTexfile;
        boolean bPn, bnamn;
        try {
            PrintWriter w = new PrintWriter(Files.newBufferedWriter(nyfil));
            inFilePath = Paths.get(filePath);
            Scanner fileScanner = new Scanner(inFilePath);

            String s = "";
            while (fileScanner.hasNext()) {
                firstLine = fileScanner.nextLine();
                personInformationTexfile = firstLine.split(",");
                secondLine = fileScanner.nextLine();

                bPn = kundensInputInfo.equals(personInformationTexfile[0].trim());
                bnamn = kundensInputInfo.equalsIgnoreCase(personInformationTexfile[1].trim());
                boolean or = bPn || bnamn;
                boolean nor = !(bPn || bnamn);

                if (or) {

                    String input = secondLine.trim();
                    testDatum gd = new testDatum();
                     LocalDate L = LocalDate.now();
                    long days = gd.testDatum(input,L);
                    // System.out.println("Nu ska vi skriva ut");
                    if (days <= 365) {
                        JOptionPane.showMessageDialog(null, "En nuvarande medlem");
                       // System.out.println("Days="+days);
                       // System.out.println("En nuvarande medlem\n"
                        // + "Välkommen! Du har ett giltigt årskort!");
                       
                        FileWriter n = new FileWriter("nyfil2.txt", true);
                        try (BufferedWriter b = new BufferedWriter(n)) {
                            Insertinput i=new Insertinput ();
                            b.write(i.Insertinput(firstLine) + "  " + L + "  " + "\n");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "En före detta kund ");

                    }

                    System.exit(0);

                } else if (nor) {
                    s = "Personen aldrig har varit medlem.";

                }

            }//while-loop

            JOptionPane.showMessageDialog(null, s);

            
            w.close();

        } catch (FileNotFoundException e) {
            System.out.println("Filen kunde inte hittas");
            System.out.flush();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Det gick inte att skriva till fil");
            System.out.flush();
            System.exit(0);
        }
    }


        
        
        

    

    public static void main(String[] args) throws ParseException {
        Inlämninguppgift22 ö = new Inlämninguppgift22();
    }

}
