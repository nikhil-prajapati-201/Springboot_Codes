package com.finance.dashboard.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.finance.dashboard.dto.TransactionRequest;
import com.finance.dashboard.entity.Transaction;
import com.finance.dashboard.repository.TransactionRepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionService {

//	@Autowired
    private final TransactionRepository repo;

    public Transaction create(TransactionRequest req) {
        Transaction t = Transaction.builder()
                .amount(req.getAmount())
                .type(req.getType().toUpperCase())
                .category(req.getCategory())
                .date(req.getDate())
                .notes(req.getNotes())
                .deleted(false)
                .build();
        return repo.save(t);
    }

    public List<Transaction> getAll(String type, String category, LocalDate start, LocalDate end) {
        if (type != null) return repo.findByDeletedFalseAndType(type.toUpperCase());
        if (category != null) return repo.findByDeletedFalseAndCategory(category);
        if (start != null && end != null) return repo.findByDeletedFalseAndDateBetween(start, end);
        return repo.findByDeletedFalse();
    }

    public void softDelete(Long id) {
        Transaction t = getById(id);
        t.setDeleted(true);
        repo.save(t);
    }

	public Transaction getById(Long id) {
		 return (Transaction) repo.findById(id)
	                .filter(t -> !((Transaction) t).isDeleted())
	                .orElseThrow(() -> new RuntimeException("Transaction not found"));
	}

	public Transaction update(Long id, @Valid TransactionRequest req) {
		Transaction t = getById(id);
        t.setAmount(req.getAmount());
        t.setType(req.getType().toUpperCase());
        t.setCategory(req.getCategory());
        t.setDate(req.getDate());
        t.setNotes(req.getNotes());
        return repo.save(t);
	}
}