import javax.swing.*;

public class OdaSilEkrani extends JFrame {
    public OdaSilEkrani() {
        setTitle("Oda Sil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

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