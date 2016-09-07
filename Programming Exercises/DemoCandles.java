/**
 * Created by Graeme on 6/09/2016.
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        candle.setColour("Blue");
        candle.setHeight(5);
        scentedCandle.setColour("Purple");
        scentedCandle.setHeight(5);
        scentedCandle.setScent("Lavender");
        System.out.println("Candle is " + candle.getColour() +
                " and " + candle.getHeight() + " cms");
        System.out.println("Candle is " + scentedCandle.getColour() +
                ", " + scentedCandle.getHeight() + " cms, and is " +
                scentedCandle.getScent() + " scented");
    }
}
