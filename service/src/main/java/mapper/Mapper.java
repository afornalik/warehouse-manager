package mapper;


public interface Mapper<D,E> {

    E convertDtoToEntity (D d);

    D convertEntityToDto (E e);
}
