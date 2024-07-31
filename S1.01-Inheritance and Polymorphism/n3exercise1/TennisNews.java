package n3exercise1;

public class TennisNews extends News{
    private String competition;
    private String tennisPlayer;
    private final float price = 150;
    private final int score = 4;
    private final String federer = "federer";
    private final String nadal = "nadal";
    private final String djokovic = "djokovic";

    public TennisNews(String headline, String text, String competition, String player, Editor editor) {
        super(headline, text, editor);
        this.competition = competition;
        this.tennisPlayer = player;
    }
    @Override
    public void getPriceNews() {
        float priceResult = this.price;
        if(isFedererOrNadalOrDjokovic(this.tennisPlayer)) {
            priceResult += 100;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;
        if(isFedererOrNadalOrDjokovic(this.tennisPlayer)) {
            scoreResult += 3;
        }
        System.out.println("The score is " + scoreResult);
    }

    public String getCompetition() {
        return this.competition;
    }

    public String getTennisPlayer() {
        return tennisPlayer;
    }
    private boolean isFedererOrNadalOrDjokovic(String player) {
        return (this.tennisPlayer.toLowerCase().contains(federer)) || (this.tennisPlayer.toLowerCase().contains(nadal) || (this.tennisPlayer.toLowerCase().contains(djokovic)));
    }
}
