package n3exercise1;

public class F1News extends News {
    private String team;
    private final static float price = 100;
    private final int score = 4;
    private final String mercedes = "mercedes";
    private final String ferrari = "ferrari";

    public F1News(String headline, String text, String team, Editor editor) {
        super(headline, text, editor);
        this.team = team;
    }

    protected String getTeam() {
        return team;
    }

    @Override
    public void getPriceNews() {
        float priceResult = this.price;
        if (isMercedesOrFerrari(this.team)) {
            priceResult += 50;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;
        if (isMercedesOrFerrari(this.team)) {
            scoreResult += 2;
        }
        System.out.println("The score is " + scoreResult);
    }
    private boolean isMercedesOrFerrari(String team){
        return (this.team.toLowerCase().contains(mercedes)) || (this.team.toLowerCase().contains(ferrari));
    }
}