package com.example.BDC.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
public class food_data {
    @Id
    private Long id;
    @Column
    private String food_name;
    @Column
    private String food_Bigtype;
    @Column
    private String food_type;
    @Column
    private int size;
    @Column
    private double kcal;
    @Column
    private double moisture;
    @Column
    private double protein;
    @Column
    private double fat;
    @Column
    private double carbohydrate;
    @Column
    private double sugars;
    @Column
    private double Dietary_Fiber;
    @Column
    private double calcium;
    @Column
    private double salt;
    @Column
    private double vitamin;

    public Long getId() {
        return id;
    }

    public String getFood_name() {
        return food_name;
    }

    public String getFood_Bigtype() {
        return food_Bigtype;
    }

    public String getFood_type() {
        return food_type;
    }

    public int getSize() {
        return size;
    }

    public double getKcal() {
        return kcal;
    }

    public double getMoisture() {
        return moisture;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public double getSugars() {
        return sugars;
    }

    public double getDietary_Fiber() {
        return Dietary_Fiber;
    }

    public double getCalcium() {
        return calcium;
    }

    public double getSalt() {
        return salt;
    }

    public double getVitamin() {
        return vitamin;
    }

    @Override
    public String toString() {
        return "food_data{" +
                "id=" + id +
                ", food_name='" + food_name + '\'' +
                ", food_Bigtype='" + food_Bigtype + '\'' +
                ", food_type='" + food_type + '\'' +
                ", size='" + size + '\'' +
                ", kcal='" + kcal + '\'' +
                ", moisture='" + moisture + '\'' +
                ", protein='" + protein + '\'' +
                ", fat='" + fat + '\'' +
                ", carbohydrate='" + carbohydrate + '\'' +
                ", sugars='" + sugars + '\'' +
                ", Dietary_Fiber='" + Dietary_Fiber + '\'' +
                ", calcium='" + calcium + '\'' +
                ", salt='" + salt + '\'' +
                ", vitamin='" + vitamin + '\'' +
                '}';
    }
    @Builder
    public food_data(Long id, String food_name, String food_Bigtype, String food_type, int size, double kcal, double moisture, double protein, double fat, double carbohydrate, double sugars, double dietary_Fiber, double calcium, double salt, double vitamin) {
        this.id = id;
        this.food_name = food_name;
        this.food_Bigtype = food_Bigtype;
        this.food_type = food_type;
        this.size = size;
        this.kcal = kcal;
        this.moisture = moisture;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.sugars = sugars;
        this.Dietary_Fiber = dietary_Fiber;
        this.calcium = calcium;
        this.salt = salt;
        this.vitamin = vitamin;
    }
}


