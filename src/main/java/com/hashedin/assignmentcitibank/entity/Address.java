package com.hashedin.assignmentcitibank.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    int pinCode;
    String city;
}
