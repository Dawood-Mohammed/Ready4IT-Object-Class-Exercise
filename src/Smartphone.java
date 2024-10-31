public class Smartphone implements Cloneable{
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }

    @Override
    public int hashCode() {
        return brandName.hashCode()+modelName.hashCode()+batterymAh+producerPrice.hashCode()+retailPrice.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String
    toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBatterymAh() {
        return batterymAh;
    }

    public void setBatterymAh(int batterymAh) {
        this.batterymAh = batterymAh;
    }

    public SmartphonePrice getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(SmartphonePrice producerPrice) {
        this.producerPrice = producerPrice;
    }

    public SmartphonePrice getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(SmartphonePrice retailPrice) {
        this.retailPrice = retailPrice;
    }
}
