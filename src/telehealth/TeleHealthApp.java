/*
 * TeleHealthApp.java
 */

package telehealth;

import com.alee.laf.WebLookAndFeel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class TeleHealthApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        WebLookAndFeel.install();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        show(new TeleHealthView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of TeleHealthApp
     */
    public static TeleHealthApp getApplication() {
        return Application.getInstance(TeleHealthApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(TeleHealthApp.class, args);
    }
}
