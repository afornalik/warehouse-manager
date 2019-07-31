package mapper;

import dto.CargoDto;
import entity.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.ICargoKindRepository;
import repository.ICargoRepository;
import repository.IPalletRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class CargoMapper implements Mapper<CargoDto, Cargo> {


    private final ICargoRepository cargoRepository;

    private final IPalletRepository palletRepository;

    private final ICargoKindRepository cargoKindRepository;

    @Autowired
    public CargoMapper(ICargoRepository cargoRepository, IPalletRepository palletRepository, ICargoKindRepository cargoKindRepository) {
        this.cargoRepository = cargoRepository;
        this.palletRepository = palletRepository;
        this.cargoKindRepository = cargoKindRepository;
    }

    @Override
    public Cargo convertDtoToEntity(CargoDto cargoDto) {
        Optional<Cargo> cargo = cargoRepository.findById((Long.parseLong(cargoDto.getId())));
        if(cargo.isPresent()){
            cargo.get().setQuantity(Long.parseLong(cargoDto.getQuantity()));
            cargo.get().setUpdateDate(LocalDateTime.now());
            cargo.get().setPallet(palletRepository.findById(Long.parseLong(cargoDto.getPalletId())).get());
            cargo.get().setCargoKind(cargoKindRepository.findByName(cargoDto.getName()));


        }
        return null;
    }

    @Override
    public CargoDto convertEntityToDto(Cargo cargo) {
        return null;
    }
}
