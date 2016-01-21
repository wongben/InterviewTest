package tjcloud.interview.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tjcloud.interview.models.Stadium;

public interface StadiumRepository extends JpaRepository<Stadium, Integer> {

	public Stadium findByStadiumId(Integer id);

	@Query(value = "FROM Stadium WHERE (bdGPSX between :minX and :maxX) and (bdGPSY between :minY and :maxY) ")
	public List<Stadium> getStadiumListByLocation(@Param("minX") Double minX ,@Param("maxX") Double maxX,
			@Param("minY") Double minY ,@Param("maxY") Double maxY);
}
