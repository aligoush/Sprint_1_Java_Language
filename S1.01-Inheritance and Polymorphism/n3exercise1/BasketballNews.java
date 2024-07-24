package n3exercise1;

public class BasketballNews extends News{
    private String competition;
    private String club;
    private float price = 250;
    private int score = 4;

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
        if(this.competition.toLowerCase().contains("euroliga")){
            priceResult = priceResult + 75;
        }
        if((this.club.toLowerCase().contains("barça")) || (this.club.toLowerCase().contains("madrid"))){
            priceResult = priceResult + 75;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;

        if (this.competition.toLowerCase().contains("eurolliga")){
            scoreResult = scoreResult + 3;
        } else if(this.competition.toLowerCase().contains("acb")){
            scoreResult = scoreResult + 2;
        }
        if((this.club.toLowerCase().contains("barça")) || (this.club.toLowerCase().contains("madrid"))){
            scoreResult = scoreResult + 1;
        }
        System.out.println("The score is " + scoreResult);
    }


}
