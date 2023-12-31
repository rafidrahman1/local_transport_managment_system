package com.ltms.ltms.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusModel {
    private Long id;
    private String name;
    private Double price;
    private String route;
}
