import javax.swing.*;

public class OdaEkleEkrani extends JFrame {
    public OdaEkleEkrani() {
        setTitle("Oda Ekle");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel odaNumarasiLabel = new JLabel("Oda Numarası:");
        JTextField odaNumarasiField = new JTextField();
        JLabel kapasiteLabel = new JLabel("Kapasite:");
        JTextField kapasiteField = new JTextField();
        JLabel fiyatLabel = new JLabel("Fiyat:");
        JTextField fiyatField = new JTextField();
        JLabel odaDurumuLabel = new JLabel("Durum:");
        JTextField odaDurumuField = new JTextField();
        JLabel manzaraLabel = new JLabel("Manzara:");
        JTextField manzaraField = new JTextField();

        JButton ekleButton = new JButton("Ekle");

        odaNumarasiLabel.setBounds(20, 20, 100, 30);
        odaNumarasiField.setBounds(120, 20, 150, 30);
        kapasiteLabel.setBounds(20, 60, 100, 30);
        kapasiteField.setBounds(120, 60, 150, 30);
        fiyatLabel.setBounds(20, 100, 100, 30);
        fiyatField.setBounds(120, 100, 150, 30);
        odaDurumuLabel.setBounds(20, 140, 100, 30);
        odaDurumuField.setBounds(120, 140, 150, 30);
        manzaraLabel.setBounds(20, 180, 100, 30);
        manzaraField.setBounds(120, 180, 150, 30);
        ekleButton.setBounds(100, 220, 100, 30);

        add(odaNumarasiLabel);
        add(odaNumarasiField);
        add(kapasiteLabel);
        add(kapasiteField);
        add(fiyatLabel);
        add(fiyatField);
        add(odaDurumuLabel);
        add(odaDurumuField);
        add(manzaraLabel);
        add(manzaraField);
        add(ekleButton);

        ekleButton.addActionListener(e -> {
            int odaNumarasi = Integer.parseInt(odaNumarasiField.getText());
            int kapasite = Integer.parseInt(kapasiteField.getText());
            double fiyat = Double.parseDouble(fiyatField.getText());
            String odaDurumu = odaDurumuField.getText();
            String manzara = manzaraField.getText();

            //Oda oda = new Oda();
            //oda.odaEkle(odaNumarasi, kapasite, fiyat, odaDurumu, manzara); // Oda ekleme işlemi

            JOptionPane.showMessageDialog(this, "Oda başarıyla eklendi!");
        });

        setVisible(true);
    }
}