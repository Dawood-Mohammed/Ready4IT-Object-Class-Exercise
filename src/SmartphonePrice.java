public class SmartphonePrice {
    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public int hashCode() {
        return (int) (priceType.hashCode()+priceInEuros);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.setProducerPrice(null);
        clonedSmartphone.setRetailPrice(null);
        return clonedSmartphone;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public double getPriceInEuros() {
        return priceInEuros;
    }

    public void setPriceInEuros(double priceInEuros) {
        this.priceInEuros = priceInEuros;
    }
}
