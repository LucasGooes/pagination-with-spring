package com.teste.pagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teste.pagination.model.Produto;
import com.teste.pagination.service.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/listar")
	public String pegarPaginaInicial(Model model) {	
		List<Produto> produtos = service.getAll();
		System.out.println(produtos.size());
		for (Produto produto : produtos) {
			System.out.println(produto.getDtcadastro());
		}
		return "home";
	}
	
	@GetMapping("/listar/slice")
	public String getPageSlice(Model model,@SortDefault(sort = "dtcadastro", direction = Direction.DESC) Pageable pageable) {
		Slice<Produto> produtos= service.findAllSlice(pageable);
		for (Produto produto : produtos) {
			System.out.println("dtcadastro: "+produto.getDtcadastro());
			System.out.println("codprod: "+produto.getCodprod());
		}
		model.addAttribute("produtos", produtos);
		return "home";
	}
	
	@GetMapping("/listar/page")
	public String getPage(@PageableDefault(page = 0, size = 100) @SortDefault(sort = "dtcadastro", direction = Direction.DESC) Pageable pageable) {
		Page<Produto> pagina = service.findAllPage(pageable);
		for (Produto produto : pagina) {
			System.out.println("dtcadastro: "+produto.getDtcadastro());
			System.out.println("codprod: "+produto.getCodprod());
		}
		return "home";
	}

}
