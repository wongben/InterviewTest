package tjcloud.interview.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tjcloud.interview.models.Stadium;

public interface StadiumRepository extends JpaRepository<Stadium, Integer> {

	//TODO:可在下列增加你需要的方法
}
