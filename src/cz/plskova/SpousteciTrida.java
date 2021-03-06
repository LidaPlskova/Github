package cz.plskova;

import javax.swing.*;
import net.sevecek.util.swing.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SpousteciTrida::run);
    }

    public static void run() {
        SwingExceptionHandler.install();
        HlavniOknoAplikace okno = new HlavniOknoAplikace();
        okno.setVisible(true);
    }

}
