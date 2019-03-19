package com.piotrek.campaigns.dao;

import com.piotrek.campaigns.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

//This interface provides update and delete operations for campaign
@CrossOrigin(origins = "http://localhost:4200")
public interface CampaignDao extends JpaRepository<Campaign, Long> {

}
