package Labirent;


import java.util.Timer;
import java.util.TimerTask;
import java.util.Timer;
import java.util.TimerTask;

public class Zaman {

    int saniye = 0;
    Timer myTimer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            saniye++;
          //  System.out.println("Toplam Saniye :  " + saniye);
        }
    };

    public void start() {
        myTimer.scheduleAtFixedRate(task, 1000, 1000);
    }

}
