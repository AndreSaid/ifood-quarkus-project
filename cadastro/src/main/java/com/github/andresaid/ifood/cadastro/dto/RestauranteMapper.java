package com.github.andresaid.ifood.cadastro.dto;

import org.mapstruct.Mapper;

import com.github.andresaid.ifood.cadastro.Restaurante;

@Mapper(componentModel = "cdi")
public interface RestauranteMapper {
	public Restaurante toRestaurante(AdicionarRestauranteDTO dto);
}
