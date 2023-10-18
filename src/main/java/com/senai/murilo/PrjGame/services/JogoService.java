package com.senai.murilo.PrjGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.murilo.PrjGame.entities.Jogo;
import com.senai.murilo.PrjGame.repositories.JogoRepository;
@Service
public class JogoService {
	
	private final JogoRepository jogoRepository;
	@Autowired
	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	public Jogo saveJogo (Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	public Jogo getJogoById (Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	public List<Jogo> getAlljogo() {
		return jogoRepository.findAll();
	}
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}

}
