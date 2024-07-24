package com.dk.staj.Service;
import com.dk.staj.Entity.Household;
import com.dk.staj.Repository.HouseholdRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseholdService {

    private final HouseholdRepositoryImpl householdRepositoryImpl;

    @Autowired
    public HouseholdService(HouseholdRepositoryImpl householdRepositoryImpl) {
        this.householdRepositoryImpl = householdRepositoryImpl;
    }

    public Household getHouseholdById(String hhId) {
        return householdRepositoryImpl.getHouseholdById(hhId);
    }
}
