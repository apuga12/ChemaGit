package ms.izzi.legacyPortalsServices.repository;

import java.util.List;

import ms.izzi.legacyPortalsServices.model.TtcGuiaCanalesLegacy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TtcGuiaCanalesLegacyRepository extends PagingAndSortingRepository<TtcGuiaCanalesLegacy, Long>{
	
	//TtcGuiaCanalesLegacy findByTtcGuiaCanalesLegacy(Integer id);
	//Collection<TtcGuiaCanalesLegacy> findByTtcGuiaCanalesLegacy(Integer id);
	
//	public List<TtcGuiaCanalesLegacy> getGuiaCanales(String empresa, String ciudad, String paquete) {
//    	logger.info(" ===> *** Ingreso a ==> JPASeriesDao.getGuiaCanales(Lista de guía de canales)");
//        //return em.createQuery("select p from Series p order by p.id").getResultList();
//    	String eligePaquete = (paquete.equals("basico"))?"basico":"miniBasico";
//    	
//    	//if(eligePaquete.equals("basico")){
//    		return em.createQuery("SELECT c FROM TtcGuiaCanalesLegacy c WHERE c.msoEmpresa = :msoEmpresa "
//    			+ "AND c.ciudad = :ciudad AND c.flagMiniBasico = 'X' ")
//    			.setParameter("msoEmpresa", empresa)
//    			.setParameter("ciudad", ciudad)
//    			.getResultList();
//	}
//	
	//@Query("SELECT c FROM TtcGuiaCanalesLegacy c WHERE c.msoEmpresa = :msoEmpresa AND c.ciudad = :ciudad AND c.flagMiniBasico = 'X' ")
	//public List<TtcGuiaCanalesLegacy> getGuiaCanales(@Param("msoEmpresa") String empresa, @Param("ciudad") String ciudad );
	
	@Query("FROM TtcGuiaCanalesLegacy c WHERE c.msoEmpresa = ?1 AND c.ciudad = ?2 AND c.flagMiniBasico = 'X' ")
	public List<TtcGuiaCanalesLegacy> getGuiaCanalesMiniBasico(String empresa, String ciudad );
	
	@Query("FROM TtcGuiaCanalesLegacy c WHERE c.msoEmpresa = ?1 AND c.ciudad = ?2 AND c.flagBasico = 'X' ")
	public List<TtcGuiaCanalesLegacy> getGuiaCanalesBasico(String empresa, String ciudad );
	

}
	
	
