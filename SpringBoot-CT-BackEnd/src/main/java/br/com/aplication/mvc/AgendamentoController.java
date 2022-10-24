package br.com.aplication.mvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api/v1/")
public class AgendamentoController {
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;

//Pegar todos os funcionarios
	@GetMapping("/agendamentos")
	public List<Agendamento> getAllAgendamentos() {
		return agendamentoRepository.findAll();
	}

//Pegar um funcionario usando seu ID
	@GetMapping("/agendamentos/{id}")
	public ResponseEntity<Agendamento> getAgendamentoById(@PathVariable Long id) {
		Agendamento agendamento = agendamentoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não exite agendamento com esse id : " + id));
		return ResponseEntity.ok(agendamento);
	}

//Criar um novo funcionario
	@PostMapping("/agendamentos")
	public Agendamento createAgendamento(@RequestBody Agendamento agendamento) {
		return agendamentoRepository.save(agendamento);
	}

//Alterar um funcionario
	@PutMapping("/agendamentos/{id}")
	public ResponseEntity<Agendamento> updateAgendamento(@PathVariable Long id,
			@RequestBody Agendamento agendamentoDetails) {
		Agendamento agendamento = agendamentoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não exite agendamento com esse id :" + id));
		agendamento.setOrigem(agendamentoDetails.getOrigem());
		agendamento.setDestino(agendamentoDetails.getDestino());
		agendamento.setDataIda(agendamentoDetails.getDataIda());
		agendamento.setDataVolta(agendamentoDetails.getDataVolta());
		agendamento.setQtdAdulto(agendamentoDetails.getQtdAdulto());
		agendamento.setQtdCrianca(agendamentoDetails.getQtdCrianca());
		agendamento.setClasse(agendamentoDetails.getClasse());
		
		Agendamento updatedAgendamento = agendamentoRepository.save(agendamento);
		return ResponseEntity.ok(updatedAgendamento);
	}

//Deletar um funcionario
	@DeleteMapping("/agendamentos/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAgendamento(@PathVariable Long id) {
		Agendamento agendamento = agendamentoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não exite agendamento com esse id :" + id));
		agendamentoRepository.delete(agendamento);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deletado", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
