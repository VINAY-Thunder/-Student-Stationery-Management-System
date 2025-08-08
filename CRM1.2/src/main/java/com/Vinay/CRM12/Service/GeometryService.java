package com.Vinay.CRM12.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vinay.CRM12.Model.GeometryBoxSale;
import com.Vinay.CRM12.Repository.IgeometryRepository;

@Service
public class GeometryService implements Iservice{

	private IgeometryRepository repo;
	
	@Autowired
	public void setRepo(IgeometryRepository repo) {
		this.repo = repo; 
	}

	@Override
	public GeometryBoxSale registerGeometry(GeometryBoxSale geometry) {
		System.out.println("Data is added with"+geometry.getBrand());
		return repo.save(geometry);
	}

	@Override
	public void Removegeometry(Long id) {
	System.out.println("deleted with this ID "+id);
		repo.deleteById(id);	
	}

	@Override
	public Iterable<GeometryBoxSale> FindAllGeometry() {
	List<GeometryBoxSale>geoinfo = repo.findAll();
//	geoinfo.forEach(v->System.out.println(v));
	System.out.println("YES info is displayed");
		return geoinfo;
	}

	@Override
	public GeometryBoxSale fetchCustomerById(Long id) {
		Optional<GeometryBoxSale> ids = repo.findById(id);
		if(ids.isPresent()==true)
			System.out.println("id is present with ID"+id);
		return ids.get();
	}
	
	
}
