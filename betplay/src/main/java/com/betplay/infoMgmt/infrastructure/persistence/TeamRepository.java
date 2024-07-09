package com.betplay.infoMgmt.infrastructure.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.betplay.infoMgmt.domain.entity.Team;
import com.betplay.infoMgmt.domain.service.TeamService;
import com.betplay.infoMgmt.infrastructure.config.DatabaseTeamConfig;

public class TeamRepository implements TeamService {
    @Override
    public void createTeam(Team team) {
        String sql = "INSERT INTO Teams (name, city, stadium, coach) VALUES (?, ?, ?, ?)";

        try(Connection connection = DatabaseTeamConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, team.getName());
                statement.setString(2, team.getCity());
                statement.setString(3, team.getStadium());
                statement.setString(4, team.getCoach());
                statement.executeUpdate();

                try(ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if(generatedKeys.next()) {
                        team.setId(generatedKeys.getLong(1));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        
        }
}
