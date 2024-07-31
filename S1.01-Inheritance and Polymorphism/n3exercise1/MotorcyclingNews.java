package n3exercise1;

public class MotorcyclingNews extends News{
    private String team;
    private final float price = 100;
    private final int score = 3;
    private final String honda = "honda";
    private final String yamaha = "yamaha";

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
        if (isHondaOrYamaha(this.team)) {
            priceResult += 50;
        }
        System.out.println("The price of this news is " + priceResult);
    }
    @Override
    public void getScoreNews() {
        int scoreResult = this.score;
        if (isHondaOrYamaha(this.team)) {
            scoreResult += 3;
        }
        System.out.println("The score is " + scoreResult);
    }
    private boolean isHondaOrYamaha(String team) {
        return (this.team.toLowerCase().contains(honda)) || (this.team.toLowerCase().contains(yamaha));
    }
}
