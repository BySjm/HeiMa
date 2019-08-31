package T4;

public class HWPhone {
    private String type;
    private double price;
    String color;
    static String brand = "华为";

    public HWPhone(String type, double price, String color) {
        this.type = type;
        this.price = price;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        HWPhone.brand = brand;
    }

    public void call(){
        System.out.println("打电话~");
    }

    public static void main(String[] args) {
        HWPhone phone = new HWPhone("p30", 3999.0, "奶奶灰");
        System.out.println(phone.brand + "," + phone.getType() + "," + phone.getPrice() + "," + phone.getColor());
        phone.call();
    }

}
