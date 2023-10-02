package com.meenrock.demo.api.service;

import com.meenrock.demo.api.model.Food;
import com.meenrock.demo.api.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;

public class DatabaseService {

    @Autowired
    private final JdbcTemplate jdbc_template;

    public DatabaseService(JdbcTemplate jdbcTemplate) {
        this.jdbc_template = jdbcTemplate;
    }

    public List<Map<String, Object>> executeSelectQuery(String sql) {
        return jdbc_template.queryForList(sql);
    }

    public int saveFood(Food food) {
        return jdbc_template.update("", new Object[] {

        });
    }

}
