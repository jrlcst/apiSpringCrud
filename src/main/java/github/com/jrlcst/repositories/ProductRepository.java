package github.com.jrlcst.repositories;

import github.com.jrlcst.entities.Product;
import github.com.jrlcst.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
