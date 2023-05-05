public class SmartPhone extends OnlineMagazin{
    private Color color;
    private int price;
    private Insurance insurance;

    public SmartPhone(String model, int god, Color color, int price, Insurance insurance) {
        super(model, god);
        this.color = color;
        this.price = price;
        this.insurance = insurance;
    }

    public SmartPhone(String model, int god, Color color, int price) {
        super(model, god);
        this.color = color;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public void ves(int vesy) {
        System.out.println(vesy);
    }
    @Override
    public String toString() {
        return "-------SmartPhone------" +
                super.toString()+
                " \ncolor=" + color +
                "\n price=" + price +
                "\n insurance=" + insurance;
    }



}
