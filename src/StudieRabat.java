public class StudieRabat implements Billet{
    private int pris;
    private int dage;
    private int billetID;

    public StudieRabat(int dage, int billetId) {
        this.pris = 90;
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


}
