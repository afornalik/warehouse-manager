package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CargoDto {

    private String id;
    private String name;
    private String quantity;
    private String palletId;
    private String rackId;


}
