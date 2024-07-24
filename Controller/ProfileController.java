package com.dk.staj.Controller;
import com.dk.staj.Entity.Profile;
import com.dk.staj.Repository.ProfileRepository;
import com.dk.staj.Repository.TripLegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private TripLegRepository tripLegRepository;


    @GetMapping("/{hh_id}")
    public ResponseEntity<Profile> getProfilesByHouseholdId(@PathVariable String hh_id) {
        Profile profile = profileRepository.findProfileById(hh_id);
        if (profile != null) {
            return ResponseEntity.ok(profile);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}