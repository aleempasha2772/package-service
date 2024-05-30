package com.example.package_service.Repository;

import com.example.package_service.Model.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository<Recipient,Long> {
}
