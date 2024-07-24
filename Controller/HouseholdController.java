package com.dk.staj.Controller;
import com.dk.staj.Repository.HouseholdRepository;
import com.dk.staj.Entity.Household;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/households")
public class HouseholdController {

    @Autowired
    private HouseholdRepository householdRepository;

    @GetMapping("/{hh_id}")
    public Household getHouseholdById(@PathVariable("hh_id") String hhId) {
        System.out.println("HH_ID: " + hhId);
        return householdRepository.findHouseholdById(hhId);
    }


}


