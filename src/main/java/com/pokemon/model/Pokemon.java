package com.pokemon.model;

import java.util.List;

import com.pokemon.webservice.PokemonAbility;
import com.pokemon.webservice.PokemonHeldItem;

import lombok.Data;

@Data
public class Pokemon {
	
	private int id;
	private String name;
	private int base_experience;
	private String location_area_encounters;
	private List<PokemonAbility> abilities;
	private List<PokemonHeldItem> heldItems;
	
}
