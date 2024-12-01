import javax.swing.*;

public class RezervasyonSilEkrani extends JFrame {
    public RezervasyonSilEkrani() {
        setTitle("Rezervasyon Sil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel rezervasyonNoLabel = new JLabel("Rezervasyon No:");
        JTextField rezervasyonNoField = new JTextField();
        JButton silButton = new JButton("Sil");

        rezervasyonNoLabel.setBounds(20, 20, 150, 30);
        rezervasyonNoField.setBounds(170, 20, 100, 30);
        silButton.setBounds(100, 80, 100, 30);

        add(rezervasyonNoLabel);
        add(rezervasyonNoField);
        add(silButton);

        silButton.addActionListener(e -> {
            double rezervasyonNo = Double.parseDouble(rezervasyonNoField.getText());

            // Rezervasyon silme işlemi
            System.out.println("Rezervasyon silindi: " + rezervasyonNo);

            // Gerçek rezervasyon silme işlemi veritabanı ile yapılabilir.
        });

        setVisible(true);
    }
}
