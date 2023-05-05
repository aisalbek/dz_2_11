public class Main {
    public static void main(String[] args) {
        Insurance insurance = new Insurance();
        insurance.setDuration(12);
        SmartPhone smartPhone = new SmartPhone("samsung s6", 2018, Color.BLACK, 8000);

        SmartPhone smartPhone1 = new SmartPhone("iphone 15", 2023, Color.YELLOW, 100000, insurance);
        Accessories accessories = new Accessories("AirPodsMax",2022,Color.BLACK,16000);
        System.out.println(accessories);
        System.out.println(smartPhone);
        smartPhone.ves(200);
        System.out.println(smartPhone1);
        smartPhone1.ves();
    }
}