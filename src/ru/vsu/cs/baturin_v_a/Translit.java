package ru.vsu.cs.baturin_v_a;

import static java.lang.Character.toUpperCase;

public class Translit {
    private String CyrillicToLatinCh(char ch){
        return switch (ch) {
            case 'А' -> "A";
            case 'Б' -> "B";
            case 'В' -> "V";
            case 'Г' -> "G";
            case 'Д' -> "D";
            case 'Е', 'Ё', 'Э' -> "E";
            case 'Ж' -> "ZH";
            case 'З' -> "Z";
            case 'И', 'Й' -> "I";
            case 'К' -> "K";
            case 'Л' -> "L";
            case 'М' -> "M";
            case 'Н' -> "N";
            case 'О' -> "O";
            case 'П' -> "P";
            case 'Р' -> "R";
            case 'С' -> "S";
            case 'Т' -> "T";
            case 'У' -> "U";
            case 'Ф' -> "F";
            case 'Х' -> "KH";
            case 'Ц' -> "TS";
            case 'Ч' -> "CH";
            case 'Ш' -> "SH";
            case 'Щ' -> "SHCH";
            case 'Ъ' -> "IE";
            case 'Ы' -> "Y";
            case 'Ь' -> "";
            case 'Ю' -> "IU";
            case 'Я' -> "IA";
            default -> String.valueOf(ch);
        };
    }

    public String CyrillicToLatinStr(String string){
        StringBuilder stringBuilder = new StringBuilder(string.length()*2);
        for(char ch: string.toCharArray()){
            char upCh = toUpperCase(ch);
            String lat = CyrillicToLatinCh(upCh);
            if(ch != upCh){
                lat = lat.toLowerCase();
            }
            stringBuilder.append(lat);
        }
        return stringBuilder.toString();
    }
}