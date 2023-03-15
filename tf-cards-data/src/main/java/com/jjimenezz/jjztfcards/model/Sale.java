package com.jjimenezz.jjztfcards.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Sale extends BaseEntity {

    private Figure item;
    private String description;
    private BigDecimal price;
    private CollectorUser seller;
    private CollectorUser buyer;
    private LocalDate date;

    public Figure getItem() {
        return item;
    }

    public void setItem(Figure item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CollectorUser getSeller() {
        return seller;
    }

    public void setSeller(CollectorUser seller) {
        this.seller = seller;
    }

    public CollectorUser getBuyer() {
        return buyer;
    }

    public void setBuyer(CollectorUser buyer) {
        this.buyer = buyer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
