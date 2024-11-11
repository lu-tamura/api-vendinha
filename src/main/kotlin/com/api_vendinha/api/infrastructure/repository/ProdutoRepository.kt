package com.api_vendinha.api.infrastructure.repository

import com.api_vendinha.api.domain.entities.Produto
import org.springframework.data.repository.CrudRepository

interface ProdutoRepository : CrudRepository<Produto, Long>
