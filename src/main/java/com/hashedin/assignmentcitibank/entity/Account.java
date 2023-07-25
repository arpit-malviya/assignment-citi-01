package com.hashedin.assignmentcitibank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    int balance;
}
