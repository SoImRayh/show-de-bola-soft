package dev.criasltda.javafxsprintstarter;

import dev.criasltda.javafxsprintstarter.infra.AppTray;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class JavafxSprintStarterApplication {

    public static void main(String[] args) {
        Application.launch(FXApp.class, args);
    }

    @Scheduled(initialDelay = 1L)
    public void showTrayIcon(){
        AppTray appTray = new AppTray();
        appTray.show();
    }

}
