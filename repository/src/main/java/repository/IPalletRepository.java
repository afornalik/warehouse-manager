package repository;

import entity.Pallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPalletRepository extends JpaRepository<Pallet,Long> {
}
