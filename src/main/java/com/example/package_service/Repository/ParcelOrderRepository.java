package com.example.package_service.Repository;

import com.example.package_service.Model.ParcelOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelOrderRepository extends JpaRepository<ParcelOrder,Long> {
}
