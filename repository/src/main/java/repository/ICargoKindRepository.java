package repository;

import entity.CargoKind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICargoKindRepository extends JpaRepository<CargoKind,Long> {
}
