/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author shivanginagar
 */
public class CarInfo {
   
    private boolean availablity;
    private String brandname;
    private int manuf_year;
    private int minseats;
    private int maxseats;
    private int serialnum;
    private String color;
    private String modelnum;
    private String availablecity;
    private boolean maintenance_record;
    private Date createdOn;

    public boolean isAvailablity() {
        return availablity;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public int getManuf_year() {
        return manuf_year;
    }

    public void setManuf_year(int manuf_year) {
        this.manuf_year = manuf_year;
    }

    public int getMinseats() {
        return minseats;
    }

    public void setMinseats(int minseats) {
        this.minseats = minseats;
    }

    public int getMaxseats() {
        return maxseats;
    }

    public void setMaxseats(int maxseats) {
        this.maxseats = maxseats;
    }

    public int getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(int serialnum) {
        this.serialnum = serialnum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelnum() {
        return modelnum;
    }

    public void setModelnum(String modelnum) {
        this.modelnum = modelnum;
    }

    public String getAvailablecity() {
        return availablecity;
    }

    public void setAvailablecity(String availablecity) {
        this.availablecity = availablecity;
    }

    public boolean isMaintenance_record() {
        return maintenance_record;
    }

    public void setMaintenance_record(boolean maintenance_record) {
        this.maintenance_record = maintenance_record;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    
     public CarInfo(){
        this.createdOn = new Date();
    }
    
    public CarInfo(boolean availablity, String brandname, int manuf_year, int minseats, int maxseats, int serialnum, String color, String modelnum, String availablecity, boolean maintenance_record) {
        this.availablity = availablity;
        this.brandname = brandname;
        this.manuf_year = manuf_year;
        this.minseats = minseats;
        this.maxseats = maxseats;
        this.serialnum = serialnum;
        this.color = color;
        this.modelnum = modelnum;
        this.availablecity = availablecity;
        this.maintenance_record = maintenance_record;
        this.createdOn = new Date();
    }
    
    @Override
    public String toString() {
        return this.getBrandname(); //To change body of generated methods, choose Tools | Templates.
    }
}




