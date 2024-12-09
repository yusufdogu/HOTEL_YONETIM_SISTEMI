import javax.swing.*;
import java.util.ArrayList;

public class CalisanSilEkrani extends JFrame {
    public CalisanSilEkrani(JFrame previousFrame, ArrayList<Calisan> calisanlar) {
        setTitle("Çalışan Sil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Bileşenler
        JLabel kimlikLabel = new JLabel("Kimlik No:");
        JTextField kimlikField = new JTextField();
        JButton silButton = new JButton("Sil");
        JButton geriButton = new JButton("GERİ");

        kimlikLabel.setBounds(20, 20, 120, 30);
        kimlikField.setBounds(150, 20, 100, 30);
        silButton.setBounds(50, 80, 80, 30);
        geriButton.setBounds(150, 80, 80, 30);

        add(kimlikLabel);
        add(kimlikField);
        add(silButton);
        add(geriButton);

        // Silme işlemi
        silButton.addActionListener(e -> {
            String kimlikNo = kimlikField.getText().trim();
            if (kimlikNo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kimlik No boş bırakılamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean bulundu = false;
            for (int i = 0; i < calisanlar.size(); i++) {
                if (calisanlar.get(i).getKimlikNo().equals(kimlikNo)) {
                    calisanlar.remove(i);
                    bulundu = true;
                    break;
                }
            }

            if (bulundu) {
                JOptionPane.showMessageDialog(this, "Çalışan başarıyla silindi!");
                kimlikField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Kimlik No bulunamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        });

        // GERİ butonu
        geriButton.addActionListener(e -> {
            previousFrame.setVisible(true);
            dispose();
        });

        setVisible(true);
    }
}
