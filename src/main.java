// ======================================== Core Library
import javax.swing.SwingUtilities;

import service.Interface;
// ======================================== Custom Library
// Appication start form here 
public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Interface();
        });
    }
}