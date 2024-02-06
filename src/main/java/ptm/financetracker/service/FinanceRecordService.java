package ptm.financetracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptm.financetracker.model.FinanceRecord;
import ptm.financetracker.repository.FinanceRecordRepository;

import java.util.List;

@Service
public class FinanceRecordService {

    @Autowired
    private FinanceRecordRepository financeRecordRepository;

    @Autowired
    public FinanceRecordService(FinanceRecordRepository financeRecordRepository) {
        this.financeRecordRepository = financeRecordRepository;
    }

    //Save FinanceRecord
    public FinanceRecord saveRecord(FinanceRecord financeRecord) {
        FinanceRecord newFinanceRecord = financeRecordRepository.save(financeRecord);
        return newFinanceRecord;
    }

    //Get all FinanceRecords
    public List<FinanceRecord> getAllFinanceRecords(){
        return financeRecordRepository.findAll();
    }

    //Delete FinanceRecord
    public String deleteFinanceRecord(Long id){
         financeRecordRepository.deleteById(id);
         return "Record deleted";
    }

    //Delete all FinanceRecords
    public String deleteAllFinanceRecords(){
        financeRecordRepository.deleteAll();
        return "All Records Deleted";
    }

}
