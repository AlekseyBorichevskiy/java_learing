package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ComplexNumberParser {
    public ArrayList<ComplexNumber> createArrayDataFromFile(String filename)
    {
        ArrayList<ComplexNumber> numbers = new ArrayList<>();
        File file = new File(filename);
        try(Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNext())
            {
                try{
                    String[] array = scanner.nextLine().split("\\s");
                    int real = Integer.parseInt(array[0]);
                    int imaginary = Integer.parseInt(array[2]);
                    numbers.add(new ComplexNumber(real, imaginary));
                }
                catch (NumberFormatException exc)

                {
                    System.err.println("Ошибка, строка пропущена");
                }

            }
        }
        catch (FileNotFoundException exc)
        {
            System.err.println("Ошибка, файл не найден");
        }
        return numbers;

    }
}
