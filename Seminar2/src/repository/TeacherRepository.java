package repository;

import data.Teacher;

public class TeacherRepository implements UserRepository<Teacher, Integer>{

    @Override
    public void save(Teacher entity) { }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Teacher entity) {
    }

    @Override
    public void delete(Integer group_id, Integer age) {

    }

    @Override
    public Teacher findByFio(String fio) {
        return null;
    }
}
