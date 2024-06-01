package com.example.package_service.Service;


import com.example.package_service.GlobalExceptionHandler;
import com.example.package_service.Model.ParcelOrder;
import com.example.package_service.Model.PaymentRequest;
import com.example.package_service.Repository.ParcelOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelOrderService {

    @Autowired
    private ParcelOrderRepository parcelOrderRepository;

    Double price;
    ParcelOrder GlobalExceptionHandler = new ParcelOrder();

    ParcelOrder a;
    public ParcelOrder createParcelOrder( ParcelOrder parcelOrder){

        if(parcelOrder!= null) {
            a = parcelOrderRepository.save(parcelOrder);
            System.out.println(a);
            return parcelOrderRepository.save(a);
        }
        else {
            return GlobalExceptionHandler;
        }
    }


    public PaymentRequest calculateParcelPrice(){
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setId(a.getId());
        double Weight = a.getParcel().getWeight();
        double Price;
        if (Weight <= 1000){
            Price = Weight*1000;
        } else if (Weight >= 1000 && Weight<= 2000) {
            Price = Weight*1500;
        }
        else {
            Price = Weight *2000;
        }
        paymentRequest.setPrice(Price);
        System.out.println(Price);
        return paymentRequest;

    }

    public List<ParcelOrder> getAllParcelOrders(){
        return parcelOrderRepository.findAll();
    }

}
