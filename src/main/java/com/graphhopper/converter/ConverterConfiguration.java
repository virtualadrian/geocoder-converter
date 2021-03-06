package com.graphhopper.converter;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.client.JerseyClientConfiguration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author Robin Boldt
 */
public class ConverterConfiguration extends Configuration {

    @NotEmpty
    private String nominatimUrl = "http://nominatim.openstreetmap.org/search/";
    @NotEmpty
    private String nominatimReverseUrl = "http://nominatim.openstreetmap.org/reverse/";
    private String nominatimEmail = "";
    private String openCageDataUrl = "https://api.opencagedata.com/geocode/v1/json";
    private String openCageDataKey = "";

    @Valid
    @NotNull
    private final JerseyClientConfiguration jerseyClient = new JerseyClientConfiguration();

    private boolean healthCheck = true;
    private boolean nominatim = true;
    private boolean opencagedata;

    private String ipBlackList = "";
    private String ipWhiteList = "";

    @JsonProperty
    public void setNominatim(boolean nom) {
        nominatim = nom;
    }

    @JsonProperty
    public boolean isNominatim() {
        return nominatim;
    }

    @JsonProperty
    public String getNominatimUrl() {
        return nominatimUrl;
    }

    @JsonProperty
    public void setNominatimUrl(String url) {
        this.nominatimUrl = url;
    }

    @JsonProperty
    public String getNominatimEmail() {
        return nominatimEmail;
    }

    @JsonProperty
    public void setNominatimEmail(String email) {
        this.nominatimEmail = email;
    }

    @JsonProperty
    public void setOpenCageData(boolean ocd) {
        opencagedata = ocd;
    }

    @JsonProperty
    public boolean isOpenCageData() {
        return opencagedata;
    }

    @JsonProperty
    public String getOpenCageDataUrl() {
        return openCageDataUrl;
    }

    @JsonProperty
    public void setOpenCageDataUrl(String url) {
        this.openCageDataUrl = url;
    }

    @JsonProperty
    public String getOpenCageDataKey() {
        return openCageDataKey;
    }

    @JsonProperty
    public void setOpenCageDataKey(String key) {
        this.openCageDataKey = key;
    }

    @JsonProperty
    public boolean isHealthCheck() {
        return healthCheck;
    }

    @JsonProperty
    public void setHealthCheck(boolean hc) {
        this.healthCheck = hc;
    }

    @JsonProperty("jerseyClient")
    public JerseyClientConfiguration getJerseyClientConfiguration() {
        return jerseyClient;
    }

    @JsonProperty(value = "ipBlackList")
    public String getIPBlackList() {
        return ipBlackList;
    }

    @JsonProperty(value = "ipBlackList")
    public void setIPBlackList(String ipBlackList) {
        this.ipBlackList = ipBlackList;
    }

    @JsonProperty(value = "ipWhiteList")
    public String getIPWhiteList() {
        return ipWhiteList;
    }

    @JsonProperty(value = "ipWhiteList")
    public void setIPWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    public String getNominatimReverseUrl() {
        return nominatimReverseUrl;
    }

    public void setNominatimReverseUrl(String nominatimReverseUrl) {
        this.nominatimReverseUrl = nominatimReverseUrl;
    }
}
