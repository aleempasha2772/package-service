package com.example.package_service.Repository;

import com.example.package_service.Model.Sender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenderRepository extends JpaRepository<Sender,Long> {
}
