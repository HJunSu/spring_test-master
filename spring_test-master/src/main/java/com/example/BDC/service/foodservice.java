package com.example.BDC.service;

import com.example.BDC.dto.DataForm;
import com.example.BDC.entity.food_data;
import com.example.BDC.repository.DataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class foodservice {
    private DataRepository dataRepository;

    public foodservice (DataRepository dataRepository){
        this.dataRepository=dataRepository;
    }

    @Transactional
    public Long savePost(DataForm dataForm){
        return dataRepository.save(dataForm.toEntity()).getId();
    }
    @Transactional
    public List<DataForm> getDataList(){
        List<food_data> foodList = dataRepository.findAll();
        List<DataForm> foodDtoList = new ArrayList<>();

        for(food_data foodData : foodList){
            DataForm dataForm = DataForm.builder()
                    .id(foodData.getId())
                    .food_name(foodData.getFood_name())
                    .food_Bigtype(foodData.getFood_Bigtype())
                    .food_type(foodData.getFood_type())
                    .size(foodData.getSize())
                    .kcal(foodData.getKcal())
                    .moisture(foodData.getMoisture())
                    .protein(foodData.getProtein())
                    .fat(foodData.getFat())
                    .carbohydrate(foodData.getCarbohydrate())
                    .sugars(foodData.getSugars())
                    .dietary_Fiber(foodData.getDietary_Fiber())
                    .calcium(foodData.getCalcium())
                    .salt(foodData.getSalt())
                    .vitamin(foodData.getVitamin())
                    .build();
            foodDtoList.add(dataForm);

        }
        return foodDtoList;

    }
}

