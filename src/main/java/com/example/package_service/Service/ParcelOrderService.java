package com.example.package_service.Service;


import com.example.package_service.GlobalExceptionHandler;
import com.example.package_service.Model.ParcelOrder;
import com.example.package_service.Repository.ParcelOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelOrderService {

    @Autowired
    private ParcelOrderRepository parcelOrderRepository;

    ParcelOrder GlobalExceptionHandler = new ParcelOrder();

    public ParcelOrder createParcelOrder(ParcelOrder parcelOrder){
        if (parcelOrder!=null){
            return parcelOrderRepository.save(parcelOrder);
        }
        else {
            return GlobalExceptionHandler;
        }
    }

    public List<ParcelOrder> getAllParcelOrders(){
        return parcelOrderRepository.findAll();
    }

}
