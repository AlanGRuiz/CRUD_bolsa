package controllers;

import entity.Bicycle;
import org.springframework.web.bind.annotation.*;
import services.IBicycleService;

import java.util.List;

@RestController
public class BicycleController{

    final
    IBicycleService bicycleService;

    public BicycleController(IBicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }

    @GetMapping("/bicycles")
    public List<Bicycle> getAllBicycles(){
        return bicycleService.getAll();
    }

    @GetMapping("/bicycle/{id}")
    public Bicycle getOne(@PathVariable(value = "id") long id){
        return bicycleService.get(id);
    }

    @PostMapping("/bicycle")
    public void add(Bicycle bicycle){
        bicycleService.post(bicycle);
    }

    @PutMapping("/bicycle")
    public void update(Bicycle bicycle, Long id){
        bicycleService.put(bicycle, id);
    }
}