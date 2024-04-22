public class Døren implements Billet{
    int pris;
    private int billetID;


    public Døren(int billetID) {
        this.pris = 150;
        this.billetID = billetID;
    }

    @Override
    public int getPris() {
            return pris;
    }

    @Override
    public int getBilletId() {
        return billetID;
    }


}
