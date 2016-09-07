/**
 * Created by Graeme on 6/09/2016.
 */
public class ItemSold {
    private int invoice;
    private String description;
    private double price;

    public int getInvoice(){
        return invoice;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public void setInvoice(int invoice){
        this.invoice = invoice;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
