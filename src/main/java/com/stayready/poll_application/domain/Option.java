package com.stayready.poll_application.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Option 
{
    @Id
    @GeneratedValue
    @Column(name = "Option_ID")
    private long id;
    @Column(name = "Option_Value")
    private String value;
    
    public long getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setValue(String value) {
        this.value = value;
    }

}