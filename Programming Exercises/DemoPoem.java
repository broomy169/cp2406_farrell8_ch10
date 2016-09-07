/**
 * Created by Graeme on 7/09/2016.
 */
public class DemoPoem {

    public static void main(String[] args) {
        Poem poem = new Poem("Poem", 30);
        Couplet couplet = new Couplet("Couplet");
        Haiku haiku = new Haiku("Haiku");
        Limerick limerick = new Limerick("Limerick");
        display(poem);
        display(couplet);
        display(haiku);
        display(limerick);
    }

    public static void display(Poem poem){
        System.out.println("Poem: " + poem.getPoemName());
        System.out.println("Lines: " + poem.getLines());

    }
}
