package tjcloud.interview.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tjcloud.interview.models.InterviewUser;

/**
 * 示例Repository层
 * @author Thinkpad
 *
 */
@Repository
public interface UserRepository extends JpaRepository<InterviewUser, Integer> {
  public InterviewUser findByEmail(String email);
  
	@Query(value = "from InterviewUser where name = :inputName", nativeQuery = true)
	public InterviewUser getInterviewUserByInputName(@Param("inputName") Integer userId);
} 
