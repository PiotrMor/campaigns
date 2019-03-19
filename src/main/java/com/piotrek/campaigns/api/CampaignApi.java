package com.piotrek.campaigns.api;

import com.piotrek.campaigns.dao.CampaignDao;
import com.piotrek.campaigns.exceptions.CampaignNotFoundException;
import com.piotrek.campaigns.model.Campaign;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CampaignApi {

    private final CampaignDao dao;
    public static double budget = 1000000;

    CampaignApi(CampaignDao dao) {
        this.dao = dao;
    }

    //Returns list of all campaigns
    @GetMapping("/campaigns")
    List<Campaign> getAllCampaigns() {
        return dao.findAll();
    }

    //Adds a new campaign and updates budget
    @PostMapping("/campaigns")
    //@CrossOrigin(origins = "http://localhost:4200")
    Campaign newCampaign(@RequestBody Campaign newCampaign) {
        if (budget - newCampaign.getFund() >= 0) {
            budget -= newCampaign.getFund();
            return dao.save(newCampaign);
        } else {
            return null;
        }
    }

    //Returns current budget
    @GetMapping("/campaigns/budget")
    double getCampaignBudget() {
        return budget;
    }

}
