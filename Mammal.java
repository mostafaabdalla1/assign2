
package assignment;

public class Mammal implements Animal  {
    @Override
    public void eat() {
        System.out.println("mammal eats");
    }
    @Override
    public void traval() {
        System.out.println("mammal travels");
    }
    public int NoOflegs(){
        return 0;
    }
    public String FavFood(){
        return "leaves";
    }  

   
}
