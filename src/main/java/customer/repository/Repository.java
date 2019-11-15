package customer.repository;

import java.util.List;

public interface Repository<E> {
    List<E> findALl();

    E findById(Long id);

    void save(E model);

    void remove(Long id);
}
