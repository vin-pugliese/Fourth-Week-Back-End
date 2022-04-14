package esercitazioni.vehicle.controller;


import esercitazioni.vehicle.domain.Vehicle;
import esercitazioni.vehicle.service.api.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin//(origins = "http://localhost:4200")
@RequestMapping(path="/vehicle/v1")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping(path="/get")
    ResponseEntity<List<Vehicle>> findAll(){
        List<Vehicle> vehicles = vehicleService.findAll();
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    @PostMapping(path="/post")
    ResponseEntity<Vehicle> create(@RequestBody Vehicle vehicle) {
        Vehicle vehicle1 = vehicleService.create(vehicle);
        return new ResponseEntity<>(vehicle1, HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<Vehicle> getById(@RequestParam String id){
       Vehicle vehicle =  vehicleService.getById(id).get();
        return ResponseEntity.ok(vehicle);

    }

    @GetMapping("/bybrand")
    ResponseEntity<List<Vehicle>> getByBrand(@RequestParam String brand){
        List<Vehicle> vehicles =  vehicleService.getByBrand(brand);
        return new ResponseEntity<>(vehicles, HttpStatus.OK);

    }


}
