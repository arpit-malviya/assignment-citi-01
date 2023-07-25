package com.hashedin.assignmentcitibank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "name")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    String firstName;
    String middleName;
    String lastName;
}
