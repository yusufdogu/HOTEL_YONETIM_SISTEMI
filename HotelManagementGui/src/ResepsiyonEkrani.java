import javax.swing.*;

public class ResepsiyonEkrani extends JFrame {
    public ResepsiyonEkrani() {
        setTitle("Resepsiyon Ekranı");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); // Butonların manuel konumlandırılması

        // Butonlar
        JButton odaAraButton = new JButton("Oda Ara");
        JButton odaListeleButton = new JButton("Odaları Listele");
        JButton rezervasyonYapButton = new JButton("Rezervasyon Yap");
        JButton rezervasyonSilButton = new JButton("Rezervasyon Sil");

        // Butonların konumları
        odaAraButton.setBounds(100, 30, 200, 40);
        odaListeleButton.setBounds(100, 80, 200, 40);
        rezervasyonYapButton.setBounds(100, 130, 200, 40);
        rezervasyonSilButton.setBounds(100, 180, 200, 40);

        // Butonları eklemek
        add(odaAraButton);
        add(odaListeleButton);
        add(rezervasyonYapButton);
        add(rezervasyonSilButton);

        // Oda Ara butonuna tıklandığında oda arama ekranını aç
        odaAraButton.addActionListener(e -> new OdaAraEkrani());

        // Odaları Listele butonuna tıklandığında oda listeleme ekranını aç
        odaListeleButton.addActionListener(e -> new OdaListeleEkrani());

        // Rezervasyon Yap butonuna tıklandığında rezervasyon yapma ekranını aç
        rezervasyonYapButton.addActionListener(e -> new RezervasyonYapEkrani());

        // Rezervasyon Sil butonuna tıklandığında rezervasyon silme ekranını aç
        rezervasyonSilButton.addActionListener(e -> new RezervasyonSilEkrani());

        setVisible(true); // Ekranı görünür hale getir
    }

    public static void main(String[] args) {
        new ResepsiyonEkrani(); // Resepsiyon ekranını başlat
    }
}
