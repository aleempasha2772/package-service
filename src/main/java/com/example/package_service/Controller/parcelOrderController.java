package com.example.package_service.Controller;


import com.example.package_service.Model.ParcelOrder;
import com.example.package_service.Model.PaymentRequest;
import com.example.package_service.Service.ParcelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parcels")
public class parcelOrderController {

    @Autowired
    private ParcelOrderService parcelOrderService;

    @PostMapping
    ResponseEntity<ParcelOrder> createParcelOrder(@RequestBody ParcelOrder parcelOrder){

        return ResponseEntity.ok().body(parcelOrderService.createParcelOrder(parcelOrder));
    }

    @GetMapping
    ResponseEntity<List<ParcelOrder>> getAllParcelOrders(){
        return ResponseEntity.ok().body(parcelOrderService.getAllParcelOrders());
    }

    @GetMapping("/payment-action")
    ResponseEntity<PaymentRequest> getPaymentAction(){
        return ResponseEntity.ok().body(parcelOrderService.calculateParcelPrice());
    }
}
