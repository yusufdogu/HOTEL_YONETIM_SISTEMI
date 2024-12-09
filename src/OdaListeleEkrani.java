import javax.swing.*;
import java.awt.event.ActionEvent;

public class OdaListeleEkrani extends JFrame {
    private JFrame previousFrame;
    public OdaListeleEkrani(JFrame previousFrame) {
        this.previousFrame = previousFrame;

        setTitle("Odaları Listele");
        setSize(400, 400);
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
            new OdaListeleEkrani(previousFrame); // Bu ekranı yeniden başlat
            dispose(); // Mevcut ekranı kapat
        });

        // Menü çubuğuna butonları ekle
        menuBar.add(backButton);
        menuBar.add(refreshButton);


        // Menü çubuğunu pencereye ekle
        setJMenuBar(menuBar);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 350, 300);
        textArea.setEditable(false);

        // Örnek: Odaları listeleme
        textArea.setText("Oda No: 101, Kapasite: 2, Fiyat: 200 TL\n");
        textArea.append("Oda No: 102, Kapasite: 4, Fiyat: 400 TL\n");

        add(textArea);

        setVisible(true);
    }
}

