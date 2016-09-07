/**
 * Created by Graeme on 6/09/2016.
 */
public class Candle {
    private String colour;
    private int height;
    protected double price;

    public String getColour(){
        return colour;
    }

    public int getHeight(){
        return height;
    }

    public double getPrice(){
        return price;
    }

    public void setColour(String colour){
        this.colour= colour;
    }

    public void setHeight(int height){
        this.height = height;
        price = height * 2;
    }
}
