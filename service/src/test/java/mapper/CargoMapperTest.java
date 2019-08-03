package mapper;



import dto.CargoDto;
import entity.Cargo;
import entity.CargoKind;
import entity.Pallet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import repository.ICargoKindRepository;
import repository.IPalletRepository;


@RunWith(SpringJUnit4ClassRunner.class)

@WebAppConfiguration
@Ignore
public class CargoMapperTest {


    private CargoDto cargoDto;

    @Autowired
    private CargoMapper cargoMapper;

    @InjectMocks
    IPalletRepository palletRepository;

    @InjectMocks
    ICargoKindRepository cargoKindRepository;

    @Before
    public void  init() {


    }



    @Test
    public void shouldConvertDtoToEntity() {

        //given
        cargoDto = new CargoDto("32","somename","300","4","3");
        Mockito.doReturn(Pallet.class).when(palletRepository).findById(4l);
        Mockito.doReturn(CargoKind.class).when(cargoKindRepository).findByName("somename");

        //when
        Cargo cargo = cargoMapper.convertDtoToEntity(cargoDto);

        //than
        Assert.assertEquals(java.util.Optional.ofNullable(cargo.getIdCargo()),32l);

    }

}