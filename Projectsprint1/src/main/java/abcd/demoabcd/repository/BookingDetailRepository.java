package abcd.demoabcd.repository;

import abcd.demoabcd.tables.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailRepository extends JpaRepository<BookingDetail,Long> {
}
