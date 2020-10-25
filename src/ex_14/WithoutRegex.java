package ex_14;

import java.util.Scanner;

public class WithoutRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] rules = new String[Integer.parseInt(in.nextLine())];
        int length = rules.length;
        for (int i = 0; i < length; i++) {
            rules[i] = in.nextLine();
        }
        String text = in.nextLine();
        String textPiece;
        String textCopy;
        String[] src = new String[length];
        String[] ptr = new String[length];
        textPiece = "";
        textCopy = text;
        for (int i = 0; i < length; i++) {
            src[i] = rules[i].split(" ")[0];
            ptr[i] = rules[i].split(" ")[1];
        }
        for (int j = 0; j < text.length(); j++) {
            textPiece += text.charAt(j);

            for (int i = 0; i < src.length; i++) {
                if (src[i].contains(textPiece) && textCopy.contains(src[i]))
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");

                else if (textPiece.contains(src[i])) {
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");
                    textPiece = "";
                    break;
                }
            }
        }
        System.out.println(textCopy.replace(" ", ""));
    }
}
