package Main;

import java.io.IOException;
import java.nio.file.*;
import javax.swing.SwingUtilities;

public class Config {

    public static void main(String[] args) {
        Path path = Paths.get("./config.txt");

        if (!Files.exists(path)) {
            // The config file does not exist, this is the first time the program is run
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }

            SwingUtilities.invokeLater(() -> {
                FirstTimeWindow window = new FirstTimeWindow();
                window.setVisible(true);
            });

        } else {
            // The config file exists, prompt the user to login
            SwingUtilities.invokeLater(() -> {
                LoginWindow1 window = new LoginWindow1();
                window.setVisible(true);
            });
        }
    }
}
