public class Accessories extends SmartPhone{


    public Accessories(String model, int god, Color color, int price) {
        super(model, god, color, price);
    }
 public String toString(){
       return "accessories"+ super.toString();
}
}
