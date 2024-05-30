package com.example.package_service.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Recipient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String contactNumber;
    private String email;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    public static class ParcelOrder {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @OneToOne(cascade = CascadeType.ALL)
        private Sender sender;

        @OneToOne(cascade = CascadeType.ALL)
        private Recipient recipient;

        @OneToOne(cascade = CascadeType.ALL)
        private Parcel parcel;

    //    @OneToOne(cascade = CascadeType.ALL)
    //    private Delivery delivery;
    //
    //    @OneToOne(cascade = CascadeType.ALL)
    //    private Payment payment;
    }
}
