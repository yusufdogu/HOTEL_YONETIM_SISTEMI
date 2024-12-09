// Temel sınıf: Genel özellikler ve metotlar içerir
public abstract class Kisi {
    private String adSoyad; // Kişinin adı ve soyadı
    private int yas; // Kişinin yaşı

    // Yapıcı metod (Constructor)
    public Kisi(String adSoyad, int yas) {
        this.adSoyad = adSoyad;
        setYas(yas); // Yas doğrulaması yapılır
    }

    // Getter ve Setter metotlar
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            throw new IllegalArgumentException("Yaş negatif olamaz!");
        }
        this.yas = yas;
    }

    // Alt sınıflar tarafından uygulanacak soyut metot
    public abstract String getDetaylar();
}
