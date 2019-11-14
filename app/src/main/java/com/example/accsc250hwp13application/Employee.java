package com.example.accsc250hwp13application;

import android.widget.EditText;

public class Employee
{
   private String fname;
   private String lname;
   private int height_feet;
   private int height_inches;
   private int age;
   private double weight;

   public Employee(String fname, String lname, int height_feet, int height_inches, int age, double weight)
   {
       this.fname = fname;
       this.lname = lname;
       this.height_feet = height_feet;
       this.height_inches = height_inches;
       this.age = age;
       this.weight = weight;
   }

   public String getFname()
   {
       return fname;
   }

   public String getLname()
   {
       return lname;
   }

   public int getHeight_feet()
   {
       return height_feet;
   }

   public int getHeight_inches()
   {
       return height_inches;
   }

   public int getAge()
   {
       return age;
   }

   public double getWeight()
   {
       return weight;
   }

   public String getString()
   {
       //gathers the string and then returns it with Name, Height, Weight, and Age on separate lines with "\n"
       String s = "Name " + getFname() + " " + getLname() + "\n" + "Height: " + Integer.toString(getHeight_feet()) + " ft. " + Integer.toString(getHeight_inches()) + " in. " + "\n" + "Weight: " + Double.toString(getWeight()) + "\n" + "Age: " + Integer.toString(getAge());
       return s;
   }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setHeight_feet(int height_feet) {
        this.height_feet = height_feet;
    }

    public void setHeight_inches(int height_inches) {
        this.height_inches = height_inches;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age)
    {
        this.age = age;
    }



}
