package repository;


import data.StudentGroup;

public class GroupRepository implements Repository<StudentGroup, Integer> {
    @Override
    public StudentGroup save(StudentGroup entity) {
        return null;
    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }

    @Override
    public StudentGroup delete(StudentGroup entity) {
        return null;
    }

    @Override
    public StudentGroup delete(Integer group_id, Integer age) {
        return null;
    }
}
