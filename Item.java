public class Item {
    private String itemid;
    private String itemname;
    private int quantity;
    private double price;

    public Item(String itemid, String itemName, int quantity, double price) {
        this.itemid = itemid;
        this.itemname = itemname;
        this.quantity = quantity;
        this.price = price;
    }

    public String getitemid() {
        return itemid;
    }

    public void setitemid(String itemid) {
        this.itemid = itemid;
    }

    public String getitemname() {
        return itemname;
    }

    public void setitemname(String itemname) {
        this.itemname = itemname;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemid + '\'' +
                ", itemName='" + itemname + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}