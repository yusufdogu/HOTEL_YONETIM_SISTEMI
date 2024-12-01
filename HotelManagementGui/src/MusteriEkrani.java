import javax.swing.*;

public class MusteriEkrani extends JFrame {
    public MusteriEkrani() {
        setTitle("Müşteri Ekranı");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); // Butonların manuel yerleşimi

        // Butonlar
        JButton rezervasyonYapButton = new JButton("Rezervasyon Yap");
        JButton rezervasyonGorButton = new JButton("Rezervasyonu Gör");

        // Butonların konumları
        rezervasyonYapButton.setBounds(100, 30, 200, 40);
        rezervasyonGorButton.setBounds(100, 120, 200, 40);

        // Butonları eklemek
        add(rezervasyonYapButton);
        add(rezervasyonGorButton);

        // Rezervasyon Yap butonuna tıklandığında rezervasyon yapma ekranını aç
        rezervasyonYapButton.addActionListener(e -> new RezervasyonYapEkrani());

        // Rezervasyon Gör butonuna tıklandığında rezervasyonu görüntüleme ekranını aç
        rezervasyonGorButton.addActionListener(e -> new RezervasyonGorEkrani());

        setVisible(true); // Ekranı görünür hale getir
    }

    public static void main(String[] args) {
        new MusteriEkrani(); // Müşteri ekranını başlat
    }
}
