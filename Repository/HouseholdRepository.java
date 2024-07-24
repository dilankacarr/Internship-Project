package com.dk.staj.Repository;

import com.dk.staj.Entity.Household;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseholdRepository extends JpaRepository<Household,String> {

    Household findHouseholdById(String id);

}
