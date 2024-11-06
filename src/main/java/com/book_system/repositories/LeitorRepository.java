package com.book_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book_system.entities.Leitor;

@Repository
public interface LeitorRepository extends JpaRepository<Leitor, Long> {

}
