
package javainterface;

public abstract class Ball implements Tossable{
    private String brand_name;
    public Ball(String brand_name){
        this.brand_name=brand_name;
    }
    @Override
    public void toss() {
    }
    public String getBrandname() {
        return brand_name;
    }
    public void bouncel(){}
    
}
