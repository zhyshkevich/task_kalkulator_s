package com.solanake.kalkulator.business.cloudant;

import com.google.gson.annotations.SerializedName;

public abstract class CloudantModel {

    @SerializedName("_id")
    private String id;

    @SerializedName("_rev")
    private String rev;


    public CloudantModel() {
    }


    public CloudantModel(String id, String rev) {
        this.id = id;
        this.rev = rev;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }
}
