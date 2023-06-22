package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {
    @Column(nullable = false)
    private long securityID;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String categoryType;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private long quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(long securityID, String securityName, String categoryType, Date purchaseDate, long purchasePrice, long quantity) {
        this.securityID = securityID;
        this.securityName = securityName;
        this.categoryType = categoryType;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getSecurityID() {
        return securityID;
    }

    public void setSecurityID(long securityID)
    {
        this.securityID = securityID;
    }
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }







}
