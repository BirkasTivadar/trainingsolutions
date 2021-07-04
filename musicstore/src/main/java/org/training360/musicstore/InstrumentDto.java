package org.training360.musicstore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstrumentDto {

    private Long id;

    private String brand;

    private InstrumentType type;

    private Integer price;

    private LocalDate postDate;
}
