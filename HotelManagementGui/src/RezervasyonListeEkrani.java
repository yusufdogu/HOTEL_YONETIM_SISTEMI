import javax.swing.*;
import java.util.ArrayList;

public class RezervasyonListeleEkrani extends JFrame {
    public RezervasyonListeleEkrani(JFrame previousFrame, OtelMisafirYonetici misafirYonetici) {
        setTitle("Rezervasyonları Listele");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // TextArea: Rezervasyonları göstermek için
        JTextArea rezervasyonListesi = new JTextArea();
        rezervasyonListesi.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(rezervasyonListesi);
        scrollPane.setBounds(20, 20, 350, 300);

        JButton geriButton = new JButton("GERİ");
        geriButton.setBounds(150, 330, 100, 30);

        add(scrollPane);
        add(geriButton);

        // Rezervasyonları listeleme
        ArrayList<Misafir> misafirler = misafirYonetici.getMisafirler(); // Doğru method
        for (Misafir misafir : misafirler) {
            rezervasyonListesi.append(misafir.toString() + "\n");
        }

        // GERİ butonu
        geriButton.addActionListener(e -> {
            previousFrame.setVisible(true);
            dispose();
        });

        setVisible(true);
    }
}
