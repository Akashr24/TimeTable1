package pkg1.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeTable1Controller {
	@Autowired
	TimeTable1Repo ttr1;
	@GetMapping("/TimeTable1/getAll")
	public List<TimeTable1Entity> getTimeTable(){
		return ttr1.findAll();
	}
	@PostMapping("/TimeTable1/add")
	public String addToTimeTable(@RequestBody TimeTable1Entity tte1) {
		ttr1.save(tte1);
		return "Success";
	}

}
