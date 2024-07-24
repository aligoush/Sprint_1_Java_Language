package n3exercise1;

public class FootballNews extends News{
    private String competition;
    private String club;
    private String player;
    private float price = 300;
    private int score = 5;
    public FootballNews (String headline,String text, String competition, String club, String player, Editor editor) {
        super(headline,text,editor);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    public String getPlayer() {
        return player;
    }

    @Override
    public void getPriceNews() {
        float priceResult = this.price;
        if(this.competition.toLowerCase().contains("lliga de campions")){
            priceResult = priceResult + 100;
        }
        if((this.club.toLowerCase().contains("barça")) || (this.club.toLowerCase().contains("madrid"))){
            priceResult = priceResult + 100;
        }
        if((this.player.toLowerCase().contains("ferran torres")) || (this.player.toLowerCase().contains("benzema"))) {
            priceResult = priceResult + 50;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;

        if (this.competition.toLowerCase().contains("lliga de campions")){
            scoreResult = scoreResult + 3;
        } else if(this.competition.toLowerCase().contains("lliga")){
            scoreResult = scoreResult + 2;
        }
        if((this.club.toLowerCase().contains("barça")) || (this.club.toLowerCase().contains("madrid"))){
            scoreResult = scoreResult + 1;
        }
        if((this.player.toLowerCase().contains("ferran torres")) || (this.player.toLowerCase().contains("benzema"))) {
            scoreResult = scoreResult + 1;
        }
        System.out.println("The score is " + scoreResult);
    }
    @Override
    public String toString() {
        return "Headline: " + this.getHeadline() + "\nText: " + this.getText() + "\nPrice: " + price + "\nEditor: " + this.getEditor();
    }

}
