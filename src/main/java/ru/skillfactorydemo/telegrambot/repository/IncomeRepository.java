package ru.skillfactorydemo.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactorydemo.telegrambot.entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}