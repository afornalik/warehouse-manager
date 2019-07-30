package repository;

import entity.Pallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPalletRepository extends JpaRepository<Pallet,Long> {
}
