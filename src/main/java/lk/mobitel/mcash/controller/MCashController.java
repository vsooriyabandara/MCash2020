package lk.mobitel.mcash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lk.mobitel.mcash.model.Wallet;
import lk.mobitel.mcash.repository.MCashRepository;
import lk.mobitel.mcash.response.MCashResponse;
import lk.mobitel.mcash.service.MCashService;

@RestController
public class MCashController {
	@Autowired
	MCashService  mCashService;
	
	

}
