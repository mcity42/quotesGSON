package quotes;
    import java.util.ArrayList;

public class Quote {
    public ArrayList<String> tags;
    public String author, likes, text;


    public String toString(){
        String result;
        result = text +"\n";
        result = result + "--"+ author;

        return result;

    }
}

