package repository;


import data.StudentGroup;

public class GroupRepository implements Repository<StudentGroup, Integer> {
    @Override
    public void save(StudentGroup entity) {

    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }

    @Override
    public void delete(StudentGroup entity) {
    }

    @Override
    public void delete(Integer group_id, Integer age) {

    }
}
