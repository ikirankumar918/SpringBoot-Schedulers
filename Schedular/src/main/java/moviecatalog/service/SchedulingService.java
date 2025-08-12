package moviecatalog.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SchedulingService {

    //@Scheduled(fixedRate = 5000) //for every 5 secs
    @Scheduled(cron = "*/10 * * * * *") //scheduled for every 10 sec using cron job settings
    public void runTask() {
        System.out.println("*********************Scheduled task executed at CRON:******************* " + LocalDateTime.now());
    }
}
