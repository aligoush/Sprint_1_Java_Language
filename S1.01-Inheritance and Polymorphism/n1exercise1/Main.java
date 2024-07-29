package n1exercise1;

public class Main {
    public static void main(java.lang.String[] args) {

        Instrument flute = new WindInstrument("Flute", 300);
        Instrument violin = new StringInstrument("Violin", 700);
        Instrument drum = new PercussionInstrument("Drum", 101.50);
        System.out.println(flute.name + " : " + flute.price + "eu");
        flute.play();
        System.out.println(violin.name + " : " + violin.price + "eu");
        violin.play();
        System.out.println(drum.name + " : " + drum.price + "eu");
        drum.play();
        Instrument.callStaticMethod();

    }
}
