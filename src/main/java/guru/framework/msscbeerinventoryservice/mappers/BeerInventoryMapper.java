package guru.framework.msscbeerinventoryservice.mappers;

import org.mapstruct.Mapper;

import guru.framework.msscbeerinventoryservice.domain.BeerInventory;
import guru.framework.msscbeerinventoryservice.web.model.BeerInventoryDto;

@Mapper(uses= {DateMapper.class})
public interface BeerInventoryMapper {
	BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
