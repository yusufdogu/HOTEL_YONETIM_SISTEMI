import javax.swing.*;

public class OdaListeleEkrani extends JFrame {
    public OdaListeleEkrani() {
        setTitle("Odaları Listele");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

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

