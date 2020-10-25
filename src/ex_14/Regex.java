package ex_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

public class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] rules = new String[Integer.parseInt(in.nextLine())];
        int length = rules.length;
        for (int i = 0; i < length; i++) {
            rules[i] = in.nextLine();
        }
        String text = in.nextLine();
        String srcStr = "";
        for (int i = 0; i < length; i++) {
            srcStr += rules[i].split(" ")[0];
            if (i != length - 1) srcStr += "|";
        }
        HashMap<String, String> replaceMap = new HashMap<>();
        for (String t : rules) replaceMap.put(t.split(" ")[0], t.split(" ")[1]);
        Pattern pattern = Pattern.compile(srcStr);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll(x -> replaceMap.get(x.group())));
    }
}
