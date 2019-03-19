package com.piotrek.campaigns.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Campaign {

    private @Id
    @GeneratedValue
    Long id;
    @NotNull
    private String name;
    @NotNull
    private String keywords;
    @NotNull
    private int bidAmount;
    @NotNull
    private double fund;
    @NotNull
    private boolean isActive;
    private String town;
    @NotNull
    private int radius;

    public Campaign() {
    }

    public Campaign(String name, String keywords, int bidAmount, double fund, boolean isActive, String town, int radius) {
        this.name = name;
        this.keywords = keywords;
        this.bidAmount = bidAmount;
        this.fund = fund;
        this.isActive = isActive;
        this.town = town;
        this.radius = radius;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
