/**
 * Created by Graeme on 6/09/2016.
 */
public class ScentedCandle extends Candle {
    private String scent;

    public String getScent(){
        return scent;
    }

    public void setScent(String scent){
        this.scent = scent;
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        price = height * 3;
    }
}
