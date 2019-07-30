package repository;

import entity.CargoKind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICargoKindRepository extends JpaRepository<CargoKind,Long> {
}
