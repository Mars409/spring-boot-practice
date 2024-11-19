package zh.timer;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

@Slf4j
public class StockPriceTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            double price = 100.0;
            final Random random = new Random();

            @Override
            public void run() {
                price += random.nextDouble();
                log.info( "当前股票的价格是"+ price);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}