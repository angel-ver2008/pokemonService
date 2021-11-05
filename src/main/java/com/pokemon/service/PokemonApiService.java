package com.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pokemon.model.Pokemon;

@Service
public class PokemonApiService {
	
	@Autowired
	RestTemplate template;

	
	private final String API_URL = "https://pokeapi.co/api/v2/pokemon/";
	
	public Pokemon  getPokemonFromApi(String pokemonName) {		
		Pokemon pokemon = new Pokemon();
		pokemon = template.getForObject(API_URL + pokemonName, Pokemon.class);		
		return pokemon;
	}
}
