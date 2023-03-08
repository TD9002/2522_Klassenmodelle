public class Main {
    public static void main(String[] args) {
        // Gestein
        Gestein granit = new Gestein("Granit", 2.7, "Quarz", "Feldspat");
        Gestein serpentinit = new Gestein("Serpentinit", 3.0,
                "Serpentin", "Olivin");


        granit.werfen();
        serpentinit.zerbröseln();
        System.out.println(granit.getDichte());

        // Schrank
        Schrank kleiderschrank = new Schrank("Kleiderschrank", 2, 2);
        Schrank kommode = new Schrank("Kommode", 0, 5);

        kleiderschrank.türAuf();
        kommode.türAuf();
        kommode.schubladenAuf();

        // Drink
        Drink drink1 = new Drink("Bloody Mary", 10.5, "0.1l Tomatensaft, 0.05 Vodka");
        Drink drink2 = new Drink("Cubra Libre", 9.5, "0.15l Cola, 0.05 Rum");

        drink1.zutatHinzufügen("1 Stange Sellerie");
        drink1.zutatenAuflisten();
        drink2.preisBenennen();

        // Gericht
        Gericht erstesGericht = new Gericht("Schnitzel", "Mehl, Putenfleisch", 5.0);
        Gericht zweiteGericht = new Gericht("Spaghetti", "Nudeln, Tomatensoße", 5.5);

        erstesGericht.zutatHinzufügen("Pommes");
        zweiteGericht.zutatHinzufügen("Parmesan");
        erstesGericht.kochen();
        zweiteGericht.kochen();

        // Kind
        Kind tina = new Kind("Tina", "weiblich", 3);
        Kind paul = new Kind("Paul", "männlich", 2);

        tina.spielen();
        paul.schläft();

        // Hund
        Hund hund1 = new Hund("Deutscher Schäferhund", 2, "braun");
        Hund hund2 = new Hund("Australian Shepard", 0.5, "braun-weiß");
        hund1.adoptieren();
        hund2.trickBeibringen("Tot stellen");
    }
}
