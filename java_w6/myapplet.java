import java.applet.Applet;
import java.awt.Graphics;

public class myapplet extends Applet {
    public void init() {
        System.out.println("Applet Initialized");
        }
        // Called when the applet is started
    public void start() {
        System.out.println("Applet Started");
        }
    public void stop() {
            System.out.println("Applet Stopped");
            // Called when the applet is destroyed
    public void destroy() {
            System.out.println("Applet Destroyed");
            // Paints the applet's interface
    public void paint(Graphics g) {
            g.drawString("Hello, Applet!", 50, 50);
        }
    }
    }
}
