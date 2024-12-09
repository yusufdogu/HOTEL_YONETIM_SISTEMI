import javax.swing.*;

public class RezervasyonSilEkrani extends JFrame {
    public RezervasyonSilEkrani(JFrame previousFrame, OtelMisafirYonetici misafirYonetici) {
        setTitle("Rezervasyon Sil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel rezervasyonNoLabel = new JLabel("Rezervasyon No:");
        JTextField rezervasyonNoField = new JTextField();
        JButton silButton = new JButton("Sil");
        JButton geriButton = new JButton("GERİ");

        rezervasyonNoLabel.setBounds(20, 20, 120, 30);
        rezervasyonNoField.setBounds(150, 20, 100, 30);
        silButton.setBounds(50, 80, 80, 30);
        geriButton.setBounds(150, 80, 80, 30);

        add(rezervasyonNoLabel);
        add(rezervasyonNoField);
        add(silButton);
        add(geriButton);

        // Silme işlemi
        silButton.addActionListener(e -> {
            String rezervasyonNo = rezervasyonNoField.getText().trim();
            if (rezervasyonNo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rezervasyon No alanını doldurun!", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean bulundu = misafirYonetici.silRezervasyon(rezervasyonNo);
            if (bulundu) {
                JOptionPane.showMessageDialog(this, "Rezervasyon başarıyla silindi!");
                rezervasyonNoField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Rezervasyon bulunamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
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
