package github.com.jrlcst.repositories;

import github.com.jrlcst.entities.Category;
import github.com.jrlcst.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
}
