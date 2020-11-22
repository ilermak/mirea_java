package ex_21_22;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonFile implements ItemsStore {
    final String path = "src\\ex_21_22\\data.json";
    File file = new File(path);
    FileWriter fw;
    Gson gson;

    public JsonFile() {
        gson = new Gson();
    }

    @Override
    public List<Item> getAll() {
        Type type = new TypeToken<List<Item>>(){}.getType();
        List<Item> items = null;
        try(FileReader fr = new FileReader(file)) {
            items = gson.fromJson(fr,type);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return items;
    }

    @Override
    public Item get(int id) throws IOException, InterruptedException {
        List<Item> items = getAll();
        for (Item i:items) {
            if(i.getId()==id){
                return i;
            }
        }
        return null;
    }

    @Override
    public Item addItem(Item item) throws IOException, InterruptedException {
        List<Item> items = getAll();
        item.setId(getNewId());
        items.add(item);
        sort(items);
        fw = new FileWriter(path);
        fw.write("[\n");
        for (Item i:items) {
            fw.write(gson.toJson(i));
            if(items.indexOf(i)!=items.size()-1) fw.write(",");
            fw.write("\n");
        }
        fw.write("\n]");
        fw.close();
        return get(item.getId());
    }

    @Override
    public Item editItem(Item item, int id) throws IOException, InterruptedException {
        List<Item> items = getAll();
        items.removeIf(i->i.getId()==id);
        items.add(item);
        sort(items);
        fw = new FileWriter(path);
        fw.write("[\n");
        for (Item i:items) {
            fw.write(gson.toJson(i));
            if(items.indexOf(i)!=items.size()-1) fw.write(",");
            fw.write("\n");
        }
        fw.write("\n]");
        fw.close();
        return get(item.getId());
    }

    @Override
    public void deleteItem(int id) throws IOException, InterruptedException {
        List<Item> items = getAll();
        items.removeIf(i -> i.getId() == id);
        sort(items);
        fw = new FileWriter(path);
        fw.write("[\n");
        for (Item i:items) {
            fw.write(gson.toJson(i));
            if(items.indexOf(i)!=items.size()-1) fw.write(",");
            fw.write("\n");
        }
        fw.write("\n]");
        fw.close();
    }

    private void sort(List<Item> items){
        items.sort((o1, o2) -> (int) Math.signum(o1.getId()-o2.getId()));
    }
    private int getNewId(){
        List<Item> items = getAll();
        ArrayList<Integer> ids = new ArrayList<>();
        for (Item i: items)
            ids.add(i.getId());
        int id = 1;
        while(ids.contains(id)) id++;
        return id;
    }
}
