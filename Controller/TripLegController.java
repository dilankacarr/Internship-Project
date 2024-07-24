package com.dk.staj.Controller;
import com.dk.staj.Entity.Profile;
import com.dk.staj.Entity.TripLeg;
import com.dk.staj.Repository.ProfileRepository;
import com.dk.staj.Repository.TripLegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip_leg")
public class TripLegController {
    @Autowired
    private TripLegRepository tripLegRepository;
    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/{hh_id}")
    public ResponseEntity<TripLeg>  getTripLegsByHouseholdId(@PathVariable String hh_id) {
        TripLeg  tripLegs =  tripLegRepository.findTripLegById(hh_id);
        if (tripLegs!=null) {
            return ResponseEntity.ok(tripLegs);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{trip_leg}")
    public ResponseEntity<TripLeg> getTripLegsByProfile(@PathVariable String trip_leg){
        TripLeg tripLegs=tripLegRepository.findTripLegById(trip_leg);
        if (tripLegs!=null) {
            return ResponseEntity.ok(tripLegs);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/filter/{household_id}/{person_id}")
    public ResponseEntity<List<TripLeg>> getTriplegByProfile(@PathVariable String household_id,
                                                       @PathVariable String person_id){
        List<TripLeg> tripLegs = tripLegRepository.findTripLegsByHhIdAndProfileId(household_id, person_id);
        if (tripLegs != null) {
            return ResponseEntity.ok(tripLegs);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


