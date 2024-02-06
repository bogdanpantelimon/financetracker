package ptm.financetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptm.financetracker.model.FinanceRecord;

@Repository
public interface FinanceRecordRepository extends JpaRepository<FinanceRecord, Long> {
}
