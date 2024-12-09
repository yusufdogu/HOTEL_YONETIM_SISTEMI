import javax.swing.*;
import java.awt.event.ActionEvent;

public class OdaAraEkrani extends JFrame {
    private JFrame previousFrame;
    public OdaAraEkrani(JFrame previousFrame) {
        this.previousFrame = previousFrame;

        setTitle("Oda Arama");
        setSize(300, 250);
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
            new OdaAraEkrani(previousFrame); // Bu ekranı yeniden başlat
            dispose(); // Mevcut ekranı kapat
        });

        // Menü çubuğuna butonları ekle
        menuBar.add(backButton);
        menuBar.add(refreshButton);

        // Menü çubuğunu pencereye ekle
        setJMenuBar(menuBar);

        // Bileşenler
        JLabel tarihLabel = new JLabel("Tarih:");
        JTextField tarihField = new JTextField();
        JLabel odaTipiLabel = new JLabel("Oda Tipi:");
        JTextField odaTipiField = new JTextField();
        JButton araButton = new JButton("Ara");

        tarihLabel.setBounds(20, 20, 100, 30);
        tarihField.setBounds(120, 20, 150, 30);
        odaTipiLabel.setBounds(20, 60, 100, 30);
        odaTipiField.setBounds(120, 60, 150, 30);
        araButton.setBounds(100, 120, 100, 30);

        add(tarihLabel);
        add(tarihField);
        add(odaTipiLabel);
        add(odaTipiField);
        add(araButton);

        araButton.addActionListener(e -> {
            // Oda arama işlemi (SQL ile)
            String tarih = tarihField.getText();
            String odaTipi = odaTipiField.getText();

            // Örnek olarak:
            System.out.println("Tarih: " + tarih + ", Oda Tipi: " + odaTipi);

            // Gerçek oda arama ve listeleme işlemi yapılabilir.
        });

        setVisible(true);
    }
}

