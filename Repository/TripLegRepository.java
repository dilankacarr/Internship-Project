package com.dk.staj.Repository;

import com.dk.staj.Entity.Profile;
import com.dk.staj.Entity.TripLeg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripLegRepository extends JpaRepository<TripLeg, String>{
    TripLeg findTripLegById(String id);
    List<TripLeg> findTripLegsByHhIdAndProfileId(String hhId, String pId);
}
