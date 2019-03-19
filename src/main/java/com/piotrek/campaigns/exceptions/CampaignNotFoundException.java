package com.piotrek.campaigns.exceptions;

public class CampaignNotFoundException extends RuntimeException {

    public CampaignNotFoundException(Long id) {
        super("Could not find campaign with given id: " + id);
    }
}
