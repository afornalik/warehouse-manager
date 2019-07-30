package repository;

import entity.PalletRack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPalletRackRepository extends JpaRepository<PalletRack,Long> {
}
