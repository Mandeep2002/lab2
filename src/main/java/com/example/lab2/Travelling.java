package com.example.lab2;
public class Travelling
{
    private String city;
    private String VehileType;
    private int numberofdays;



    public Travelling(String city,String VehileType ,int numberofdays)
    {
        this.city=city;
        this.VehileType=VehileType;
        this.numberofdays=numberofdays;

    }

    public String getcity()
    {
        return city;
    }
    public String getVehileType()
    {
        return VehileType;
    }
    public int getnumberofdays()
    {
        return numberofdays;
    }
    public void setCity(String cityName)
    {
        this.city = cityName;
    }
    public void setVehileType(String VehicleType)
    {
        this.VehileType=VehileType;
    }
    public void setnumberofdays(int numberofdays)
    {
        this.numberofdays = numberofdays;
    }


    public String toString()
    {
        return ("Travelling Info" + " " + "\n" +
                "city=" + getcity() + "\n" + ""+ "VehileType=" + getVehileType() + "\n" +
                "numberofdays=" + getnumberofdays());
    }


    public int confirmation(int i)
    {
        if (numberofdays > 6)
        {
            throw new IllegalArgumentException("number of days are greater than allowed number of days");
        } else
        {
            return i;
        }
    }

}



