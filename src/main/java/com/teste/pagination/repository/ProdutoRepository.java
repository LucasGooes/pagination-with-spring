package com.teste.pagination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teste.pagination.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	@Query("select p from Produto p where p.dtexclusao is null"
			+ " and exists(select e from Estoque e where e.id.codprod = p.codprod and e.dtultent is not null)")
	Slice<Produto> findAllSlice(Pageable pageable);
	
	@Query("select p from Produto p where p.dtexclusao is null"
			+ " and exists(select e from Estoque e where e.id.codprod = p.codprod and e.dtultent is not null)")
	Page<Produto> findAllPage(Pageable pageable);

}
