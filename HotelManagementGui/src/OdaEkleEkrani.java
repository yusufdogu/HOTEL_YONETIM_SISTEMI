import javax.swing.*;
import java.util.ArrayList;

public class OdaEkleEkrani extends JFrame {
    public OdaEkleEkrani(JFrame previousFrame, OtelOdaYonetici odaYonetici) {
        setTitle("Oda Ekle");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel odaNumarasiLabel = new JLabel("Oda Numarası:");
        JTextField odaNumarasiField = new JTextField();
        JLabel kapasiteLabel = new JLabel("Kapasite:");
        JTextField kapasiteField = new JTextField();
        JLabel fiyatLabel = new JLabel("Fiyat:");
        JTextField fiyatField = new JTextField();
        JButton ekleButton = new JButton("Ekle");
        JButton geriButton = new JButton("GERİ");

        odaNumarasiLabel.setBounds(20, 20, 120, 30);
        odaNumarasiField.setBounds(150, 20, 200, 30);
        kapasiteLabel.setBounds(20, 60, 120, 30);
        kapasiteField.setBounds(150, 60, 200, 30);
        fiyatLabel.setBounds(20, 100, 120, 30);
        fiyatField.setBounds(150, 100, 200, 30);
        ekleButton.setBounds(50, 160, 120, 30);
        geriButton.setBounds(200, 160, 120, 30);

        add(odaNumarasiLabel);
        add(odaNumarasiField);
        add(kapasiteLabel);
        add(kapasiteField);
        add(fiyatLabel);
        add(fiyatField);
        add(ekleButton);
        add(geriButton);

        // Oda ekleme işlemi
        ekleButton.addActionListener(e -> {
            try {
                String odaNumarasi = odaNumarasiField.getText().trim();
                String kapasite = kapasiteField.getText().trim();
                String fiyat = fiyatField.getText().trim();

                if (odaNumarasi.isEmpty() || kapasite.isEmpty() || fiyat.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Tüm alanları doldurun!", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (odaYonetici.odaMevcutMu(Integer.parseInt(odaNumarasi))) {
                    JOptionPane.showMessageDialog(this, "Bu oda zaten mevcut!", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Yeni oda oluşturma ve ekleme
                Oda yeniOda = new Oda(Integer.parseInt(odaNumarasi), Integer.parseInt(kapasite), Double.parseDouble(fiyat));
                odaYonetici.odaEkle(yeniOda);

                JOptionPane.showMessageDialog(this, "Oda başarıyla eklendi!");

                // Alanları temizleme
                odaNumarasiField.setText("");
                kapasiteField.setText("");
                fiyatField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Geçerli sayısal değerler girin!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        });

        // GERİ butonu
        geriButton.addActionListener(e -> {
            previousFrame.setVisible(true);
            dispose();
        });

        setVisible(true);
    }
}
