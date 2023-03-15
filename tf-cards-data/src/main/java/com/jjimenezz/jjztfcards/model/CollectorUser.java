package com.jjimenezz.jjztfcards.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CollectorUser extends BaseUser {
    private Set<Figure> figures;
    private Set<CollectorBadge> badges;
    private String country;
    private String state;
    private String city;
    private String phone;
    private String address;

    public Set<Figure> getFigures() {
        if (Objects.isNull(this.figures)) this.figures = new HashSet<>();
        return figures;
    }

    public void setFigures(Set<Figure> figures) {
        this.figures = figures;
    }

    public Set<CollectorBadge> getBadges() {
        return badges;
    }

    public void setBadges(Set<CollectorBadge> badges) {
        this.badges = badges;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
