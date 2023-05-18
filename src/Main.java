import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название файла");
        String file_name = input.next();
        List_class list_class = new List_class();
        try(FileReader fr = new FileReader(file_name)) {
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] schoolboy = line.split("\t");
                try {
                    String name = schoolboy[0];
                    String surname = schoolboy[1];
                    int number_of_class = Integer.parseInt(schoolboy[2]);
                    String item = schoolboy[3];
                    int mark = Integer.parseInt(schoolboy[4]);

                    Schoolboy sch = new Schoolboy(name, surname, number_of_class, item, mark);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Такого файла нет");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}