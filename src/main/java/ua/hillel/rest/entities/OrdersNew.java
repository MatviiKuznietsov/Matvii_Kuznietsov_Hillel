
package ua.hillel.rest.entities;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
public class OrdersNew {

    private Integer id;
    private Integer petId;
    private Integer quantity;
    private String shipDate;
    private String status;
    private Boolean complete;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



}