package com.pokemon.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pokemon.model.Pokemon;
import com.pokemon.service.PokemonApiService;
import com.pokemon.webservice.AbilitiesRequest;
import com.pokemon.webservice.AbilitiesResponse;
import com.pokemon.webservice.BaseExperienceRequest;
import com.pokemon.webservice.BaseExperienceResponse;
import com.pokemon.webservice.HeldItemsRequest;
import com.pokemon.webservice.HeldItemsResponse;
import com.pokemon.webservice.IdRequest;
import com.pokemon.webservice.IdResponse;
import com.pokemon.webservice.LocationAreaEncountersRequest;
import com.pokemon.webservice.LocationAreaEncountersResponse;
import com.pokemon.webservice.NameRequest;
import com.pokemon.webservice.NameResponse;
import com.pokemon.webservice.PokemonAbility;
import com.pokemon.webservice.PokemonHeldItem;


@Endpoint
public class PokemonEndpoint {
	
	
	@Autowired
	private PokemonApiService apiService;
	
	private static final String NAMESPACE = "http://pokemon.com/webservice";
	
			@PayloadRoot(namespace = NAMESPACE, localPart = "abilitiesRequest")
			@ResponsePayload
			public AbilitiesResponse getAbility(@RequestPayload AbilitiesRequest request) {				
				Pokemon pokemon = new Pokemon();
				AbilitiesResponse abilities = new AbilitiesResponse();				
				pokemon = apiService.getPokemonFromApi(request.getPokemon());				
				if(pokemon.getAbilities().size() > 0) {
					for(PokemonAbility pok : pokemon.getAbilities()) {
						abilities.getAbilities().add(pok);
					}
				}				
				return abilities;
			}
			
			@PayloadRoot(namespace = NAMESPACE, localPart = "base_experienceRequest")
			@ResponsePayload
			public BaseExperienceResponse getBaseExperience(@RequestPayload BaseExperienceRequest request) {				
				Pokemon pokemon = new Pokemon();
				BaseExperienceResponse response = new BaseExperienceResponse();				
				pokemon = apiService.getPokemonFromApi(request.getPokemon());
				
				if(pokemon.getBase_experience() > 0) {
					response.setBaseExperience(pokemon.getBase_experience());
				}				
				return response;
			}
			
			@PayloadRoot(namespace = NAMESPACE, localPart = "held_itemsRequest")
			@ResponsePayload
			public HeldItemsResponse getHeldItems(@RequestPayload HeldItemsRequest request) {				
				Pokemon pokemon = new Pokemon();
				HeldItemsResponse heldItems = new HeldItemsResponse();
				pokemon = apiService.getPokemonFromApi(request.getPokemon());
				
				if(pokemon.getHeldItems().size() > 0) {
					for(PokemonHeldItem phi : pokemon.getHeldItems()) {
						heldItems.getHeldItems().add(phi);
					}
				}				
				return heldItems;
			}
			
			@PayloadRoot(namespace = NAMESPACE, localPart = "idRequest")
			@ResponsePayload
			public IdResponse getId(@RequestPayload IdRequest request) {				
				Pokemon pokemon = new Pokemon();
				IdResponse response = new IdResponse();				
				pokemon = apiService.getPokemonFromApi(request.getPokemon());				
				response.setId(pokemon.getId());				
				return response;
			}
			
			@PayloadRoot(namespace = NAMESPACE, localPart = "nameRequest")
			@ResponsePayload
			public NameResponse getName(@RequestPayload NameRequest request) {				
				Pokemon pokemon = new Pokemon();
				NameResponse response = new NameResponse();				
				pokemon = apiService.getPokemonFromApi(request.getPokemon());				
				response.setName(pokemon.getName());				
				return response;
			}
			
			@PayloadRoot(namespace = NAMESPACE, localPart = "location_area_encountersRequest")
			@ResponsePayload
			public LocationAreaEncountersResponse getLocationAreaEncounters(@RequestPayload LocationAreaEncountersRequest request) {				
				Pokemon pokemon = new Pokemon();
				LocationAreaEncountersResponse response = new LocationAreaEncountersResponse();				
				pokemon = apiService.getPokemonFromApi(request.getPokemon());				
				response.setLocationAreaEncounters(pokemon.getLocation_area_encounters());				
				return response;
			}

}
