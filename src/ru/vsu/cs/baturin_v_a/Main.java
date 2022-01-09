package ru.vsu.cs.baturin_v_a;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Paths.get("text.txt"));

        Translit translit = new Translit();
        System.out.println(translit.CyrillicToLatinStr(text));
    }
}
