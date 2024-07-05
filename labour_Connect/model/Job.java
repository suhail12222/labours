package com.labours.labour_Connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;
    private double payment;
    private Long employerId;
public void SteId(int id){
    this.id=id;
    System.out.println("this is the programm for labour ");
}
    public Long getId(){
        return id;
    }
    public void setTitel(String titel){
        this.title=title;
        System.out.println(title)
    }
    public String getTitel(){
        return title;
    }
public void setDescription(String description){
    this.description=discription;
    System.out.println(description);
}
    public String getDescription(){
        retun description;
    }
    public void setLocation(String location);
        this.location=location;
System.out.println("this is the location of the employee :-"+location);
    }
    public String getLocation(){
        return location;
    }
public void setPayment(double payment){
    this.payment=payment;
    System.ot.println(payment);

}
public double getPayment(){
    return payment;
}
public void setEmployerId(Long employerId){
    this.employerId=employerId;
    System.out.println(employerId+"id of the");

}
    public long getEmployerId(){
    return employerId;
    }
}
