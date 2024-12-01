import javax.swing.*;

public class CalisanSilEkrani extends JFrame {
    public CalisanSilEkrani() {
        setTitle("Çalışan Sil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel kimlikLabel = new JLabel("Personel Kimlik No:");
        JTextField kimlikField = new JTextField();
        JButton silButton = new JButton("Sil");

        kimlikLabel.setBounds(20, 20, 150, 30);
        kimlikField.setBounds(170, 20, 100, 30);
        silButton.setBounds(100, 80, 100, 30);

        add(kimlikLabel);
        add(kimlikField);
        add(silButton);

        silButton.addActionListener(e -> {
            String kimlik = kimlikField.getText();
            //Personel personel = new Personel();
            //personel.personelSil(kimlik); // Çalışan silme işlemi

            JOptionPane.showMessageDialog(this, "Çalışan başarıyla silindi!");
        });

        setVisible(true);
    }
}