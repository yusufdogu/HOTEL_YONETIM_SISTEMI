import javax.swing.*;
import java.util.ArrayList;

public class YoneticiEkrani extends JFrame {
    public YoneticiEkrani(JFrame previousFrame, ArrayList<Calisan> calisanlar, OtelOdaYonetici odaYonetici, OtelMisafirYonetici misafirYonetici) {
        setTitle("Yönetici Ekranı");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Butonlar
        JButton calisanEkleButton = new JButton("Çalışan Ekle");
        JButton calisanSilButton = new JButton("Çalışan Sil");
        JButton odaEkleButton = new JButton("Oda Ekle");
        JButton odaSilButton = new JButton("Oda Sil");
        JButton odaListeleButton = new JButton("Odaları Listele");
        JButton calisanListeleButton = new JButton("Çalışanları Listele");
        JButton rezervasyonYapButton = new JButton("Rezervasyon Yap");
        JButton rezervasyonSilButton = new JButton("Rezervasyon Sil");
        JButton rezervasyonListeleButton = new JButton("Rezervasyonları Listele");
        JButton geriButton = new JButton("GERİ");

        // Buton konumları
        calisanEkleButton.setBounds(50, 30, 200, 40);
        calisanSilButton.setBounds(50, 80, 200, 40);
        calisanListeleButton.setBounds(50, 130, 200, 40);
        odaEkleButton.setBounds(50, 180, 200, 40);
        odaSilButton.setBounds(50, 230, 200, 40);
        odaListeleButton.setBounds(50, 280, 200, 40);
        rezervasyonYapButton.setBounds(50, 330, 200, 40);
        rezervasyonSilButton.setBounds(50, 380, 200, 40);
        rezervasyonListeleButton.setBounds(50, 430, 200, 40);
        geriButton.setBounds(50, 480, 200, 40);

        // Butonları ekle
        add(calisanEkleButton);
        add(calisanSilButton);
        add(calisanListeleButton);
        add(odaEkleButton);
        add(odaSilButton);
        add(odaListeleButton);
        add(rezervasyonYapButton);
        add(rezervasyonSilButton);
        add(rezervasyonListeleButton);
        add(geriButton);

        // Çalışan ekle
        calisanEkleButton.addActionListener(e -> {
            new CalisanEkleEkrani(this, calisanlar);
            setVisible(false);
        });

        // Çalışan sil
        calisanSilButton.addActionListener(e -> {
            new CalisanSilEkrani(this, calisanlar);
            setVisible(false);
        });

        // Çalışanları listele
        calisanListeleButton.addActionListener(e -> {
            new CalisanListeleEkrani(this, calisanlar);
            setVisible(false);
        });

        // Oda ekle
        odaEkleButton.addActionListener(e -> {
            new OdaEkleEkrani(this, odaYonetici);
            setVisible(false);
        });

        // Oda sil
        odaSilButton.addActionListener(e -> {
            new OdaSilEkrani(this, odaYonetici);
            setVisible(false);
        });

        // Odaları listele
        odaListeleButton.addActionListener(e -> {
            new OdaListeleEkrani(this, odaYonetici.getOdalar());
            setVisible(false);
        });

        // Rezervasyon yap
        rezervasyonYapButton.addActionListener(e -> {
            new RezervasyonYapEkrani(this, odaYonetici, misafirYonetici);
            setVisible(false);
        });

        // Rezervasyon sil
        rezervasyonSilButton.addActionListener(e -> {
            new RezervasyonSilEkrani(this, misafirYonetici);
            setVisible(false);
        });

        // Rezervasyonları listele
        rezervasyonListeleButton.addActionListener(e -> {
            new RezervasyonListeleEkrani(this, misafirYonetici);
            setVisible(false);
        });

        // GERİ butonu
        geriButton.addActionListener(e -> {
            previousFrame.setVisible(true);
            dispose();
        });

        setVisible(true);
    }
}
