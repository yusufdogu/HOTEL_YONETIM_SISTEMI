import javax.swing.*;
import java.util.ArrayList;

public class CalisanEkleEkrani extends JFrame {
    public CalisanEkleEkrani(JFrame previousFrame, ArrayList<Calisan> calisanlar) {
        setTitle("Çalışan Ekle");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel isimLabel = new JLabel("İsim:");
        JTextField isimField = new JTextField();
        JLabel kimlikLabel = new JLabel("Kimlik:");
        JTextField kimlikField = new JTextField();
        JLabel gorevLabel = new JLabel("Görev:");
        JTextField gorevField = new JTextField();
        JButton ekleButton = new JButton("Ekle");
        JButton geriButton = new JButton("GERİ");

        isimLabel.setBounds(20, 20, 100, 30);
        isimField.setBounds(120, 20, 150, 30);
        kimlikLabel.setBounds(20, 70, 100, 30);
        kimlikField.setBounds(120, 70, 150, 30);
        gorevLabel.setBounds(20, 120, 100, 30);
        gorevField.setBounds(120, 120, 150, 30);
        ekleButton.setBounds(50, 200, 80, 30);
        geriButton.setBounds(150, 200, 80, 30);

        add(isimLabel);
        add(isimField);
        add(kimlikLabel);
        add(kimlikField);
        add(gorevLabel);
        add(gorevField);
        add(ekleButton);
        add(geriButton);

        // Ekle butonu
        ekleButton.addActionListener(e -> {
            String isim = isimField.getText();
            String kimlik = kimlikField.getText();
            String gorev = gorevField.getText();

            if (isim.isEmpty() || kimlik.isEmpty() || gorev.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tüm alanları doldurun!", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            calisanlar.add(new Calisan(isim, kimlik, gorev));
            JOptionPane.showMessageDialog(this, "Çalışan başarıyla eklendi!");

            isimField.setText("");
            kimlikField.setText("");
            gorevField.setText("");
        });

        // GERİ butonu
        geriButton.addActionListener(e -> {
            previousFrame.setVisible(true);
            dispose();
        });

        setVisible(true);
    }
}
