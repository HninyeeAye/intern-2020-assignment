package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TeacherEntity;


@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
	@Query(value="Select t from TeacherEntity t where t.name like concat('%',concat(?1,'%'))"
                  +"and t.phoneNo like concat('%',concat(?2,'%'))")
	List<TeacherEntity> searchEntity(String teacherName,String teacherPhone);

}
