import javax.swing.*;

public class YoneticiEkrani extends JFrame {
    public YoneticiEkrani() {
        setTitle("Yönetici Ekranı");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); // Butonların manuel yerleşimini sağlamak için

        // Butonlar
        JButton calisanEkleButton = new JButton("Çalışan Ekle");
        JButton calisanSilButton = new JButton("Çalışan Sil");
        JButton odaEkleButton = new JButton("Oda Ekle");
        JButton odaSilButton = new JButton("Oda Sil");
        JButton rezervasyonGorButton = new JButton("Rezervasyonları Gör");

        // Butonların konumları
        calisanEkleButton.setBounds(100, 30, 200, 40);
        calisanSilButton.setBounds(100, 80, 200, 40);
        odaEkleButton.setBounds(100, 130, 200, 40);
        odaSilButton.setBounds(100, 180, 200, 40);
        rezervasyonGorButton.setBounds(100, 230, 200, 40);

        // Butonları eklemek
        add(calisanEkleButton);
        add(calisanSilButton);
        add(odaEkleButton);
        add(odaSilButton);
        add(rezervasyonGorButton);

        // Çalışan Ekleme butonuna tıklandığında çalışan ekleme ekranını aç
        calisanEkleButton.addActionListener(e -> new CalisanEkleEkrani());

        // Çalışan Silme butonuna tıklandığında çalışan silme ekranını aç
        calisanSilButton.addActionListener(e -> new CalisanSilEkrani());

        // Oda Ekleme butonuna tıklandığında oda ekleme ekranını aç
        odaEkleButton.addActionListener(e -> new OdaEkleEkrani());

        // Oda Silme butonuna tıklandığında oda silme ekranını aç
        odaSilButton.addActionListener(e -> new OdaSilEkrani());

        // Rezervasyonları Görme butonuna tıklandığında rezervasyon listeleme ekranını aç
        rezervasyonGorButton.addActionListener(e -> new RezervasyonListeEkrani());

        // Ekranı görünür hale getir
        setVisible(true);
    }
}