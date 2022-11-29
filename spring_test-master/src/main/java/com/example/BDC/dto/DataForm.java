package com.example.BDC.dto;

import com.example.BDC.entity.food_data;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class DataForm {

    private static Long id;
    private static String food_name;
    private static String food_Bigtype;
    private static String food_type;
    private static int size;
    private static double kcal;
    private static double moisture;
    private static double protein;
    private static double fat;
    private static double carbohydrate;
    private static double sugars;
    private static double Dietary_Fiber;
    private static double calcium;
    private static double salt;
    private static double vitamin;

    public food_data toEntity (){
        food_data foodData=food_data.builder()
                .id(id)
                .food_name(food_name)
                .food_type(food_type)
                .food_Bigtype(food_Bigtype)
                .size(size)
                .kcal(kcal)
                .moisture(moisture)
                .protein(protein)
                .fat(fat)
                .carbohydrate(carbohydrate)
                .sugars(sugars)
                .Dietary_Fiber(Dietary_Fiber)
                .calcium(calcium)
                .salt(salt)
                .vitamin(vitamin).build();
        return foodData;
    }
    @Builder
    public DataForm(Long id, String food_name, String food_Bigtype, String food_type, int size, double kcal, double moisture, double protein, double fat, double carbohydrate, double sugars, double dietary_Fiber, double calcium, double salt, double vitamin) {
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
