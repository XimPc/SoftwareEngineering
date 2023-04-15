package co.edu.poli.facadeNo1.model;



public class Intermediate_Class  {

    private Blackberry blackberry;
    private Iphone iphone;
    private Samsung samsung;
    
    public Intermediate_Class() {
        createMobiles();
    }
    
    private void createMobiles() {
        blackberry = new Blackberry("Blackberry Z10", "Rs 35000.00");
        iphone = new Iphone("Iphone 6", "Rs 65000.00");
        samsung = new Samsung("Samsung 4", "Rs 45000.00");
    }
    
    public Blackberry getBlackberry() {
        return blackberry;
    }
    
    public Iphone getIphone() {
        return iphone;
    }
    
    public Samsung getSamsung() {
        return samsung;
    }
}