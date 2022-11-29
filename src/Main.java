import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("ЖАКТЫРДЫМ", "Алыкул Осмоонов ",
                "Кайдан таптым, билбейм мындай мүнөздү?\n" +
                        "Дос, туугандар күнөкөр деп күлбөспү?\n" +
                        "Тирүүлүккө ирегелеш салынган -\n" +
                        "Жаман көрөм, калың мүрзө, күмбөздү");

        try (FileWriter fileWriter = new FileWriter("song.txt");) {
            fileWriter.write(song.getTitle());
            fileWriter.write("\n" + song.getAuthor());
            fileWriter.write("\n" + song.getText());
        } catch (IOException e) {
            e.getStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("song.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.err.println(" no such file !");
        }
    }
}