package n3exercise1;

public class BasketballNews extends News{
    private String competition;
    private String club;
    private final float price = 250;
    private final int score = 4;
    private final String euroliga = "euroliga";
    private final String barcelona = "barça";
    private final String madrid = "madrid";
    private final String acb = "acb";


    public BasketballNews(String headline, String text,String competition, String club, Editor editor) {
        super(headline, text, editor);
        this.competition = competition;
        this.club = club;
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    @Override
    public void getPriceNews() {
        float priceResult = this.price;
        if(this.competition.toLowerCase().contains(euroliga)){
            priceResult = priceResult + 75;
        }
        if(isBarcelonaOrMadrid(this.club)){
            priceResult = priceResult + 75;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;

        if (this.competition.toLowerCase().contains(euroliga)){
            scoreResult = scoreResult + 3;
        } else if(this.competition.toLowerCase().contains(acb)){
            scoreResult = scoreResult + 2;
        }
        if(isBarcelonaOrMadrid(this.club)){
            scoreResult = scoreResult + 1;
        }
        System.out.println("The score is " + scoreResult);
    }
    private boolean isBarcelonaOrMadrid(String club){
        return (this.club.toLowerCase().contains(barcelona)) || (this.club.toLowerCase().contains(madrid));
    }


}
