package ms.izzi.legacyPortalsServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class LegacyPortalsServicesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LegacyPortalsServicesApplication.class, args);
	}	
}

/*
// TEST Query
@Component
class TtcGuiaCanalesLegacyCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		for(TtcGuiaCanalesLegacy gc: this.ttcGuiaCanalesLegacyRepository.findAll()){
			System.out.println(gc.toString());
		}
					
	}
	
	@Autowired TtcGuiaCanalesLegacyRepository ttcGuiaCanalesLegacyRepository;
	
}
*/
