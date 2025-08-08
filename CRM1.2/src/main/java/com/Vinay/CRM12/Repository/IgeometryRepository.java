package com.Vinay.CRM12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Vinay.CRM12.Model.GeometryBoxSale;

@Repository
public interface IgeometryRepository extends JpaRepository<GeometryBoxSale, Long> {

}
