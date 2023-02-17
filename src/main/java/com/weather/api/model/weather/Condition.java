
package com.weather.api.model.weather;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Condition {

    private String text;
    private String icon;
    private long code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Condition() {
    }

    /**
     * 
     * @param code
     * @param icon
     * @param text
     */
    public Condition(String text, String icon, long code) {
        super();
        this.text = text;
        this.icon = icon;
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

}
