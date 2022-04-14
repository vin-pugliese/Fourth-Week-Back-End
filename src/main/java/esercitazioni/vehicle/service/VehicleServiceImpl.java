package esercitazioni.vehicle.service;

import esercitazioni.vehicle.domain.Vehicle;
import esercitazioni.vehicle.repository.VehicleRepository;


import esercitazioni.vehicle.service.api.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Optional<Vehicle> getById(String id) {
        return vehicleRepository.findById(id);
    }

   @Override
    public List<Vehicle> getByBrand(String brand) {
        return vehicleRepository.findByBrand(brand);
    }
}
