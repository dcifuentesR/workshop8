package edu.eci.controllers;

import edu.eci.models.Car;
import edu.eci.services.contracts.ICarServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.UUID;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	private ICarServices carServices;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getCar(){
        try {
        	return new ResponseEntity<>(carServices.);
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> createCar(@RequestBody Car car){
        throw new NotImplementedException();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> updateCar(@RequestBody Car car){
        throw new NotImplementedException();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> deleteCar(@RequestBody UUID id){
        throw new NotImplementedException();
    }
}
