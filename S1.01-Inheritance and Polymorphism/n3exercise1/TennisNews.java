package n3exercise1;

public class TennisNews extends News{
    private String competition;
    private String tennisPlayer;
    private float price = 150;
    private int score = 4;
    public TennisNews(String headline, String text, String competition, String player, Editor editor) {
        super(headline, text, editor);
        this.competition = competition;
        this.tennisPlayer = player;
    }
    @Override
    public void getPriceNews() {
        float priceResult = this.price;
        if((this.tennisPlayer.toLowerCase().contains("federer")) || (this.tennisPlayer.toLowerCase().contains("nadal") || (this.tennisPlayer.toLowerCase().contains("djokovic")))) {
            priceResult = priceResult + 100;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;

        if((this.tennisPlayer.toLowerCase().contains("federer")) || (this.tennisPlayer.toLowerCase().contains("nadal") || (this.tennisPlayer.toLowerCase().contains("djokovic")))) {
            scoreResult = scoreResult + 3;
        }
        System.out.println("The score is " + scoreResult);
    }

    public String getCompetition() {
        return this.competition;
    }

    public String getTennisPlayer() {
        return tennisPlayer;
    }
}
