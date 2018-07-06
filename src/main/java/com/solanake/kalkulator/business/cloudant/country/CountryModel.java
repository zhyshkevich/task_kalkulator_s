package com.solanake.kalkulator.business.cloudant.country;

import com.solanake.kalkulator.business.cloudant.CloudantModel;

import java.util.Objects;

public class CountryModel extends CloudantModel {

    private String uuid;
    private String countryName;
    private Double tax;
    private Double cost;
    private String currencyCode;
    private String dateCreated;

    public CountryModel() {
    }

    public CountryModel(String uuid, String countryName, Double tax, Double cost, String currencyCode, String dateCreated) {
        this.uuid = uuid;
        this.countryName = countryName;
        this.tax = tax;
        this.cost = cost;
        this.currencyCode = currencyCode;
        this.dateCreated = dateCreated;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryModel that = (CountryModel) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(countryName, that.countryName) &&
                Objects.equals(tax, that.tax) &&
                Objects.equals(cost, that.cost) &&
                Objects.equals(currencyCode, that.currencyCode) &&
                Objects.equals(dateCreated, that.dateCreated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid, countryName, tax, cost, currencyCode, dateCreated);
    }

    @Override
    public String toString() {
        return "CountryModel{" +
                "uuid='" + uuid + '\'' +
                ", countryName='" + countryName + '\'' +
                ", tax=" + tax +
                ", cost=" + cost +
                ", currencyCode='" + currencyCode + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                '}';
    }
}
