import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RezervasyonYapEkrani extends JFrame {
    public RezervasyonYapEkrani(JFrame previousFrame, OtelOdaYonetici odaYonetici, OtelMisafirYonetici misafirYonetici) {
        setTitle("Rezervasyon Yap");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel isimLabel = new JLabel("İsim Soyisim:");
        JTextField isimField = new JTextField();
        JLabel tcLabel = new JLabel("TC Kimlik No:");
        JTextField tcField = new JTextField();
        JLabel telefonLabel = new JLabel("Telefon:");
        JTextField telefonField = new JTextField();
        JLabel tarihLabel = new JLabel("Tarih (YYYY-MM-DD):");
        JTextField tarihField = new JTextField(LocalDate.now().toString()); // Varsayılan bugünkü tarih
        JLabel odaLabel = new JLabel("Oda Numarası:");
        JTextField odaField = new JTextField();

        JButton yapButton = new JButton("Rezervasyon Yap");
        JButton geriButton = new JButton("GERİ");

        // Konumlandırma
        isimLabel.setBounds(20, 20, 150, 30);
        isimField.setBounds(200, 20, 250, 30);
        tcLabel.setBounds(20, 70, 150, 30);
        tcField.setBounds(200, 70, 250, 30);
        telefonLabel.setBounds(20, 120, 150, 30);
        telefonField.setBounds(200, 120, 250, 30);
        tarihLabel.setBounds(20, 170, 150, 30);
        tarihField.setBounds(200, 170, 250, 30);
        odaLabel.setBounds(20, 220, 150, 30);
        odaField.setBounds(200, 220, 250, 30);
        yapButton.setBounds(50, 300, 150, 40);
        geriButton.setBounds(250, 300, 150, 40);

        // Ekleme
        add(isimLabel);
        add(isimField);
        add(tcLabel);
        add(tcField);
        add(telefonLabel);
        add(telefonField);
        add(tarihLabel);
        add(tarihField);
        add(odaLabel);
        add(odaField);
        add(yapButton);
        add(geriButton);

        // Rezervasyon yap
        yapButton.addActionListener(e -> {
            try {
                String isim = isimField.getText().trim();
                String tc = tcField.getText().trim();
                String telefon = telefonField.getText().trim();
                String tarihStr = tarihField.getText().trim();
                String odaNumarasiStr = odaField.getText().trim();

                // Girdi doğrulama
                if (isim.isEmpty() || tc.isEmpty() || telefon.isEmpty() || tarihStr.isEmpty() || odaNumarasiStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Tüm alanları doldurun!", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int odaNumarasi = Integer.parseInt(odaNumarasiStr);

                if (!odaYonetici.odaMevcutMu(odaNumarasi)) {
                    JOptionPane.showMessageDialog(this, "Bu oda mevcut değil!", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Tarih doğrulama
                LocalDate tarih = LocalDate.parse(tarihStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                // Misafir oluşturma ve ekleme
                Misafir yeniMisafir = new Misafir(isim, tc, telefon, odaNumarasi, tarih);
                misafirYonetici.misafirEkle(yeniMisafir);

                JOptionPane.showMessageDialog(this, "Rezervasyon başarıyla yapıldı!");
                isimField.setText("");
                tcField.setText("");
                telefonField.setText("");
                tarihField.setText(LocalDate.now().toString());
                odaField.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Geçerli bir oda numarası girin!", "Hata", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Hata: " + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
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
