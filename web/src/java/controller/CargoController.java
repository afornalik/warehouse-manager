package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.ICargoService;

@RestController
public class CargoController {


    private final ICargoService cargoService;

    @Autowired
    public CargoController(ICargoService cargoService) {
        this.cargoService = cargoService;
    }

    @RequestMapping(value = "/cargo/getall",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity getAllCargo(){
        try {
            return new ResponseEntity(cargoService.getAllCargo(), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
