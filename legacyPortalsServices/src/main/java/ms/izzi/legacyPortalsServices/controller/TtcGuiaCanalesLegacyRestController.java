package ms.izzi.legacyPortalsServices.controller;

import java.util.ArrayList;
import java.util.List;

import ms.izzi.legacyPortalsServices.model.TtcGuiaCanalesLegacy;
import ms.izzi.legacyPortalsServices.repository.TtcGuiaCanalesLegacyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TtcGuiaCanalesLegacyRestController {
	
	/**
	 * Regresa la lista de las guías de canales
	 * handles /series
	 * @return Lista de todas las series
	 * */
	@RequestMapping(method = RequestMethod.GET, value="/queryGuiaCanales/{empresa}/{ciudad}/{paquete}")
			public ResponseEntity<List<TtcGuiaCanalesLegacy>> getGuiaCanales(@PathVariable String empresa, @PathVariable String ciudad, @PathVariable String paquete){
				List listaPaquetes = new ArrayList();
				if(paquete.equals("basico")){
					listaPaquetes = ttcGuiaCanalesLegacyRepository.getGuiaCanalesBasico(empresa, ciudad);
					if(listaPaquetes != null && listaPaquetes.size() > 0)
						return new ResponseEntity<List<TtcGuiaCanalesLegacy>>(listaPaquetes, HttpStatus.OK); 
					else
						return new ResponseEntity<List<TtcGuiaCanalesLegacy>>(HttpStatus.NOT_FOUND); 
				}else{
					listaPaquetes =  ttcGuiaCanalesLegacyRepository.getGuiaCanalesMiniBasico(empresa, ciudad);
					if(listaPaquetes != null && listaPaquetes.size() > 0)
						return new ResponseEntity<List<TtcGuiaCanalesLegacy>>(listaPaquetes, HttpStatus.OK);  // 200
					else
						return new ResponseEntity<List<TtcGuiaCanalesLegacy>>(HttpStatus.NOT_FOUND);  // 404
				}
			}
	
//	public List<TtcGuiaCanalesLegacy>getGuiaCanales(@PathVariable Integer id){
//		//return this.ttcGuiaCanalesLegacyRepository.findByTtcGuiaCanalesLegacy(id);
//		return this.ttcGuiaCanalesLegacyRepository.findAll();
//	}
	
	@RequestMapping("/")
	public String home(){
		return "Spring alive !";
	}
	
	@Autowired TtcGuiaCanalesLegacyRepository ttcGuiaCanalesLegacyRepository;

}
