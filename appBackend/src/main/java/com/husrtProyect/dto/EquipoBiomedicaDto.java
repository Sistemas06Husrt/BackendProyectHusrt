package com.husrtProyect.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.husrtProyect.entity.EquipoBiomendica;

@Repository
public interface EquipoBiomedicaDto extends JpaRepository<EquipoBiomendica, Long> {

}
