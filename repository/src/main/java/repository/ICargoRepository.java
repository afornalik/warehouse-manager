package repository;

import entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICargoRepository extends JpaRepository<Cargo, Long> {
}
