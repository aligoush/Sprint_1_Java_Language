package n1exercise1;

public class Main {
    public static void main(java.lang.String[] args) {

        Instrument flute = new WindInstrument("Flute", 300);
        Instrument violin = new StringInstrument("Violin", 700);
        Instrument drum = new PercussionInstrument("Drum", 101.50);
        System.out.println(flute);
        flute.play();
        System.out.println(violin);
        violin.play();
        System.out.println(drum);
        drum.play();
        Instrument.callStaticMethod();
    }
}
