package day11.io.objectStream;

import day06.modi.pac1.A;
import day11.Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LoadSnack {

    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {

        loadFile();


        for (Snack s : snackList) {
            System.out.println(s);
        }
    }

    private static void loadFile() {

        try (FileInputStream fis = new FileInputStream(Path.ROOT_PATH + "/snack.sav")) {


            // 객체를 불러올 보조 스트림
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> object = (List<Snack>) ois.readObject();
            snackList = object;


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {


        }

    }
}
