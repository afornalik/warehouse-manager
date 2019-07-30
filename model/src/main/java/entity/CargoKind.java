package entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cargo_kind")
@Getter
@Setter
public class CargoKind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo_kind")
    private Long idCargoKind;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "carto_family", length = 50)
    private String cargoFamily;

    @Column(name="ean",length = 13)
    private Long ean;

    @Column(name="description")
    private String description;

    @Column(name = "quantity_in_package",length = 10)
    private Long quantityInPackage;

    @Column(name = "quantity_in_pallet",length = 10)
    private Long quantityInPallet;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "cargoKind")
    private Set<Cargo> cargos;


}
