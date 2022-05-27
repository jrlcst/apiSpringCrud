package github.com.jrlcst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.com.jrlcst.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
}
