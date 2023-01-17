package repository;

public interface Repository <E, I>{
    E save(E entity);
    E findById(I id);

    E delete(E entity);

    E delete(I group_id, I age);
}
