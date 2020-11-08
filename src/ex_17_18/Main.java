package ex_17_18;

import java.io.*;

public class Main {

    static StringBuilder result = new StringBuilder();
    public static void searchInDir(String path) {
        File file = new File(path);

        if(file.isDirectory())
        {
            for(String t : file.list())
            {
                searchInDir(file.getPath() + "\\" + t);
            }
        }
        else if(file.isFile() && file.getPath().endsWith(".java"))
        {
            try(BufferedReader reader = new BufferedReader(new FileReader(file.getPath())))
            {
                result.append("### " + file.getPath() + "\n" + "```java" + "\n");
                while(reader.readLine()!= null)
                {
                    result.append(reader.readLine() + "\n");
                }
                result.append("```" + "\n");
            } catch (FileNotFoundException e) {
                System.out.println("file not found");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        searchInDir("C:\\Users\\Iluuusha\\Desktop\\учеба\\mirea_java\\src");
        try(PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Iluuusha\\Desktop\\учеба\\mirea_java\\result.md")))
        {
            writer.print(result);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}