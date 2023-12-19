package dev.criasltda.javafxsprintstarter.infra;

import org.springframework.util.ResourceUtils;

import java.awt.*;
import java.io.FileNotFoundException;

public class AppTray extends TrayIcon {

    private static  final String TOOLTIP = "show de bola soft";

    public AppTray () {
        super(createImage(), TOOLTIP);
        super.setImageAutoSize(true);
        //TODO super.setPopupMenu(createPopUpMenu);
    }

    private static Image createImage() {
        try {
            return Toolkit.getDefaultToolkit().getImage(
                    ResourceUtils.getFile("classpath:tray-icon.png").getPath()
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void show(){
        try {
            if (SystemTray.isSupported()){
                SystemTray st = SystemTray.getSystemTray();
                st.add(this);
                this.displayMessage("App pronto","aplicação iniciada" ,MessageType.INFO);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
