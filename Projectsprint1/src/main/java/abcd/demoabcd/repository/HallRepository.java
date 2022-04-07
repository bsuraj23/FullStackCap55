package abcd.demoabcd.repository;


import abcd.demoabcd.tables.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends JpaRepository<Hall,Long> {
}

