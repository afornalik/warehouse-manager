package entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pallet_rack")
public class PalletRack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pallet_rack")
    private Long idPalletRack;

    @Column(name = "description",nullable = false)
    private String descirption;

    @Column(name = "rows",nullable = false,length = 5)
    private Integer rows;

    @Column(name = "columns",nullable = false,length = 5)
    private Integer columns;

    @OneToMany(mappedBy = "rack",fetch = FetchType.LAZY)
    private Set<Pallet> pallets;



}
