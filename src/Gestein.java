public class Gestein {
    private String name;
    private double dichte;
    private String hauptmineral;
    private String nebenmineral;

    public Gestein(String name, double dichte, String hauptmineral, String nebenmineral) {
        this.name = name;
        this.dichte = dichte;
        this.hauptmineral = hauptmineral;
        this.nebenmineral = nebenmineral;
    }

    public String getName() {
        return hauptmineral;
    }
    //hallo
    public String getHauptmineral() {
        return hauptmineral;
    }
    public String getNebenmineral() {
        return nebenmineral;
    }
    public double getDichte() {
        return dichte;
    }

    /*public void setName(String name){
        this.name = name;
    }
    public void setDichte(double dichte){
        this.dichte = dichte;
    }
    public void setHauptmineral(String hauptmineral){
        this.hauptmineral = hauptmineral;
    }
    public void setNebenmineral(String nebenmineral){
        this.nebenmineral = nebenmineral;
    }*/



    public void werfen() {
        System.out.println(name + " fliegt");
    }

    public void zerbröseln() {
        System.out.println(name + " wird in " + hauptmineral +
                " und " + nebenmineral + " zerteilt");
    }

    public void untersuchen() {
        System.out.println(name + " besteht aus " + hauptmineral +
                " und " + nebenmineral);
    }
}
