import javax.swing.*;

public class RezervasyonListeEkrani extends JFrame {
    public RezervasyonListeEkrani() {
        setTitle("Rezervasyonları Gör");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 350, 300);
        textArea.setEditable(false);

        // Rezervasyonları listeleme
        //Rezervasyon rezervasyon = new Rezervasyon();
        //rezervasyon.rezervasyonListele(); // Rezervasyonları listeleme işlemi (veritabanı üzerinden)

        // Örnek: Rezervasyon verisi yazdırma (gerçek veritabanı sorgusuyla bu dinamik hale gelir)
        textArea.setText("Rezervasyon No: 12345, Oda: 101, İsim: Ahmet Kaya\n");
        textArea.append("Rezervasyon No: 67890, Oda: 102, İsim: Elif Yılmaz\n");

        add(textArea);

        setVisible(true);
    }
}
