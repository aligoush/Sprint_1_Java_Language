package n3exercise1;

public class F1News extends News {
    private String team;
    private static float price = 100;
    private int score = 4;

    public F1News(String headline, String text, String team, Editor editor) {
        super(headline, text, editor);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public void getPriceNews() {
        float priceResult = this.price;
        if ((this.team.toLowerCase().contains("mercedes")) || (this.team.toLowerCase().contains("ferrari"))) {
            priceResult = priceResult + 50;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;

        if ((this.team.toLowerCase().contains("mercedes")) || (this.team.toLowerCase().contains("ferrari"))) {
            scoreResult = scoreResult + 2;
        }
        System.out.println("The score is " + scoreResult);
    }
}