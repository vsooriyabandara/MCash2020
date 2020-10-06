package lk.mobitel.mcash.repository;

import org.springframework.data.repository.CrudRepository;
import lk.mobitel.mcash.model.Wallet;

public interface MCashRepository extends CrudRepository<Wallet,Long> {

}
