package github.com.jrlcst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.jrlcst.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
