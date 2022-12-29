package controller;

public interface ControllerInterface<U, G> {
    U save(U entity);
    U findById(G id);
}
