package ru.skillfactorydemo.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactorydemo.telegrambot.entity.Spend;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}