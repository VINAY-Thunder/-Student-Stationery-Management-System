package com.Vinay.CRM12.Service;

import com.Vinay.CRM12.Model.GeometryBoxSale;

public interface Iservice {
	GeometryBoxSale registerGeometry(GeometryBoxSale geometry);
	void Removegeometry(Long id);
	Iterable<GeometryBoxSale> FindAllGeometry();
	GeometryBoxSale fetchCustomerById(Long id);
}
