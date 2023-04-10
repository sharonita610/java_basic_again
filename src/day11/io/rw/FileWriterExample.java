package day11.io.rw;

import day08.poly.car.Stinger;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("C:/exercise/메롱.txt")){

            String s = "메에에에ㅔㅇ롱로오로오롱로 \n약오르징?";
            fw.write(s);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
