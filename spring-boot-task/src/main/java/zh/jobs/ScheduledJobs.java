package zh.jobs;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class ScheduledJobs {
    @Scheduled(fixedRate = 3000)
    public void fixedRateJob() throws InterruptedException {
        log.info("fixedRateJob start:{}",new Date());
        Thread.sleep(5000);
        log.info("fixedRateJob end:{}",new Date());


    }
}
