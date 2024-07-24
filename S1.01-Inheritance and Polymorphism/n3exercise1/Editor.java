package n3exercise1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Editor {
    private String name;
    private final String DNI;
    private static float sou = 1500;
    private ArrayList<News> newsList;
    static Scanner scanner = new Scanner(System.in);

    public Editor(String name, String DNI){
        this.name = name;
        this.DNI = DNI;
        this.newsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public ArrayList<News> getNewsList() {
        return newsList;
    }

    public void addNews (News news){
        this.newsList.add(news);
    }
    public void createNews(int type){
        String headline = readInput("Insert the headline: ");
        String text = readInput("Insert the text: ");
        News news = null;
        if(type == 1){
            String competition = readInput("Insert the competition: ");
            String club = readInput("Insert the club: ");
            String player = readInput("Insert the player: ");
            news = new FootballNews(headline, text, competition, club, player, this);
        } else if(type == 2) {
            String competition = readInput("Insert the competition: ");
            String club = readInput("Insert the club: ");
            news = new BasketballNews(headline, text, competition, club, this);

        } else if(type == 3){
            String competition = readInput("Insert the competition: ");
            String player = readInput("Insert the player: ");
            news = new TennisNews(headline, text, competition, player, this);

        } else if(type == 4){
            String team = readInput("Insert the team: ");
            news = new F1News(headline, text, team, this);
        } else if(type == 5){
            String team = readInput("Insert the team: ");
            news = new MotorcyclingNews(headline, text, team, this);
        } else {
            System.out.println("There are no more types of news!");
        }
        if (news != null) {
            System.out.println("News with headline \"" + news.getHeadline() + "\" is created");
            this.addNews(news);
            System.out.println("the size is " + this.newsList.size());
            for (News i: this.newsList
                 ) {
                System.out.println("this is the headline: "+ i.getHeadline());
            }

        }
    }

    public News findNews (String headline) {
        ArrayList<News> newsArrayList = this.getNewsList();
        News newsFound = null;
        if(!(newsArrayList.isEmpty())){
            for (News news: newsArrayList) {
                if(news.getHeadline().equalsIgnoreCase(headline)){
                    newsFound = news;
                }
            }
        } else {
        System.out.println("There are no news for this editor!");
    }
        return newsFound;
    }
    public static String readInput(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public void removeNews (News news){
        this.newsList.remove(news);
    }

    @Override
    public String toString() {
        return "Editor [name=" + name
                + ", DNI=" + DNI
                + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if(o == null) return false;
        if (!(o instanceof Editor)) return false;
        Editor other = (Editor)o;
        return  (this.name.equals(other.name) && this.DNI.equals(other.DNI));
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, DNI);
    }
    public News searchForNews(String headline){
        News result = null;
        ArrayList<News> newsArrayList = this.getNewsList();
            for (News news: newsArrayList) {
                if(news.getHeadline().equalsIgnoreCase(headline)){
                    result = news;
                    if(news instanceof FootballNews){
                        result = (FootballNews) news;
                    } else if (news instanceof BasketballNews) {
                        result = (BasketballNews) news;
                    } else if (news instanceof TennisNews ) {
                        result = (TennisNews) news;
                    }else if(news instanceof F1News){
                        result = (F1News) news;
                    }else if(news instanceof MotorcyclingNews){
                        result = (MotorcyclingNews) news;
                    }
                }
            }
            return result;
    }

    public void printAllNews(){
        for (News news:newsList) {
            System.out.println("Headline: "+ news.getHeadline());
            System.out.println("Text: " + news.getText());
            if(news instanceof FootballNews){
                FootballNews footballNews = (FootballNews) news;
                System.out.println("Competition: " + footballNews.getCompetition());
                System.out.println("Club: " + footballNews.getClub());
                System.out.println("Player: " + footballNews.getPlayer());
            } else if (news instanceof BasketballNews) {
                BasketballNews basketballNews = (BasketballNews) news;
                System.out.println("Competition: " + basketballNews.getCompetition());
                System.out.println("Club: " + basketballNews.getClub());
            } else if (news instanceof TennisNews ) {
                TennisNews tennisNews = (TennisNews) news;
                System.out.println("Competition: " + tennisNews.getCompetition());
                System.out.println("Tennis player: " + tennisNews.getTennisPlayer());
            } else if(news instanceof F1News){
                F1News f1News = (F1News) news;
                System.out.println("Team: " + f1News.getTeam());
            } else if(news instanceof MotorcyclingNews){
                MotorcyclingNews motorcyclingNews = (MotorcyclingNews) news;
                System.out.println("Team: " + motorcyclingNews.getTeam());
            }

        }
    }
}
