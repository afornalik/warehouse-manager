package repository;

import entity.PalletRack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPalletRackRepository extends JpaRepository<PalletRack,Long> {
}
