package com.project.Agriculturalinsurance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Agriculturalinsurance.model.ClaimOfficer;
import com.project.Agriculturalinsurance.repository.ClaimOfficerRepository;

@Service
public class ClaimOfficerServiceImpl implements ClaimOfficerService{
	private List<ClaimOfficer> claimOfficerList = new ArrayList<ClaimOfficer>();
    
    @Autowired
    private ClaimOfficerRepository claimOfficerRepository;
    
	@Override
	public ClaimOfficer findByOfficerId(String officerId) {
		for(ClaimOfficer claimOfficer : claimOfficerList) {
			if(claimOfficer.getOfficerId().equals(officerId)) {
				return claimOfficer;
			}
		}
		
		return null;
	}
	
	@Override
	public void getAllOfficers() {
		claimOfficerList = claimOfficerRepository.findAll();
	}

	@Override
	public boolean validateOfficer(String officerId, String password) {
		
		for(ClaimOfficer claimOfficer : claimOfficerList) {
			if(claimOfficer.getOfficerId().equals(officerId) && claimOfficer.getPassword().equals(password)) {
				return true;
			}
		}
		
		return false;
	}

}
