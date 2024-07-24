package com.dk.staj.Repository;

import com.dk.staj.Entity.Profile;
import com.dk.staj.Entity.TripLeg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
   Profile findProfileById(String id);
}
