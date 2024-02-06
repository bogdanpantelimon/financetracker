package ptm.financetracker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ptm.financetracker.model.FinanceRecord;
import ptm.financetracker.service.FinanceRecordService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FinanceRecordController {

    @Autowired
    private final FinanceRecordService financeRecordService;

    @Autowired
    public FinanceRecordController(FinanceRecordService financeRecordService){
        this.financeRecordService = financeRecordService;
    }

    @GetMapping("/getAllRecords")
    public List<FinanceRecord> getAllRecords() {
        return financeRecordService.getAllFinanceRecords();
    }

    @PostMapping("/createRecord")
    public ResponseEntity<FinanceRecord> saveRecord(@RequestBody FinanceRecord financeRecord){
        FinanceRecord newFinanceRecord = financeRecordService.saveRecord(financeRecord);
        return ResponseEntity.ok(newFinanceRecord);
    }

    @DeleteMapping("/deleteRecord/{id}")
    public void deleteRecord(@PathVariable Long id){
        financeRecordService.deleteFinanceRecord(id);
    }

    @DeleteMapping("/deleteAllRecords")
    public void deleteAllRecords(){
        financeRecordService.deleteAllFinanceRecords();
    }
}
