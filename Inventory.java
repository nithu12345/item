import java.util.*;

class Inventory {
    private Map<String, Item> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    public void additem(Item item) {
        items.put(item.getitemid(), item);
    }

    public void removeitem(String itemid) {
        items.remove(itemid);
    }

    public void updatequantity(String itemid, int quantity) {
        if (items.containsKey(itemid)) {
            items.get(itemid).setquantity(quantity);
        }
    }

    public Item searchitembyid(String itemid) {
        return items.get(itemid);
    }

    public Item searchitembyname(String itemname) {
        for (Item item : items.values()) {
            if (item.getitemname().equalsIgnoreCase(itemname)) {
                return item;
            }
        }
        return null;
    }

    public void displayallitems() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}