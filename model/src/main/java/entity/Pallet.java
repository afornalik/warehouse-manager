package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pallet")
public class Pallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pallet")
    private Long idPallet;

    @Column(name = "location_row",nullable = false, length = 5)
    private Integer locationRow;

    @Column(name = "location_column",nullable = false, length = 5)
    private Integer locationColumn;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "rack_id",nullable = false)
    private PalletRack rack;

    @OneToMany(mappedBy = "pallet")
    private Set<Cargo> cargos;





}
