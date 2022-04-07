package abcd.demoabcd.repository;


import abcd.demoabcd.tables.HallCapacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallCapacityRepository extends JpaRepository<HallCapacity,Long> {
}
