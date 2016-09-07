/**
 * Created by Graeme on 7/09/2016.
 */
public class Poem {
    private String poemName;
    private int lines;
    public Poem(String poemName, int lines){
        this.poemName = poemName;
        this.lines = lines;
    }

    public String getPoemName(){
        return poemName;
    }

    public int getLines(){
        return lines;
    }
}
