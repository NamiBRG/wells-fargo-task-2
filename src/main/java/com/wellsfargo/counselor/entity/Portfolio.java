package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long PortfolioId;

    @Column(nullable = false)
    private Date creationDate;

    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;

    protected Portfolio(){

    }

    public Portfolio(long portfolioId) {
        this.PortfolioId = portfolioId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
