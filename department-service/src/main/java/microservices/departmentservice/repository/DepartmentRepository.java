package microservices.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}
