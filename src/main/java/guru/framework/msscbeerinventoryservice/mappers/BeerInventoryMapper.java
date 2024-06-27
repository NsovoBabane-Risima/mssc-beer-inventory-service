package guru.framework.msscbeerinventoryservice.mappers;

import org.mapstruct.Mapper;

import guru.framework.msscbeerinventoryservice.domain.BeerInventory;
import guru.springframework.brewery.model.BeerInventoryDto;

@Mapper(uses= {DateMapper.class})
public interface BeerInventoryMapper {
	BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
