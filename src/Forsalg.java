
public class Forsalg implements Billet{
    private int pris;
    private int dage;
    private int billetID;

    public Forsalg(int dage, int billetId){
        this.pris = 120;
        this.dage = dage;
        this.billetID = billetId;
    }

    @Override
    public int getPris() {
        if (dage < 10){
            return pris;
        } else {
            return pris / 100 * 15;
        }
    }

    @Override
    public int getBilletId() {
        return billetID;
    }

    @Override
    public String toString() {
        return "Forsalg{" +
                "pris=" + pris +
                ", dage=" + dage +
                ", billetID=" + billetID +
                '}';
    }

}
