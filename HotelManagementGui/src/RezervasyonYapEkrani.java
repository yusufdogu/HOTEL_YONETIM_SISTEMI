import javax.swing.*;

public class RezervasyonYapEkrani extends JFrame {
    public RezervasyonYapEkrani() {
        setTitle("Rezervasyon Yap");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel isimLabel = new JLabel("İsim Soyisim:");
        JTextField isimField = new JTextField();
        JLabel tcLabel = new JLabel("TC Kimlik:");
        JTextField tcField = new JTextField();
        JLabel tarihLabel = new JLabel("Tarih:");
        JTextField tarihField = new JTextField();
        JLabel odaLabel = new JLabel("Oda No:");
        JTextField odaField = new JTextField();
        JButton rezervasyonButton = new JButton("Rezervasyon Yap");

        isimLabel.setBounds(20, 20, 100, 30);
        isimField.setBounds(120, 20, 200, 30);
        tcLabel.setBounds(20, 60, 100, 30);
        tcField.setBounds(120, 60, 200, 30);
        tarihLabel.setBounds(20, 100, 100, 30);
        tarihField.setBounds(120, 100, 200, 30);
        odaLabel.setBounds(20, 140, 100, 30);
        odaField.setBounds(120, 140, 200, 30);
        rezervasyonButton.setBounds(120, 200, 200, 40);

        add(isimLabel);
        add(isimField);
        add(tcLabel);
        add(tcField);
        add(tarihLabel);
        add(tarihField);
        add(odaLabel);
        add(odaField);
        add(rezervasyonButton);

        rezervasyonButton.addActionListener(e -> {
            String isim = isimField.getText();
            String tc = tcField.getText();
            String tarih = tarihField.getText();
            int odaNo = Integer.parseInt(odaField.getText());

            // Rezervasyon yapma işlemi
            System.out.println("Rezervasyon yapıldı: " + isim + ", Oda: " + odaNo);

            // Rezervasyonu veritabanına kaydetme işlemi yapılabilir.
        });

        setVisible(true);
    }
}
