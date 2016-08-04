package Dao;


import Interfaces.InterfaceKardexCartera;
import Pojos.KardexCartera;

import org.hibernate.Query;
import org.hibernate.Session;

public class DaoKardexCartera implements InterfaceKardexCartera{

	@Override
	public void guardarCarteraBoveda(Session sesion, KardexCartera kardex)
			throws Exception {
		sesion.save(kardex);
		
	}

}
