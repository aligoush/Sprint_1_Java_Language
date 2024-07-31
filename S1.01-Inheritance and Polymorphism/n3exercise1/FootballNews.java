package n3exercise1;

public class FootballNews extends News{
    private String competition;
    private String club;
    private String player;
    private final float price = 300;
    private final int score = 5;
    private final String barcelona = "barça";
    private final String madrid = "madrid";
    private final String championsLeague = "champions league";
    private final String ferran = "ferran torres";
    private final String benzema = "benzema";
    private final String league = "league";

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
        if(this.competition.toLowerCase().contains(championsLeague)){
            priceResult += 100;
        }
        if(isBarcelonaOrMadrid(this.club)){
            priceResult += 100;
        }
        if(isBenzemaOrFerranTorres(this.player)) {
            priceResult += 50;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;

        if (this.competition.toLowerCase().contains(championsLeague)) {
            scoreResult += 3;
        } else if(this.competition.toLowerCase().contains(league)){
            scoreResult += 2;
        }
        if(isBarcelonaOrMadrid(this.club)){
            scoreResult += 1;
        }
        if(isBenzemaOrFerranTorres(this.player)) {
            scoreResult += 1;
        }
        System.out.println("The score is " + scoreResult);
    }
    private boolean isBarcelonaOrMadrid(String club){
        return (this.club.toLowerCase().contains(barcelona)) || (this.club.toLowerCase().contains(madrid));
    }

    private boolean isBenzemaOrFerranTorres(String player){
        return ((this.player.toLowerCase().contains(ferran)) || (this.player.toLowerCase().contains(benzema)));
    }
    @Override
    public String toString() {
        return "Headline: " + this.getHeadline() + "\nText: " + this.getText() + "\nPrice: " + price + "\nEditor: " + this.getEditor();
    }

}
