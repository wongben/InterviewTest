package tjcloud.interview.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tjcloud.interview.models.InterviewUser;

@Repository
public interface UserRepository extends JpaRepository<InterviewUser, Integer> {
  public InterviewUser findByEmail(String email);
  
	@Query(value = "select IFNULL(sum(amount),0) from T_TRANS where  user_id = :userId and  is_paid = 1 and operator <> 'Invoice'", nativeQuery = true)
	public Integer getTransactionTotalAmountByUserID(@Param("userId") Integer userId);
} 
