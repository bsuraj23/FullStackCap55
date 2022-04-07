package abcd.demoabcd.repository;

import abcd.demoabcd.tables.BookingDetail;
import abcd.demoabcd.tables.SeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatTypeRepository extends JpaRepository<SeatType,Long> {
}
