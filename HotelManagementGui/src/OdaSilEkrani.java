import javax.swing.*;

public class OdaSilEkrani extends JFrame {
    public OdaSilEkrani(JFrame previousFrame, OtelOdaYonetici odaYonetici) {
        setTitle("Oda Sil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel odaNumarasiLabel = new JLabel("Oda Numarası:");
        JTextField odaNumarasiField = new JTextField();
        JButton silButton = new JButton("Sil");
        JButton geriButton = new JButton("GERİ");

        odaNumarasiLabel.setBounds(20, 20, 120, 30);
        odaNumarasiField.setBounds(150, 20, 100, 30);
        silButton.setBounds(50, 80, 80, 30);
        geriButton.setBounds(150, 80, 80, 30);

        add(odaNumarasiLabel);
        add(odaNumarasiField);
        add(silButton);
        add(geriButton);

        // Silme işlemi
        silButton.addActionListener(e -> {
            try {
                int odaNumarasi = Integer.parseInt(odaNumarasiField.getText().trim());
                if (odaYonetici.odaSil(odaNumarasi)) {
                    JOptionPane.showMessageDialog(this, "Oda başarıyla silindi!");
                } else {
                    JOptionPane.showMessageDialog(this, "Oda bulunamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
                }
                odaNumarasiField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Geçerli bir oda numarası girin!", "Hata", JOptionPane.ERROR_MESSAGE);
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
