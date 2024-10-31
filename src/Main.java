public class Main {
    public static void main(String[] args) {
        SmartphonePrice price1 = new SmartphonePrice("Producer", 50.5);
        SmartphonePrice price2 = new SmartphonePrice("Producer", 100.5);
        SmartphonePrice price3 = new SmartphonePrice("Retail", 60.5);
        SmartphonePrice price4 = new SmartphonePrice("Retail", 110.5);
        Smartphone samsung = new Smartphone("Samsung", "S4", 4, price1, price3);
        Smartphone iphone = new Smartphone("IPhone", "15 Pro", 5, price2, price4);
        System.out.println(samsung);
        System.out.println(iphone);
        System.out.println("Is samsung equals to iphone: "+samsung.equals(iphone));
        try{
            Smartphone smartphone = (Smartphone) iphone.clone();
            System.out.println(smartphone);
            System.out.println("Is smartphone equals to iphone: "+samsung.equals(iphone));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}