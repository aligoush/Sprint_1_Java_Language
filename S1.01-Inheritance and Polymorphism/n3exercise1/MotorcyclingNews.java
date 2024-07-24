package n3exercise1;

public class MotorcyclingNews extends News{
    private String team;
    private float price = 100;
    private int score = 3;

    public MotorcyclingNews(String headline, String text, String team, Editor editor) {
        super(headline, text, editor);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public void getPriceNews() {
        float priceResult = this.price;
        if ((this.team.toLowerCase().contains("honda")) || (this.team.toLowerCase().contains("yamaha"))) {
            priceResult = priceResult + 50;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;

        if ((this.team.toLowerCase().contains("honda")) || (this.team.toLowerCase().contains("yamaha"))) {
            scoreResult = scoreResult + 3;
        }
        System.out.println("The score is " + scoreResult);
    }
}
