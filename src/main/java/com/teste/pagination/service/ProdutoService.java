package com.teste.pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import com.teste.pagination.model.Produto;
import com.teste.pagination.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	public List<Produto> getAll() {
		return repo.findAll();
	}
	
	public Slice<Produto> findAllSlice(Pageable pageable) {
		System.out.println("Número da página: "+pageable.getPageNumber());
		System.out.println("Tamanho da página: "+pageable.getPageSize());
		System.out.println("Sort: "+pageable.getSort());
		return repo.findAllSlice(pageable);
	}
	
	public Page<Produto> findAllPage(Pageable pageable) {
		System.out.println("Número da página: "+pageable.getPageNumber());
		System.out.println("Tamanho da página: "+pageable.getPageSize());
		System.out.println("Sort: "+pageable.getSort());
		return repo.findAllPage(pageable);
	}
	

}
