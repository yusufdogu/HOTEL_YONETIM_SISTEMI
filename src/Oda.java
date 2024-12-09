public class Oda {
    private int odaNumarasi;
    private int kapasite;
    private double fiyat;

    public Oda(int odaNumarasi, int kapasite, double fiyat) {
        this.odaNumarasi = odaNumarasi;
        this.kapasite = kapasite;
        this.fiyat = fiyat;
    }

    public int getOdaNumarasi() {
        return odaNumarasi;
    }

    public int getKapasite() {
        return kapasite;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return "Oda Numarası: " + odaNumarasi + ", Kapasite: " + kapasite + ", Fiyat: " + fiyat + " TL";
    }
}
