package esercitazioni.vehicle.service.api;

import esercitazioni.vehicle.domain.Vehicle;


import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface VehicleService {

    List<Vehicle> findAll();

    Vehicle create(Vehicle vehicle);

    Optional<Vehicle> getById(String id);

    List<Vehicle> getByBrand(String brand);
}
