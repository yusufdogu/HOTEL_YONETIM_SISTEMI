import javax.swing.*;
import java.util.ArrayList;

public class AnaMenuGUI extends JFrame {
    public AnaMenuGUI() {
        setTitle("Otel Yönetim Sistemi - Ana Menü");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Veri yöneticileri
        ArrayList<Calisan> calisanlar = new ArrayList<>();
        OtelOdaYonetici odaYonetici = new OtelOdaYonetici();
        OtelMisafirYonetici misafirYonetici = new OtelMisafirYonetici();

        // Yönetici butonu
        JButton yoneticiButton = new JButton("Yönetici Girişi");

        yoneticiButton.setBounds(100, 50, 200, 40);
        add(yoneticiButton);

        // Yönetici ekranına geçiş
        yoneticiButton.addActionListener(e -> {
            new YoneticiEkrani(this, calisanlar, odaYonetici, misafirYonetici);
            setVisible(false);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AnaMenuGUI();
    }
}
