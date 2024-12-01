import javax.swing.*;

public class AnaMenuGUI extends JFrame {
    public AnaMenuGUI() {
        setTitle("Otel Yönetim Sistemi - Ana Menü");
        setSize(400, 300); // Pencere boyutu
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Çıkış işlemi
        setLayout(null); // Bileşenleri manuel konumlandırma

        // Yönetici, Resepsiyon ve Müşteri butonları
        JButton yoneticiButton = new JButton("Yönetici Girişi");
        JButton resepsiyonButton = new JButton("Resepsiyon Girişi");
        JButton musteriButton = new JButton("Müşteri Girişi");

        // Butonların pozisyonları
        yoneticiButton.setBounds(100, 50, 200, 40);
        resepsiyonButton.setBounds(100, 120, 200, 40);
        musteriButton.setBounds(100, 190, 200, 40);

        // Butonları pencereye ekleyin
        add(yoneticiButton);
        add(resepsiyonButton);
        add(musteriButton);

        // Yönetici girişine yönlendirme
        yoneticiButton.addActionListener(e -> {
            new YoneticiEkrani(); // Yönetici ekranını açar
            //dispose(); // Ana menüyü kapatır
        });

        // Resepsiyon girişine yönlendirme
        resepsiyonButton.addActionListener(e -> {
            new ResepsiyonEkrani(); // Resepsiyon ekranını açar
            dispose(); // Ana menüyü kapatır
        });

        // Müşteri girişine yönlendirme
        musteriButton.addActionListener(e -> {
            new MusteriEkrani(); // Müşteri ekranını açar
            dispose(); // Ana menüyü kapatır
        });

        setVisible(true); // Pencereyi görünür hale getirir
    }

    public static void main(String[] args) {
        new AnaMenuGUI(); // Ana menüyü çalıştırır
    }
}