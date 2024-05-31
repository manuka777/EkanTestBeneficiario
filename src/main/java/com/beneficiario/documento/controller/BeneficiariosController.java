package com.beneficiario.documento.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.beneficiario.documento.repository.BeneficiarioRepository;
import com.beneficiario.documento.vo.BeneficiarioVO;
import com.beneficiario.documento.vo.DocumentoVO;

@RestController
@RequestMapping("/beneficiario")
public class BeneficiariosController {	
	
	  @Autowired
	  private BeneficiarioRepository repository;
	  
	  @ResponseStatus(HttpStatus.CREATED)
	  @PostMapping("/cadastrar")
	  public BeneficiarioVO cadastrar(@RequestBody BeneficiarioVO beneficiario) {
		  return repository.save(beneficiario);
	  }
	  
	  @ResponseStatus(HttpStatus.OK)
	  @GetMapping("/listar/{id}")
	  public Optional<BeneficiarioVO> listar(@PathVariable Long id) {
		  return repository.findById(id);
	  }
	  
	  @ResponseStatus(HttpStatus.OK)
	  @GetMapping("/listaDoctos/{id}")
	  public List<DocumentoVO> listaDoctos(@PathVariable Long id) {
		  List<DocumentoVO> listaDocto = repository.findById(id).get().getDocumentos();
		  return listaDocto;
	  }
	  
	  @GetMapping("/listarAll")
	  public List<BeneficiarioVO> listarAll() {
	      return repository.findAll();
	  }
	  
	  @ResponseStatus(HttpStatus.OK)
	  @PutMapping("/atualizar")
	  public BeneficiarioVO atualizar(@RequestBody BeneficiarioVO beneficiario) {
		  return repository.save(beneficiario);
	  }
	  
	  @ResponseStatus(HttpStatus.NO_CONTENT)
	  @DeleteMapping("/remover/{id}")
	  public void remover(@PathVariable("id") Long id){
		  System.out.println("id"+id);
		  repository.deleteById(id);
	  }
}