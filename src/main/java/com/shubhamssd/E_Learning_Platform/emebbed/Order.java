package com.shubhamssd.E_Learning_Platform.emebbed;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_order")
public class Order {
    @EmbeddedId
    private OrderId id;
    private String orderInfo;
    private String anotherField;

}
