package tjcloud.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tjcloud.interview.models.Stadium;
import tjcloud.interview.service.StadiumService;

@RestController
@RequestMapping("/stadium")
public class StadiumController {

	@Autowired
	private StadiumService stadiumService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Stadium> getStadiumList(
			@RequestParam(value = "lng", defaultValue = "121.47260290961", required =false) Double lng,
			@RequestParam(value = "lnt", defaultValue = "31.340836837682", required =false) Double lnt,
			@RequestParam(value = "radius") Double radius) {
		
		List<Stadium> rawList = stadiumService.getStadiumListByLocationRectangle(lng, lnt, radius);
		stadiumService.filtertStadiumListByCircle(rawList, lng, lnt, radius);
		List<Stadium> result = stadiumService.filtertStadiumListByCircle(rawList, lng, lnt, radius);
		//System.out.println(result.size());
		return result;

	}

}