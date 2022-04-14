package esercitazioni.vehicle.repository;


import esercitazioni.vehicle.domain.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {


    List<Vehicle> findByBrand(String brand);
}
