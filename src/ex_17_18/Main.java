package ex_17_18;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    static PrintWriter pw;

    static {
        try {
            pw = new PrintWriter("result.md");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getContents(String path){
        File file = new File(path);
        if(file.isDirectory()){
            String[] contents = file.list();
            for (String s:contents) {
                getContents(path+"/"+s);
            }
        }
        if(file.isFile() ) {
            if (file.getName().substring(file.getName().lastIndexOf(".")).equals(".java")) {
                try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                    pw.write("##### " + path + "\n```java\n");
                    String line = reader.readLine();
                    while (line != null) {
                        pw.write(line + "\n");
                        line = reader.readLine();
                    }
                    pw.write("```\n");


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public static void main(String[] args) {
        Path filePath = Paths.get("").toAbsolutePath();
        getContents(filePath.toString()+"/src");
        pw.close();
    }
}