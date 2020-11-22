package ex_21_22;

import java.io.IOException;
import java.util.List;

public interface ItemsStore {
    List<Item> getAll() throws IOException, InterruptedException;
    Item get(int id) throws IOException, InterruptedException;
    Item addItem(Item item) throws IOException, InterruptedException;
    Item editItem(Item item,int id) throws IOException, InterruptedException;
    void deleteItem(int id) throws IOException, InterruptedException;

}