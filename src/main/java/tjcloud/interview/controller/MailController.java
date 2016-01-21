package tjcloud.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tjcloud.interview.Repositories.UserRepository;
import tjcloud.interview.models.InterviewUser;

@RestController
@RequestMapping("/mail")
public class MailController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/{id}")
	public InterviewUser getByEmail(@PathVariable("id") String email) {
    
      InterviewUser user = userRepository.findByEmail(email);
      return user;
	}
	
  }