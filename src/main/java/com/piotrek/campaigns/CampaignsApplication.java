package com.piotrek.campaigns;

import com.piotrek.campaigns.api.CampaignApi;
import com.piotrek.campaigns.dao.CampaignDao;
import com.piotrek.campaigns.model.Campaign;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CampaignsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampaignsApplication.class, args);
    }

    @Bean
    ApplicationRunner init(CampaignDao dao) {
        return args -> {
            Campaign c1 = new Campaign();
            c1.setTown("Cracow");
            c1.setRadius(2);
            c1.setFund(1234);
            c1.setKeywords("Key");
            c1.setActive(true);
            c1.setName("First campaign");
            c1.setBidAmount(2222);
            CampaignApi.budget -= c1.getFund();
            dao.save(c1);
            Campaign c2 = new Campaign();
            c2.setTown("Warsaw");
            c2.setRadius(50);
            c2.setFund(1232);
            c2.setKeywords("Car");
            c2.setActive(false);
            c2.setName("Example campaign");
            c2.setBidAmount(4920);
            CampaignApi.budget -= c2.getFund();
            dao.save(c2);
        };
    }

}
