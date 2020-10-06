package lk.mobitel.mcash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Wallet {
	@Id
	private long mobileno;
	@Column
	private double amount;
	@Column
	private int pin;
	
	

}
