package com.example.package_service.Repository;

import com.example.package_service.Model.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<Parcel,Long> {
}
