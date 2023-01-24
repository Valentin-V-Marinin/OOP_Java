package repository;

import java.io.IOException;

public interface Repository <E, I>{
    void save(E entity);
    E findById(I id);

    void delete(E entity);

    void delete(I group_id, I age);

}
