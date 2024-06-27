package guru.framework.msscbeerinventoryservice.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.framework.msscbeerinventoryservice.domain.BeerInventory;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

    List<BeerInventory> findAllByBeerId(UUID beerId);

	List<BeerInventory> findAllByUpc(String upc);
}