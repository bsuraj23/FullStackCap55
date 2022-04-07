package abcd.demoabcd.repository;


import abcd.demoabcd.tables.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowsRepository extends JpaRepository<Shows,Long> {


    Optional<Shows> findBySlotNo(Long SlotNo);





    boolean existsSlotNo(long slotNo);
}
