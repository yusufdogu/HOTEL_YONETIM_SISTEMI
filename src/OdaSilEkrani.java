import javax.swing.*;
import java.awt.event.ActionEvent;

public class OdaSilEkrani extends JFrame {
    private JFrame previousFrame;
    public OdaSilEkrani(JFrame previousFrame) {
        this.previousFrame = previousFrame;
        setTitle("Oda Sil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Menü çubuğu oluştur
        JMenuBar menuBar = new JMenuBar();

        // Geri Butonu
        JButton backButton = new JButton("⬅ Geri");
        backButton.addActionListener((ActionEvent e) -> {
            previousFrame.setVisible(true); // Önceki ekranı göster
            dispose(); // Mevcut ekranı kapat
        });

        // Yenile Butonu
        JButton refreshButton = new JButton("🔄 Yenile");
        refreshButton.addActionListener((ActionEvent e) -> {
            new OdaSilEkrani(previousFrame); // Bu ekranı yeniden başlat
            dispose(); // Mevcut ekranı kapat
        });

        // Menü çubuğuna butonları ekle
        menuBar.add(backButton);
        menuBar.add(refreshButton);

        // Menü çubuğunu pencereye ekle
        setJMenuBar(menuBar);

        // Bileşenler
        JLabel odaNumarasiLabel = new JLabel("Oda Numarası:");
        JTextField odaNumarasiField = new JTextField();
        JButton silButton = new JButton("Sil");

        odaNumarasiLabel.setBounds(20, 20, 100, 30);
        odaNumarasiField.setBounds(130, 20, 100, 30);
        silButton.setBounds(100, 80, 100, 30);

        add(odaNumarasiLabel);
        add(odaNumarasiField);
        add(silButton);

        silButton.addActionListener(e -> {
            int odaNumarasi = Integer.parseInt(odaNumarasiField.getText());
            //Oda oda = new Oda();
            //oda.odaSil(odaNumarasi); // Oda silme işlemi

            JOptionPane.showMessageDialog(this, "Oda başarıyla silindi!");
        });

        setVisible(true);
    }
}