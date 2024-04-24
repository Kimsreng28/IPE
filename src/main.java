import javax.swing.SwingUtilities;

import service.Interface;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Interface();
        });
    }
}
