import javax.swing.*;
import java.util.ArrayList;

public class OdaListeleEkrani extends JFrame {
    public OdaListeleEkrani(JFrame previousFrame, ArrayList<Oda> odalar) {
        setTitle("Odaları Listele");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // TextArea: Odaları göstermek için
        JTextArea odaListesi = new JTextArea();
        odaListesi.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(odaListesi);
        scrollPane.setBounds(20, 20, 350, 300);

        JButton geriButton = new JButton("GERİ");
        geriButton.setBounds(150, 330, 100, 30);

        add(scrollPane);
        add(geriButton);

        // Odaları listeleme
        for (Oda oda : odalar) {
            odaListesi.append("Oda Numarası: " + oda.getOdaNumarasi() +
                    ", Kapasite: " + oda.getKapasite() +
                    ", Fiyat: " + oda.getFiyat() + " TL\n");
        }

        // GERİ butonu
        geriButton.addActionListener(e -> {
            previousFrame.setVisible(true);
            dispose();
        });

        setVisible(true);
    }
}
