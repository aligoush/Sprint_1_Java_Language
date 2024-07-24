package n3exercise1;

public class News {
    private String headline;
    private String text = "";
    private Editor editor;

    public News (String headline, String text, Editor editor){
        this.headline = headline;
        this.text = text;
        this.editor = editor;
    }

    public void getPriceNews(){
        System.out.println("The price of the news");
    }
    public void getScoreNews(){
        System.out.println("Score is...");
    }

    public String getHeadline() {
        return headline;
    }

    public String getText() {
        return text;
    }

    public Editor getEditor() {
        return editor;
    }

    @Override
    public String toString() {
        return "Headline: " + headline + "\nText: " + text;
    }
}
