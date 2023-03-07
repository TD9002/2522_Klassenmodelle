public class Drink {
    public String getränkename;
    public double preis;
    public String zutaten;

    public Drink(String getränkename, double preis, String zutaten) {
        this.getränkename = getränkename;
        this.preis = preis;
        this.zutaten = zutaten;
    }

    public void zutatHinzufügen(String zutat) {
        System.out.println("Zutat " + zutat + " wurde hinzugefügt");
        zutaten = zutaten + ", " + zutat;
    }

    public void preisBenennen() {
        System.out.println("Der Preis von " + getränkename + " ist " + preis);
    }

    public void zutatenAuflisten() {
        System.out.println("Die Zutaten von " + getränkename + " sind: " + zutaten);
    }
}
