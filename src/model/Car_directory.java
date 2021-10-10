/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author shivanginagar
 */
public class Car_directory {
    
    private ArrayList<CarInfo> cardetails;
    
    public Car_directory() {
        
        cardetails = new ArrayList<CarInfo>();
        
        CarInfo car1 = new CarInfo(true, "Tesla", 2018, 1, 2, 1, "Black", "S1", "Boston", true);
        CarInfo car2 = new CarInfo(false, "BMW", 2019, 1, 4, 2, "Red", "X1", "New York", true);
        CarInfo car3 = new CarInfo(true, "Audi", 2018, 1, 4, 3, "Black", "T1", "Boston", true);
        CarInfo car4 = new CarInfo(true, "Mercedes", 2018, 1, 4, 4, "Blue", "G1", "New York", true);
        CarInfo car5 = new CarInfo(true, "Audi", 2017, 1, 4, 5, "Green", "T2", "Washington", false);
        CarInfo car6 = new CarInfo(true, "GM", 2017, 1, 4, 6, "Black", "G2", "Washington", true);
        CarInfo car7 = new CarInfo(true, "Tesla", 2016, 1, 4, 7, "Red", "Y1", "San Francisco", true);
        CarInfo car8 = new CarInfo(true, "BMW", 2016, 1, 4, 8, "Blue", "X2", "San Francisco", true);
        CarInfo car9 = new CarInfo(false, "Mercedes", 2019, 1, 4, 9, "Green", "T3", "Dallas", false);
        CarInfo car10 = new CarInfo(false, "GM", 2019, 1, 4, 10, "Black", "G3", "Dallas", false);
        
        cardetails.add(car1);
        cardetails.add(car2);
        cardetails.add(car3);
        cardetails.add(car4);
        cardetails.add(car5);
        cardetails.add(car6);
        cardetails.add(car7);
        cardetails.add(car8);
        cardetails.add(car9);
        cardetails.add(car10);
        
    }

    public ArrayList<CarInfo> getCardetails() {
        return cardetails;
    }

    public void setCardetails(ArrayList<CarInfo> cardetails) {
        this.cardetails = cardetails;
    }
    
    public void addCarInfo(CarInfo car)
    {
        cardetails.add(car);
    }
    
    public void deleteCar(CarInfo product){
        cardetails.remove(product);
    }
    
    //1. Find me the first available passenger car.
    public CarInfo firstAvailable()
    {
        return cardetails.get(0);
    }
    
    //2. How many cars are currently available. 
    public int availableCar()
    {
        int availablity = 0;
        
        for(CarInfo car : cardetails)
        {
            if(car.isAvailablity())
            {
                availablity = availablity + 1;
            }
        }
        return availablity;
    }
    
    //3. List all cars that are made by Toyota, GM, etc.
    public ArrayList<CarInfo> searchByBrand(String brandname)
    {
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : cardetails){
            if(car.getBrandname().equalsIgnoreCase(brandname)){
                list.add(car);
            }
        }
        return list;
    }
    
    //4. List all cars that were manufactured in a given year, ‘x’
    public ArrayList<CarInfo> searchByYear(int manuf_year)
    {
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : cardetails){
            if(car.getManuf_year() == manuf_year){
                list.add(car);
            }
        }
        return list;
    }
    
    //5. Find an available car with a minimum of x seats but no more than y seats.
    public ArrayList<CarInfo> searchBySeats(int minseats, int maxseats)
    {
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : cardetails){
            if(car.getMinseats() >= minseats && car.getMaxseats() <= maxseats){
                list.add(car);
            }
        }
        return list;
    }
    
    //6. Find a car with the given serial number. List the attributes of the found car
    public ArrayList<CarInfo> searchBySerialNumber(int serialnum)
    {
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : cardetails){
            if(car.getSerialnum() == serialnum){
                list.add(car);
            }
        }
        return list;
    }
    
    //7. List all cars given the model number
    public ArrayList<CarInfo> searchByModelNumber(String modelnum)
    {
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : cardetails){
            if(car.getModelnum().equalsIgnoreCase(modelnum)){
                list.add(car);
            }
        }
        return list;
    }
    
    //8. List all the car manufacturers used by the (this) Uber.
    public String carManufactures()
    {
        String manufacturers = "";
        for(CarInfo car : cardetails){
            manufacturers = manufacturers + car.getBrandname() +"\n";
        }
        return manufacturers;
    }
    
    //9. When was the last time the fleet catalog was updated.
    public Date lastUpdated()
    {
        Date min = cardetails.get(0).getCreatedOn();
        for(CarInfo car : cardetails){
            if(car.getCreatedOn().compareTo(min) > 0){
                min = car.getCreatedOn();
            }
        }
        return min;
    }
    
    //10. List all cars that are available in a given city.
    public ArrayList<CarInfo> searchByAvailableInCity(String availablecity)
    {
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : cardetails){
            if((car.getAvailablecity().equalsIgnoreCase(availablecity)) && (car.isAvailablity())){
                list.add(car);
            }
        }
        return list;
    }
    
    //11. List all cars that have expired maintenance certificate
    public ArrayList<CarInfo> searchByMaintenanceCertificate()
    {
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : cardetails){
            if(car.isMaintenance_record() == false){
                list.add(car);
            }
        }
        return list;
    }
    
    //12. List cars from a brand with this colour
    public ArrayList<CarInfo> searchByBrandColor(String brandname, String color)
    {
        ArrayList<CarInfo> temp = new ArrayList<CarInfo>();
        temp = searchByBrand(brandname);
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : temp){
            if(car.getColor().equalsIgnoreCase(color)){
                list.add(car);
            }
        }
        return list;
    }
    
    //13. List brand cars available in a city
    public ArrayList<CarInfo> searchByAvailableBrand(String city, String brandname)
    {
        ArrayList<CarInfo> temp = new ArrayList<CarInfo>();
        temp = searchByAvailableInCity(city);
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : temp){
            if(car.getBrandname().equalsIgnoreCase(brandname)){
                list.add(car);
            }
        }
        return list;
    }
    
    //14. List brand cars with particular seats
    public ArrayList<CarInfo> searchByBrandSeats(String brandname, int seats)
    {
        ArrayList<CarInfo> temp = new ArrayList<CarInfo>();
        temp = searchByBrand(brandname);
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : temp){
            if(car.getMaxseats() == seats){
                list.add(car);
            }
        }
        return list;
    }
    
    //15. Search Cars with Model number x and Serial number y
    public ArrayList<CarInfo> searchByModelSerial(int serialNumber, String modelNumber)
    {
        ArrayList<CarInfo> temp = new ArrayList<CarInfo>();
        temp = searchBySerialNumber(serialNumber);
        ArrayList<CarInfo> list = new ArrayList<CarInfo>();
        for(CarInfo car : temp){
            if(car.getModelnum().equalsIgnoreCase(modelNumber)){
                list.add(car);
            }
        }
        return list;
    }
}

    



