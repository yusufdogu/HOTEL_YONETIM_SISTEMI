import java.time.LocalDate;

public class Misafir {
    private String adSoyad;
    private String tcKimlikNo;
    private String telefon;
    private int odaNumarasi;
    private LocalDate tarih;
    private String rezervasyonNo; // Rezervasyon numarası

    public Misafir(String adSoyad, String tcKimlikNo, String telefon, int odaNumarasi, LocalDate tarih) {
        this.adSoyad = adSoyad;
        this.tcKimlikNo = tcKimlikNo;
        this.telefon = telefon;
        this.odaNumarasi = odaNumarasi;
        this.tarih = tarih;
        this.rezervasyonNo = java.util.UUID.randomUUID().toString(); // Benzersiz rezervasyon numarası
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public int getOdaNumarasi() {
        return odaNumarasi;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public String getRezervasyonNo() {
        return rezervasyonNo;
    }

    @Override
    public String toString() {
        return "Ad Soyad: " + adSoyad + ", TC: " + tcKimlikNo + ", Telefon: " + telefon +
                ", Oda: " + odaNumarasi + ", Tarih: " + tarih + ", Rezervasyon No: " + rezervasyonNo;
    }
}
