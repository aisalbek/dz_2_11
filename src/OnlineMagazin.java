public abstract class OnlineMagazin {
    private String model;
    private int god;

    public OnlineMagazin(String model, int god) {
        this.model = model;
        this.god = god;
    }

    public String getModel() {
        return model;
    }

    public int getGod() {
        return god;
    }

    public  String toString (){
        return "\nModel :"+model+
                "\nGod :"+god;
    }

    public void   ves(int vesy){
        System.out.println("ves :"+vesy);

    }

    public void   ves(){
         System.out.println("ves :"+100);
     };

}
