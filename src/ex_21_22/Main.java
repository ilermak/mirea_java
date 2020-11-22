package ex_21_22;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ItemsStore storage;
        String command;
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вы хотите работать с json? \n " +
                           "1 - локально \n " +
                           "2 - через сервер");
        command = sc.next();
        command = command.toLowerCase();
        while(!command.equals("2")&&!command.equals("1"))
        {
            System.out.println("Неверный ввод!");
            System.out.println("Как вы хотите работать с json? \n " +
                    "1 - локально \n " +
                    "2 - через сервер");
            command = sc.next();
            command = command.toLowerCase();
        }
        if(command.equals("2")){
            storage = new JsonServer();
        } else {
            storage = new JsonFile();
        }
        System.out.println("Что вы хотите сделать?\n " +
                           "1-получение, " +
                           "2-добавление, " +
                           "3-редактирование, " +
                           "4-удаление, " +
                           "5-получить все, ");
        while (true){
            command = sc.nextLine();
            switch (command){
                case "1":
                    System.out.print("Enter item id: ");
                    int getId = sc.nextInt();
                    Item respond = storage.get(getId);
                    if (respond==null) {
                        System.out.println("Item not found");
                    } else {
                        System.out.println(respond+" Description: "+respond.getDescription());
                    }
                    break;

                case "2":
                    int id;
                    String data, description;
                    boolean isGood;
                    System.out.print("Item id: ");
                    id = sc.nextInt();
                    System.out.print("Item data: ");
                    data = sc.next();
                    System.out.print("Is this item good: ");
                    isGood = sc.nextBoolean();
                    System.out.print("Item description: ");
                    description = sc.next();
                    System.out.println("Item added: "+storage.addItem(new Item(id, data, isGood, description)));
                    break;

                case "3":
                    System.out.print("Enter item id: ");
                    int editId = sc.nextInt();
                    Item currItem = storage.get(editId);
                    int e_id;
                    String e_data, e_description;
                    boolean e_isGood;
                    System.out.println(currItem);
                    System.out.print("Enter new item id: ");
                    e_id = sc.nextInt();
                    System.out.print("Enter new item data: ");
                    e_data = sc.next();
                    System.out.print("Is this item good: ");
                    e_isGood = sc.nextBoolean();
                    System.out.print("Enter new item description: ");
                    e_description = sc.next();
                    storage.editItem(new Item(e_id,e_data,e_isGood,e_description),editId);
                    break;

                case "4":
                    System.out.print("Enter item id: ");
                    int deleteId = sc.nextInt();
                    if(storage.get(deleteId)!=null)
                        System.out.println("Item with id "+deleteId+" was deleted");
                    storage.deleteItem(deleteId);
                    break;

                case "5":
                    List<Item> items = storage.getAll();
                    for (Object i: items) {
                        System.out.println(i);
                    }
                    break;
            }
        }
    }
}




